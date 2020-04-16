package de.dc.minion.model.desk.controller;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.dc.minion.fx.model.EmfCommand;
import de.dc.minion.fx.model.MinionFactory;
import de.dc.minion.model.common.IEmfManager;
import de.dc.minion.model.common.control.IEmfEditorPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.desk.module.MinionPlatform;
import de.dc.minion.model.desk.util.EAttributeFormSwitch;
import de.dc.minion.model.desk.util.EmfUtil;
import de.dc.minion.model.desk.util.UIConstants;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Tooltip;
import javafx.scene.control.TreeItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

public abstract class EmfDetailedTreeView<T> extends SplitPane
		implements ChangeListener<TreeItem<Object>>, IEmfEditorPart<T> {

	private EditingDomain editingDomain;

	private Map<EAttribute, TextField> eattributeUIMap = new HashMap<>();
	private Map<EAttribute, Node> childEattributesMap = new HashMap<>();
	private Map<TextField, EAttribute> childTabEattributesMap = new HashMap<>();

	private static final String EDITED_STYLE = "-fx-background-color: red; -fx-text-fill: white;";
	protected EmfModelTreeView<T> treeView;
	private EAttributeFormSwitch formSwitch;
	private EAttributeFormSwitch formChildSwitch;
	protected BooleanProperty isDirtyProperty = new SimpleBooleanProperty(false);
	
	@FXML Label labelTooltip;
	@FXML ToolBar emModelTreeViewToolbar;
	@FXML HBox toolbar;
	@FXML SplitPane root;
	@FXML SplitPane splitpaneForm;
    @FXML BorderPane emfModelTreeViewContainer;
    @FXML VBox attributeContainer;
    @FXML VBox childAttributeContainer;

	public EmfDetailedTreeView() {
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("/de/dc/minion/model/desk/control/EmfDetailedTreeView.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}

		treeView = initEmfModelTreeView();
		treeView.getTreeView().getSelectionModel().selectedItemProperty().addListener(this);
		
		editingDomain = treeView.getEmfManager().getEditingDomain();

		emfModelTreeViewContainer.setCenter(treeView);
	}

	@Override
	public void hideDetailedForm(boolean hide) {
		if (hide) {
			root.getItems().remove(splitpaneForm);
		}else {
			int size = root.getItems().size();
			if (size==1) {
				root.getItems().add(splitpaneForm);
			}
		}
	}
	
	@Override
	public IEmfManager<T> getEmfManager() {
		return treeView.getEmfManager();
	}
	
	public EmfModelTreeView<T> getTreeView() {
		return treeView;
	}

	protected void addToToolbar(Node node) {
		toolbar.getChildren().add(node);
	}

	protected abstract EmfModelTreeView<T> initEmfModelTreeView();

	@Override
	public void changed(ObservableValue<? extends TreeItem<Object>> observable, TreeItem<Object> oldValue,
			TreeItem<Object> newValue) {
		if (newValue != null) {
			Object value = newValue.getValue();
			if (value instanceof EObject) {
				clearAllFields();
				EObject eObject = (EObject) value;

				initAttributeFormular(eObject);
				initChildPropertiesToolbar(eObject);
				initTableContent(newValue, value, eObject);
			}
		}
	}

	
	
	private void initChildPropertiesToolbar(EObject eObject) {
		IEmfManager<T> manager = treeView.getEmfManager();
		Collection<?> collection = editingDomain.getNewChildDescriptors(eObject, null);
		emModelTreeViewToolbar.getItems().clear();
		for (Object object : collection) {
			if (object instanceof CommandParameter) {
				CommandParameter commandParameter = (CommandParameter) object;
				Object param = commandParameter.getValue();
				String name = param.getClass().getSimpleName().replace("Impl", "");
				String menuText = manager.getLabelProvider(param).getText(param);
				Object icon = manager.getLabelProvider(param).getImage(param);

				Button button = new Button();
				button.setTooltip(new Tooltip(menuText));
				button.setGraphic(new ImageView(new Image(((URL) icon).toExternalForm())));
				button.setOnMouseEntered(e-> labelTooltip.setText("Create new "+menuText));
				button.setOnAction(event -> executeAddCommand(eObject, name));
				emModelTreeViewToolbar.getItems().add(button);
			}
		}
	}

	@Override
	public Object executeAddCommand(EObject instanceObject, String className) {
		EClassifier eClassifier = getEmfManager().getModelPackage().getEClassifier(className);
		EObject createdObj = getEmfManager().getExtendedModelFactory().create((EClass) eClassifier);
		
		int id = EmfUtil.getValueByName(getEmfManager().getModelPackage(), className);
		Command command = AddCommand.create(editingDomain, instanceObject, id, createdObj);
		command.execute();

		// TODO: Event command stack refresh
		EmfCommand emfCommand = MinionFactory.eINSTANCE.createEmfCommand();
		emfCommand.setTimestamp(LocalDateTime.now());
		emfCommand.setCommand(command);
		emfCommand.setName(command.getLabel());
		emfCommand.setDescription(command.getDescription());

		MinionPlatform.getInstance(IEventBroker.class)
				.post(new EventContext<>(UIConstants.UPDATE_COMMAND_HISTORY.name(), emfCommand));
		treeView.getTreeView().getSelectionModel().getSelectedItem().setExpanded(true);

		ObservableList<TreeItem<Object>> children = treeView.getTreeView().getSelectionModel()
				.getSelectedItem().getChildren();
		treeView.getTreeView().getSelectionModel().select(children.get(children.size() - 1));
		return createdObj;		
	}
	
	private void initTableContent(TreeItem<Object> newValue, Object value, EObject eObject) {
		IEmfManager<T> manager = treeView.getEmfManager();
		Collection<?> collection = editingDomain.getNewChildDescriptors(eObject, null);
		boolean showTableContainer = collection.size() == 1;
		if (showTableContainer) {
			Object object = collection.iterator().next();
			if (object instanceof CommandParameter) {
				CommandParameter param = (CommandParameter) object;
				EObject child = (EObject) param.getValue();
				
				formChildSwitch = new EAttributeFormSwitch(editingDomain, child);
				
				child.eClass().getEAllAttributes().forEach(e -> {
					Node node = formChildSwitch.doSwitch(e);
					if (node instanceof TextField) {
						TextField t = (TextField) node;
						t.setPrefWidth(400);
						childEattributesMap.put(e, (TextField) node);
					}else if (node instanceof DatePicker) {
						DatePicker p = (DatePicker) node;
						p.setValue(LocalDate.now());
						childEattributesMap.put(e, node);
					}
					if (node!=null) {
						HBox hbox = new HBox(5);
						Label label = new Label(e.getName()+":");
						label.setPrefWidth(100);
						hbox.getChildren().add(label);
						hbox.getChildren().add(node);
						childAttributeContainer.getChildren().add(hbox);
					}
				});
				String name = param.getValue().getClass().getSimpleName().replace("Impl", "");

				Button addChildButton = new Button("Create new "+name);
				addChildButton.setOnAction(e -> {

					EClassifier eClassifier = treeView.getEmfManager().getModelPackage().getEClassifier(name);
					EObject obj = treeView.getEmfManager().getExtendedModelFactory().create((EClass) eClassifier);

					int id = EmfUtil.getValueByName(manager.getModelPackage(), name);
					EObject createdObject = manager.getExtendedModelFactory().create(obj.eClass());
					childEattributesMap.entrySet().forEach(ks -> {
						Node control = ks.getValue();
						String typeName = ks.getKey().getEType().getName();
						if (control instanceof TextField) {
							TextField textfield = (TextField) control;
							if (textfield.getStyle().equals(EDITED_STYLE)) {
								if (typeName.contains("Double")) {
									createdObject.eSet(ks.getKey(), Double.parseDouble(textfield.getText()));
								} else if (typeName.contains("Integer")) {
									createdObject.eSet(ks.getKey(), Integer.parseInt(textfield.getText()));
								} else {
									createdObject.eSet(ks.getKey(), textfield.getText());
								}
								textfield.setText("");
								textfield.setStyle(null);
							}
						}else if (control instanceof DatePicker) {
							if (typeName.contains("Date")) {
								DatePicker picker = (DatePicker) control;
								LocalDate dateValue = picker.getValue();
								if (dateValue!=null) {
									Instant instant = dateValue.atStartOfDay(ZoneId.systemDefault()).toInstant();
									createdObject.eSet(ks.getKey(),Date.from( instant));
								}
							}
						}
					});
					Command command = AddCommand.create(editingDomain, value, id, createdObject);
					executeCommand(command);

					newValue.setExpanded(true);
				});
				childAttributeContainer.getChildren().add(addChildButton);
			}
		}else {
			TabPane tabPane = new TabPane();
			collection.forEach(c->{
				if (c instanceof CommandParameter) {
					CommandParameter param = (CommandParameter) c;
					String tabName = manager.getLabelProvider(param.getValue()).getText(param.getValue());
					Object icon = manager.getLabelProvider(param.getValue()).getImage(param.getValue());

					EObject child = (EObject) param.getValue();
					VBox vbox = new VBox(5);
					vbox.setPadding(new Insets(10));
					child.eClass().getEAllAttributes().forEach(e -> {
						HBox hbox = new HBox(5);
						Label label = new Label(e.getName()+":");
						label.setPrefWidth(100);
						hbox.getChildren().add(label);
						TextField textField = new TextField();
						textField.setAccessibleHelp(tabName);
						textField.setPromptText(e.getName());
						textField.setOnKeyPressed(event -> textField.setStyle(EDITED_STYLE));
						HBox.setHgrow(textField, Priority.ALWAYS);
						hbox.getChildren().add(textField);
						vbox.getChildren().add(hbox);
						childTabEattributesMap.put(textField, e);
					});
					
					String name = param.getValue().getClass().getSimpleName().replace("Impl", "");

					Button addChildButton = new Button("Create new "+name);
					addChildButton.setOnAction(e -> {
						IEmfManager<T> emfManager = treeView.getEmfManager();

						EClassifier eClassifier = treeView.getEmfManager().getModelPackage().getEClassifier(name);
						EObject obj = treeView.getEmfManager().getExtendedModelFactory().create((EClass) eClassifier);

						int id = EmfUtil.getValueByName(emfManager.getModelPackage(), name);
						EObject createdObject = emfManager.getExtendedModelFactory().create(obj.eClass());
						
						Tab selectedTab = tabPane.getSelectionModel().getSelectedItem();
						
						childTabEattributesMap.entrySet().forEach(ks -> {
							TextField textfield = ks.getKey();
							if (textfield.getAccessibleHelp().contains(selectedTab.getText())) {
								if (textfield.getStyle().equals(EDITED_STYLE)) {
									EAttribute attributeName = ks.getValue();
									String typeName = attributeName.getEType().getName();
									if (typeName.contains("Double") || typeName.contains("double")) {
										createdObject.eSet(attributeName, Double.parseDouble(textfield.getText()));
									} else if (typeName.contains("Integer") || typeName.contains("Int")) {
										createdObject.eSet(attributeName, Integer.parseInt(textfield.getText()));
									} else if (typeName.contains("Boolean") || typeName.contains("boolean")) {
										createdObject.eSet(attributeName, Boolean.parseBoolean(textfield.getText()));
									} else {
										createdObject.eSet(attributeName, textfield.getText());
									}
									textfield.setText("");
									textfield.setStyle(null);
								}
							}
						});
						Command command = AddCommand.create(editingDomain, value, id, createdObject);
						executeCommand(command);

						newValue.setExpanded(true);
					});
					
					vbox.getChildren().add(addChildButton);
					
					Tab tab = new Tab(tabName);
					tab.setGraphic(new ImageView(new Image(((URL) icon).toExternalForm())));
					tab.setClosable(false);
					tab.setContent(vbox);
					tabPane.getTabs().add(tab);
				}
			});
			childAttributeContainer.getChildren().add(tabPane);
		}
	}

	private void initAttributeFormular(EObject eObject) {
		EList<EAttribute> attributes = eObject.eClass().getEAllAttributes();
		
		EList<EReference> eAllReferences = eObject.eClass().getEReferences();
		formSwitch = new EAttributeFormSwitch(editingDomain, eObject);
		for (EAttribute eAttribute : attributes) {
			HBox hbox = new HBox(5.0);
			Label label = new Label(eAttribute.getName());
			label.setPrefWidth(100);
			hbox.getChildren().add(label);

			Node node = formSwitch.doSwitch(eAttribute);
			if (node instanceof TextField) {
				eattributeUIMap.put(eAttribute, (TextField) node);
			}
			if (node == null) {
				continue;
			}
			hbox.getChildren().add(node);
			attributeContainer.getChildren().add(hbox);
		}
		
		for (EReference eReference : eAllReferences) {
			HBox hbox = new HBox(5.0);
			Label label = new Label(eReference.getName());
			label.setPrefWidth(100);
			hbox.getChildren().add(label);

			IEmfManager<T> manager = treeView.getEmfManager();

			ListView listView = new ListView<>();
			listView.setCellFactory(new Callback<ListView<EObject>, ListCell<EObject>>() {
					@Override
					public ListCell<EObject> call(ListView<EObject> param) {
						return new ListCell<EObject>() {
							@Override
							protected void updateItem(EObject item, boolean empty) {
								super.updateItem(item, empty);
								if (item==null || empty) {
									setText(null);
								}else {
									setText(treeView.getEmfManager().getLabelProvider(item).getText(item));
								}
							}
						};
					}
			});
			try {
				Object result = eObject.getClass().getDeclaredMethod("get"+StringUtils.capitalise(eReference.getName()), null).invoke(eObject, null);
				if (result instanceof EObjectContainmentEList) {
					EObjectContainmentEList eList= (EObjectContainmentEList) result;
					listView.setItems(FXCollections.observableArrayList(eList));
				}
			} catch (NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			IItemPropertySource source = (IItemPropertySource) manager.getModelItemProviderAdapterFactory().adapt(eObject, IItemPropertySource.class);
//			List<IItemPropertyDescriptor> propertyDescriptors = source.getPropertyDescriptors(eObject);
//			for (IItemPropertyDescriptor d : propertyDescriptors) {
//				if (d.isSortChoices(eObject)) {
//				}
//			}
			listView.setPrefHeight(100);
			hbox.getChildren().add(listView);
			Button buttonn = new Button("Add");
			buttonn.setOnMouseClicked(e1->{
				
			});
			hbox.getChildren().add(buttonn);
			attributeContainer.getChildren().add(hbox);
		}
		
		Button acceptAllButton = new Button("Accept All");
		acceptAllButton.setOnAction(event -> {
			eattributeUIMap.entrySet().stream().forEach(e -> {
				if (e.getValue().getStyle().equals(EDITED_STYLE)) {
					setValue(eObject, e.getKey(), e.getValue());
				}
			});
		});
		attributeContainer.getChildren().add(acceptAllButton);
	}

	private void setValue(EObject eObject, EAttribute eAttribute, TextField textField) {
		Command command = null;
		if (eAttribute.getEType().getName().contains("Double")) {
			command = new SetCommand(editingDomain, eObject, eAttribute, Double.parseDouble(textField.getText()));
		} else if (eAttribute.getEType().getName().contains("Integer")
				|| eAttribute.getEType().getName().contains("Int")) {
			command = new SetCommand(editingDomain, eObject, eAttribute, Integer.parseInt(textField.getText()));
		} else {
			command = new SetCommand(editingDomain, eObject, eAttribute, textField.getText());
		}
		executeCommand(command);
		textField.setStyle(null);
	}

	private void clearAllFields() {
		attributeContainer.getChildren().clear();
		eattributeUIMap.clear();
		childAttributeContainer.getChildren().clear();
		childEattributesMap.clear();
	}

	private void executeCommand(Command command) {
		editingDomain.getCommandStack().execute(command);

		EmfCommand emfCommand = MinionFactory.eINSTANCE.createEmfCommand();
		emfCommand.setTimestamp(LocalDateTime.now());
		emfCommand.setCommand(command);
		emfCommand.setName(command.getLabel());
		emfCommand.setDescription(command.getDescription());

		MinionPlatform.getInstance(IEventBroker.class)
				.post(new EventContext<>(UIConstants.UPDATE_COMMAND_HISTORY.name(), emfCommand));

		Object value = treeView.getTreeView().getSelectionModel().getSelectedItem().getValue();
		MinionPlatform.getInstance(IEventBroker.class).post(new EventContext<>("chartfx.update", value));
	}

	@Override
	public String getExtension() {
		return treeView.getEmfManager().getModelPackage().getName();
	}

	@Override
	public void save(File file) {
		treeView.save(file);
	}

	@Override
	public T load(File file) {
		return treeView.load(file);
	}
}

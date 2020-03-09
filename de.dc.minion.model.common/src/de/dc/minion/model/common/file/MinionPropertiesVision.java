package de.dc.minion.model.common.file;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.common.event.ISelectionService;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class MinionPropertiesVision extends EmfViewPart{

	@Inject IEventBroker eventBroker;
	@Inject ISelectionService selectionService;
	
	private ObservableList<EAttribute> properties = FXCollections.observableArrayList();
	private EObject cuurentSelection;
	private EditingDomain currentEditingDomain;
	private TableView<EAttribute> tableView;
	
	@Override
	public Parent create() {
		ObservableList<EAttribute> files = FXCollections.observableArrayList();
		FilteredList<EAttribute> filteredFiles = new FilteredList<>(files);
		
		VBox vbox = new VBox();
		
		tableView = new TableView<>();
		TableColumn<EAttribute, String> propertyColumn = new TableColumn<>("Property");
		TableColumn<EAttribute, String> valueColumn = new TableColumn<>("Value");

		propertyColumn.setPrefWidth(200);
		valueColumn.setPrefWidth(400);
		
		propertyColumn.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getName()));
		valueColumn.setCellFactory(TextFieldTableCell.<EAttribute>forTableColumn());
		valueColumn.setOnEditCommit(evt -> {
			if(currentEditingDomain!=null) {
				EAttribute selectedAttribute = tableView.getSelectionModel().getSelectedItem();
				Object value = EcoreUtil.createFromString(selectedAttribute.getEAttributeType(), evt.getNewValue());
				SetCommand command = new SetCommand(currentEditingDomain, cuurentSelection, selectedAttribute, value);
				currentEditingDomain.getCommandStack().execute(command);
				
//				eventBroker.post(new EventContext<>(EventTopic.COMMAND_STACK_REFRESH, CommandFactory.create(command)));
			}
		});
		valueColumn.setCellValueFactory(param ->{ 
			if (cuurentSelection==null || param.getValue()==null) {
				return new SimpleStringProperty("");
			}
			return new SimpleStringProperty(cuurentSelection.eGet(param.getValue())+"");
		});

		tableView.getColumns().add(propertyColumn);
		tableView.getColumns().add(valueColumn);

		tableView.setItems(properties);
		tableView.setEditable(true);
		
		TextField textSearch = new TextField();
		textSearch.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (newValue!=null) {
					filteredFiles.setPredicate(p->{
						boolean isEmpty = p.getName().isEmpty();
						boolean containsName = p.getName().toLowerCase().contains(newValue.toLowerCase());
						return isEmpty || containsName;
					});
				}
			}
		});
		
		vbox.getChildren().add(textSearch);
		VBox.setVgrow(tableView, Priority.ALWAYS);
		vbox.getChildren().add(tableView);
		return vbox;
	}
	
	@Override
	public void initialize() {
		eventBroker.register(this);
	}
	
	@Subscribe
	private void updateProperties(EventContext<?> context) {
		if (context.getEventId().equals("property.selection")) {
			if (context.getInput() != null) {
				currentEditingDomain= selectionService.getEmfManager().get().getEditingDomain();
				Object object = context.getInput();
				if (object instanceof EObject) {
					properties.clear();
					cuurentSelection = (EObject) object;
					for (EAttribute attr : cuurentSelection.eClass().getEAllAttributes()) {
						properties.add(attr);
					}
					tableView.setItems(properties);
				}
			}
		}
	}

}

package de.dc.minion.model.addon.snapshot.component;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import com.google.inject.Inject;

import de.dc.minion.model.addon.snapshot.FXEffect;
import de.dc.minion.model.addon.snapshot.Layer;
import de.dc.minion.model.addon.snapshot.ShadowEffect;
import de.dc.minion.model.addon.snapshot.SnapshotFactory;
import de.dc.minion.model.addon.snapshot.SnapshotPackage;
import de.dc.minion.model.addon.snapshot.component.controller.BaseBindingSnapshotLayerController;
import de.dc.minion.model.common.IEmfManager;
import de.dc.minion.model.common.event.ISelectionService;
import de.dc.minion.model.common.file.IEmfFileManager;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TreeItem;
import javafx.scene.effect.Effect;

public class SnapshotLayerView extends BaseBindingSnapshotLayerController {

	@Inject
	ISelectionService selectionService;
	@Inject
	IEmfFileManager fileManager;

	private ObservableList<Layer> layers = FXCollections.observableArrayList();

	public SnapshotLayerView() {
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("/de/dc/minion/model/addons/snapshot/ui/SnapshotLayer.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		try {
			fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initialize() {
		super.initialize();

		toolbarEffects.getItems().forEach(e -> {
			if (e instanceof Button) {
				Button button = (Button) e;
				button.setOnAction(a -> {
					String effectName = button.getText();
					IEmfManager<?> emfManager = fileManager.getActiveEditor().get().getEmfManager();
					EClassifier eClassifier = emfManager.getModelPackage().getEClassifier(effectName + "Effect");
					EObject obj = emfManager.getExtendedModelFactory().create((EClass) eClassifier);

					gridpaneEffects.getChildren().clear();
					gridpaneEffects.add(new Label(effectName), 0, 0, 2, 1);
					int rowIndex = 1;
					for (EAttribute field : obj.eClass().getEAllAttributes()) {
						if (field.getEType().getName().equals("EDouble")) {
							Slider slider = new Slider();
							slider.setAccessibleHelp(field.getName());
							Label labelValue = new Label();
							labelValue.textProperty().bind(Bindings.format("%.2f", slider.valueProperty()));
							gridpaneEffects.add(new Label(field.getName()), 0, rowIndex);
							gridpaneEffects.add(slider, 1, rowIndex);
							gridpaneEffects.add(labelValue, 2, rowIndex);
							rowIndex++;
						} else {
							Class<?> enumClass = field.getEType().getInstanceClass();
							ComboBox<Object> comboBox = new ComboBox<>();
							comboBox.setAccessibleHelp(field.getName());
							if (enumClass.isEnum()) {
								comboBox.setItems(FXCollections.observableArrayList(enumClass.getEnumConstants()));
								gridpaneEffects.add(new Label(field.getName()), 0, rowIndex);
								gridpaneEffects.add(comboBox, 1, rowIndex);
								rowIndex++;
							}
						}
					}
					Button buttonAccept = new Button("Accept");
					buttonAccept.setOnAction(s -> {
						gridpaneEffects.getChildren().forEach(child -> {
							if (child instanceof Slider) {
								Slider slider = (Slider) child;
								String fieldName = slider.getAccessibleHelp();

								try {
									Field declaredField = obj.getClass().getDeclaredField(fieldName);
									declaredField.setAccessible(true);
									declaredField.set(obj, slider.valueProperty().get());
								} catch (IllegalAccessException e1) {
									e1.printStackTrace();
								} catch (IllegalArgumentException e1) {
									e1.printStackTrace();
								} catch (NoSuchFieldException e1) {
									e1.printStackTrace();
								} catch (SecurityException e1) {
									e1.printStackTrace();
								}
							}else if (child instanceof ComboBox) {
								ComboBox slider = (ComboBox) child;
								String fieldName = slider.getAccessibleHelp();
								
								try {
									Field declaredField = obj.getClass().getDeclaredField(fieldName);
									declaredField.setAccessible(true);
									declaredField.set(obj, slider.valueProperty().get());
								} catch (IllegalAccessException e1) {
									e1.printStackTrace();
								} catch (IllegalArgumentException e1) {
									e1.printStackTrace();
								} catch (NoSuchFieldException e1) {
									e1.printStackTrace();
								} catch (SecurityException e1) {
									e1.printStackTrace();
								}
							}
						});
						
						selectionService.getSelection().ifPresent(selection -> {
							if (selection instanceof TreeItem) {
								TreeItem<Object> treeItem = (TreeItem) selection;
								Object value = treeItem.getValue();
								if (value instanceof Layer) {
									Layer layer = (Layer) value;
									EditingDomain editingDomain = emfManager.getEditingDomain();
									AddCommand.create(editingDomain, layer,
											SnapshotPackage.eINSTANCE.getLayer_Effects(), EcoreUtil.copy(obj))
											.execute();
								}
							}
						});
					});
					gridpaneEffects.add(buttonAccept, 2, rowIndex, 2, 1);
				});
			}
		});

		listViewLayer.setItems(layers);
	}

	@Override
	protected void onButtonAction(ActionEvent event) {
		Object source = event.getSource();
	}

	public void setItems(EList<Layer> layers) {
		this.layers.clear();
		this.layers.addAll(layers);
	}

}

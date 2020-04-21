package de.dc.minion.model.addon.snapshot.component;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import de.dc.minion.model.addon.snapshot.component.controller.BaseBindingSnapshotLayerController;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Effect;

public class SnapshotLayer extends BaseBindingSnapshotLayerController {

	public SnapshotLayer() {
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
//		toolbarEffects.getItems().forEach(node -> {
//			if (node instanceof Button) {
//				Button button = (Button) node;
//				String text = "gridpane" + button.getText();
//
//				Node gridpane = stackpaneEffects.lookup("#" + text);
//				if (gridpane != null) {
//					button.setOnAction(e -> gridpane.toFront());
//				}
//			}
//		});

		toolbarEffects.getItems().forEach(e -> {
			if (e instanceof Button) {
				Button button = (Button) e;
				button.setOnAction(a -> {
					String effectName = button.getText();
					try {
						Class<? extends Effect> effect = (Class<? extends Effect>) Class
								.forName("javafx.scene.effect." + effectName);
						gridpaneEffects.getChildren().clear();
						gridpaneEffects.add(new Label(effect.getSimpleName()), 0, 0, 2, 1);
						int rowIndex = 1;
						for (Field field : effect.getDeclaredFields()) {
							if (field.getType().isAssignableFrom(DoubleProperty.class)) {
								Slider slider = new Slider();
								slider.setAccessibleHelp(field.getName());
								Label labelValue = new Label();
								labelValue.textProperty().bind(Bindings.format("%.2f", slider.valueProperty()));
								gridpaneEffects.add(new Label(field.getName()), 0, rowIndex);
								gridpaneEffects.add(slider, 1, rowIndex);
								gridpaneEffects.add(labelValue, 2, rowIndex);
								rowIndex++;
							} else if (field.getType().isAssignableFrom(ObjectProperty.class)) {
								Type genericType = field.getGenericType();
								if (genericType instanceof ParameterizedType) {
									ParameterizedType parameterType = (ParameterizedType) genericType;
									Type[] typeArguments = parameterType.getActualTypeArguments();
									for (Type type : typeArguments) {
										ComboBox<Object> comboBox = new ComboBox<>();
										Class<?> enumClass = Class.forName(type.getTypeName());
										if (enumClass.isEnum()) {
											comboBox.setItems(FXCollections.observableArrayList(enumClass.getEnumConstants()));
										}
										gridpaneEffects.add(new Label(field.getName()), 0, rowIndex);
										gridpaneEffects.add(comboBox, 1, rowIndex);
										rowIndex++;
									}
								}
							}
						}
						Button buttonAccept = new Button("Accept");
						buttonAccept.setOnAction(s -> {
							try {
								Effect newEffect = effect.newInstance();
								gridpaneEffects.getChildren().forEach(child -> {
									if (child instanceof Slider) {
										Slider slider = (Slider) child;
										String fieldName = slider.getAccessibleHelp();

										try {
											Field declaredField = newEffect.getClass().getDeclaredField(fieldName);
											declaredField.setAccessible(true);
											declaredField.set(newEffect, slider.valueProperty());
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
								System.out.println(newEffect);
							} catch (InstantiationException | IllegalAccessException e2) {
								e2.printStackTrace();
							}
						});
						gridpaneEffects.add(buttonAccept, 2, rowIndex, 2, 1);
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					}
				});
			}
		});

		bindSliderValuesToLabelText(true);
	}

	@Override
	protected void onButtonAction(ActionEvent event) {
		Object source = event.getSource();
	}

}

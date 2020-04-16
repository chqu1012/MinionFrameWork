package de.dc.minion.model.addon.snapshot.renderer;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.dc.minion.model.desk.control.internal.EmfComboBox;
import javafx.collections.FXCollections;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;

public class SnapshotFormRenderer extends EcoreSwitch<Node>{

	protected static final String EDITED_STYLE = "-fx-background-color: red; -fx-text-fill: white;";

	protected EObject instanceObject;
	protected EAttribute currentAttribute;
	protected EditingDomain editingDomain;

	public SnapshotFormRenderer(EditingDomain editingDomain, EObject instanceObject) {
		this.editingDomain = editingDomain;
		this.instanceObject = instanceObject;
	}
	
	@Override
	public Node caseEClassifier(EClassifier object) {
		VBox node = new VBox(3);
		
		EList<EAttribute> eAttributes = object.eClass().getEAttributes();
		for (EAttribute eAttribute : eAttributes) {
			Node child = caseEAttribute(eAttribute);
			node.getChildren().add(child);
		}
//		String name = object.getName();
//		Object attributeValue = instanceObject.eGet(currentAttribute);
		return node;
	}
	
	@Override
	public Node caseEAttribute(EAttribute object) {
		String name = object.getName();
		String value = object == null ? "" : object.toString();
		Slider node = null;
		if (name.equals("EIntegerObject") || name.equals("EInteger") || name.equals("EInt")) {
			node = new Slider();
		} else if (name.equals("EString")) {
			node = new Slider();
		} else if (name.equals("EDate")) {
			DatePicker datePicker = new DatePicker();
			datePicker.setPrefWidth(200);
			Object instanceValue = instanceObject.eGet(currentAttribute);
			if (instanceValue!=null) {
				Date date = (Date) instanceValue;
				datePicker.setValue(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
			}
			datePicker.setOnAction(e->{
				LocalDate val = datePicker.getValue();
				if (val!=null) {
					setValue(instanceObject, currentAttribute, Date.from(val.atStartOfDay(ZoneId.systemDefault()).toInstant()));
				}
			});
			return datePicker;
		} else if (name.equals("Date")) {
			DatePicker datePicker = new DatePicker();
			datePicker.setPrefWidth(200);
			Object instanceValue = instanceObject.eGet(currentAttribute);
			if (instanceValue!=null) {
				Date date = (Date) instanceValue;
				LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				datePicker.setValue(localDate);
			}
			datePicker.setOnAction(e->{
				LocalDate val = datePicker.getValue();
				if (val!=null) {
					setValue(instanceObject, currentAttribute, val);
				}
			});
			return datePicker;
		} else if (name.equals("EFloat")) {
			node = new Slider();
		} else if (name.equals("EDoubleObject") || name.equals("EDouble")) {
			node = new Slider();
		} else if (name.equals("EBoolean")) {
			EmfComboBox<Boolean> combobox = new EmfComboBox<>(currentAttribute);
			combobox.setItems(FXCollections.observableArrayList(true, false));
			combobox.addListener(e -> setValue(instanceObject, combobox.getEAttribute(), e));
			return combobox;
		}

		if (node != null) {
			node.setPrefWidth(400);
//			node.setText(value);
//			node.setPromptText(currentAttribute.getName());
			node.setOnKeyPressed(event -> {
				TextField textField = (TextField) event.getSource();
				KeyCode code = event.getCode();
				if (code == KeyCode.ENTER) {
					setValue(instanceObject, currentAttribute, textField.getText());
				} else {
					textField.setStyle(EDITED_STYLE);
				}
			});
		}
		return node;
	}
	
	protected void setValue(EObject eObject, EAttribute eAttribute, Object value) {
		Command command = new SetCommand(editingDomain, eObject, eAttribute, value);
		editingDomain.getCommandStack().execute(command);
	}
}

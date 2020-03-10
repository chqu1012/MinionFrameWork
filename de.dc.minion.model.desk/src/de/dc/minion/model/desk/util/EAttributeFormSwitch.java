package de.dc.minion.model.desk.util;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.dc.minion.model.desk.control.internal.EmfComboBox;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

public class EAttributeFormSwitch extends EcoreSwitch<Node> {

	private static final String EDITED_STYLE = "-fx-background-color: red; -fx-text-fill: white;";

	private EObject instanceObject;
	private EAttribute currentAttribute;
	private EditingDomain editingDomain;

	public EAttributeFormSwitch(EditingDomain editingDomain, EObject instanceObject) {
		this.editingDomain = editingDomain;
		this.instanceObject = instanceObject;
	}

	@Override
	public Node caseEAttribute(EAttribute object) {
		this.currentAttribute = object;
		return doSwitch(object.getEType());
	}

	@Override
	public Node caseEClassifier(EClassifier object) {
		String name = object.getName();
		Object attributeValue = instanceObject.eGet(currentAttribute);
		TextField node = null;
		if (name.equals("EInteger")) {
			node = new TextField();
		} else if (name.equals("EString")) {
			node = new TextField();
		} else if (name.equals("EDate")) {
			DatePicker datePicker = new DatePicker();
			datePicker.setMinWidth(200);
			datePicker.setOnAction(e-> setValue(instanceObject, currentAttribute, datePicker.getValue()));
			return datePicker;
		} else if (name.equals("EFloat")) {
			node = new TextField();
		} else if (name.equals("EDouble")) {
			node = new TextField();
		} else if (name.equals("EBoolean")) {
			EmfComboBox<Boolean> combobox = new EmfComboBox<>(currentAttribute);
			combobox.setItems(FXCollections.observableArrayList(true, false));
			combobox.select((Boolean) attributeValue);
			combobox.addListener(e -> setValue(instanceObject, combobox.getEAttribute(), e));
			return combobox;
		}

		if (node != null) {
			String value = attributeValue == null ? "" : attributeValue.toString();
			node.setMinWidth(200);
			node.setText(value);
			node.setPromptText(currentAttribute.getName());
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

	@Override
	public Node caseEEnum(EEnum object) {
		EEnum enumeration = (EEnum) currentAttribute.getEAttributeType();
		EList<EEnumLiteral> literals = enumeration.getELiterals();

		Object currentSelection = instanceObject.eGet(currentAttribute) == null ? literals.get(0)
				: instanceObject.eGet(currentAttribute);
		EEnumLiteral selectedLiteral = enumeration.getEEnumLiteralByLiteral(String.valueOf(currentSelection));

		ComboBox<Enumerator> enumCombo = new ComboBox<>(FXCollections.observableArrayList(literals));
		enumCombo.getSelectionModel().select(selectedLiteral.getInstance());
		enumCombo.getSelectionModel().selectedItemProperty()
				.addListener((ChangeListener<Enumerator>) (observable1, oldValue1, newValue1) -> {
					Enumerator selection = enumCombo.getSelectionModel().getSelectedItem();
					EEnumLiteral enumLiteral = enumeration.getEEnumLiteral(selection.getName());
					Command command = new SetCommand(editingDomain, instanceObject, currentAttribute,
							enumLiteral.getInstance());
					command.execute();
				});
		return enumCombo;
	}

	private void setValue(EObject eObject, EAttribute eAttribute, Object value) {
		Command command = new SetCommand(editingDomain, eObject, eAttribute, value);
		editingDomain.getCommandStack().execute(command);
	}
}

package de.dc.minion.model.desk.control.internal;

import java.util.function.Consumer;

import org.eclipse.emf.ecore.EAttribute;

import javafx.beans.value.ChangeListener;
import javafx.scene.control.ComboBox;

public class EmfComboBox<T> extends ComboBox<T>{

	private EAttribute eAttribute;
	
	public EmfComboBox(EAttribute eAttribute) {
		this.eAttribute = eAttribute;
		setMinWidth(200);
	}

	public EAttribute getEAttribute() {
		return eAttribute;
	}
	
	public void select(T input) {
		getSelectionModel().select(input);
	}
	
	public void addListener(Consumer<T> function) {
		getSelectionModel().selectedItemProperty().addListener((ChangeListener<T>) (observable, oldValue, newValue) -> {
			if (newValue!=null) {
				function.accept(newValue);
			}
		});
	}
}

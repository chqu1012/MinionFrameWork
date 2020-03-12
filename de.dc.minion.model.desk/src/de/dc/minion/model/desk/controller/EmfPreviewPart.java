package de.dc.minion.model.desk.controller;

import de.dc.minion.model.common.control.EmfViewPart;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;

public abstract class EmfPreviewPart extends EmfViewPart implements ChangeListener<Object>{

	@Override
	public Parent create() {
		return new Label();
	}

	@Override
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
		if (newValue!=null) {
			if (newValue instanceof TreeItem) {
				TreeItem item = (TreeItem) newValue;
				Object value = item.getValue();
				pane.setCenter(onChanged(value));
			}
		}
	}

	protected abstract Node onChanged(Object value);
}
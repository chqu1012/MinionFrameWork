package de.dc.minion.model.common.control;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeItem;

public abstract class EmfObservableViewPart extends EmfViewPart implements ChangeListener<Object>{

	@Override
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
		if (newValue!=null) {
			if (newValue instanceof TreeItem) {
				TreeItem<Object> treeItem = (TreeItem<Object>) newValue;
				Object value = treeItem.getValue();
				onChanged(value);
			}
		}
	}

	protected abstract void onChanged(Object value);
}

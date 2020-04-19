package de.dc.minion.model.addon.snapshot;

import de.dc.minion.model.addon.snapshot.component.SnapshotLayer;
import de.dc.minion.model.common.control.EmfViewPart;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Parent;

public class SnapshotLayerVision extends EmfViewPart implements ChangeListener<Object> {

	@Override
	public Parent create() {
		return new SnapshotLayer();
	}

	@Override
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
		// TODO Auto-generated method stub
		
	}

}

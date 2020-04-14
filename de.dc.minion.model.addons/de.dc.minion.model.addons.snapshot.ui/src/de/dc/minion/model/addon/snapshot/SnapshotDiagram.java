package de.dc.minion.model.addon.snapshot;

import org.eclipse.emf.ecore.EObject;

import de.dc.minion.model.addon.snapshot.renderer.*;
import de.dc.minion.model.common.control.EmfViewPart;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Parent;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.BorderPane;
	
public class SnapshotDiagram extends EmfViewPart implements ChangeListener<Object> {

	private SnapshotRenderer renderer;
	private BorderPane parent;
	
	@Override
	public Parent create() {
		renderer = new SnapshotRenderer();
		parent = new BorderPane();
		return parent;
	}

	@Override
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
		if (newValue != null) {
			if (newValue instanceof TreeItem) {
				TreeItem<Object> treeItem = (TreeItem<Object>) newValue;
				Object value = treeItem.getValue();
				parent.setCenter(renderer.doSwitch((EObject) value));
			}
		}
	}
}

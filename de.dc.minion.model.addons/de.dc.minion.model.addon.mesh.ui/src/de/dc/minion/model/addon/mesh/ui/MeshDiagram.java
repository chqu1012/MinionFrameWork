package de.dc.minion.model.addon.mesh.ui;

import org.eclipse.emf.ecore.EObject;

import de.dc.minion.model.addon.mesh.ui.renderer.MeshRenderer;
import de.dc.minion.model.common.control.EmfViewPart;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.TreeItem;

public class MeshDiagram extends EmfViewPart implements ChangeListener<Object> {

	private MeshRenderer renderer;

	@Override
	public Parent create() {
		renderer = new MeshRenderer();
		Group root = renderer.getRoot();
		root.getStylesheets().add(getClass().getResource("/de/dc/minion/model/desk/control/css/SelectionMode.css").toExternalForm());
		return root;
	}

	@Override
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
		if (newValue != null) {
			if (newValue instanceof TreeItem) {
				TreeItem<Object> treeItem = (TreeItem<Object>) newValue;
				Object value = treeItem.getValue();
				renderer.clear();
				renderer.doSwitch((EObject) value);
			}
		}
	}

}

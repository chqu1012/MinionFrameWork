package de.dc.minion.model.addon.mesh.ui;


import org.eclipse.emf.ecore.EObject;

import de.dc.minion.model.addon.mesh.ui.renderer.MeshRenderer;
import de.dc.minion.model.desk.controller.EmfPreviewPart;
import javafx.scene.Group;
import javafx.scene.Node;

public class MeshDiagram extends EmfPreviewPart {

	MeshRenderer renderer = new MeshRenderer();
	private Group root;
	
	public MeshDiagram() {
		root = renderer.getRoot();
		root.getStylesheets().add(getClass().getResource("/de/dc/minion/model/desk/control/css/SelectionMode.css").toExternalForm());
	}
	
	@Override
	protected Node onChanged(Object value) {
		renderer.clear();
		renderer.doSwitch((EObject) value);
		return root;
	}
}

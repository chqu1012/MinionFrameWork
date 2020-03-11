package de.dc.minion.model.addon.mesh.ui;

import de.dc.minion.model.addon.mesh.MeshContainer;
import de.dc.minion.model.desk.controller.EmfDetailedTreeView;
import de.dc.minion.model.desk.controller.EmfModelTreeView;

public class MeshEditor extends EmfDetailedTreeView<MeshContainer>{

	@Override
	protected EmfModelTreeView<MeshContainer> initEmfModelTreeView() {
		return new MeshTreeView();
	}

}

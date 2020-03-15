package de.dc.minion.model.addon.mesh.ui;

import de.dc.minion.model.addon.mesh.MeshContainer;
import de.dc.minion.model.addon.mesh.ui.service.MeshManager;
import de.dc.minion.model.common.IEmfManager;
import de.dc.minion.model.desk.controller.EmfModelTreeView;

public class MeshTreeView extends EmfModelTreeView<MeshContainer>{

	@Override
	public IEmfManager<MeshContainer> initEmfManager() {
		return new MeshManager();
	}
}

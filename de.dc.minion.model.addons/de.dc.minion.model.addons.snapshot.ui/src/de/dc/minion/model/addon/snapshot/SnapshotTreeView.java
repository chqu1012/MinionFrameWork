package de.dc.minion.model.addon.snapshot;

import de.dc.minion.model.addon.snapshot.service.SnapshotManager;
import de.dc.minion.model.common.IEmfManager;
import de.dc.minion.model.desk.controller.EmfModelTreeView;

public class SnapshotTreeView extends EmfModelTreeView<Snapshot>{

	@Override
	public IEmfManager<Snapshot> initEmfManager() {
		return new SnapshotManager();
	}
}

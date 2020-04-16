package de.dc.minion.model.addon.snapshot;

import de.dc.minion.model.addon.snapshot.Snapshot;
import de.dc.minion.model.desk.controller.EmfDetailedTreeView;
import de.dc.minion.model.desk.controller.EmfModelTreeView;
public class SnapshotEditor extends EmfDetailedTreeView<Snapshot>{

	@Override
	protected EmfModelTreeView<Snapshot> initEmfModelTreeView() {
		hideDetailedForm(true);
		SnapshotTreeView treeView = new SnapshotTreeView();
		treeView.addEditableFor(SnapshotPackage.eINSTANCE.getLayer_Name());
		return treeView;
	}
}

package de.dc.minion.model.addon.h2;

import de.dc.minion.model.addon.h2db.H2Servers;
import de.dc.minion.model.desk.controller.EmfDetailedTreeView;
import de.dc.minion.model.desk.controller.EmfModelTreeView;
public class H2Editor extends EmfDetailedTreeView<H2Servers>{

	@Override
	protected EmfModelTreeView<H2Servers> initEmfModelTreeView() {
		return new H2TreeView();
	}
}

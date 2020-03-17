package de.dc.minion.model.addon.h2;

import de.dc.minion.model.addon.h2db.*;
import de.dc.minion.model.addon.h2.service.*;
import de.dc.minion.model.common.IEmfManager;
import de.dc.minion.model.desk.controller.EmfModelTreeView;

public class H2TreeView extends EmfModelTreeView<H2Servers>{

	@Override
	public IEmfManager<H2Servers> initEmfManager() {
		return new H2Manager();
	}
}

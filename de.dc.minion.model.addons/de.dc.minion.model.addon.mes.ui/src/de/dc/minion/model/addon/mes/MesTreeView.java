package de.dc.minion.model.addon.mes;

import de.dc.minion.model.addon.mes.*;
import de.dc.minion.model.addon.mes.service.*;
import de.dc.minion.model.common.IEmfManager;
import de.dc.minion.model.desk.controller.EmfModelTreeView;

public class MesTreeView extends EmfModelTreeView<Mes>{

	@Override
	public IEmfManager<Mes> initEmfManager() {
		return new MesManager();
	}
}

package de.dc.minion.model.desk.controller;

import de.dc.minion.fx.model.Minion;
import de.dc.minion.model.common.IEmfManager;
import de.dc.minion.model.desk.service.MinionEmfManager;

public class MinionModelTreeView extends EmfModelTreeView<Minion>{

	@Override
	public IEmfManager<Minion> initEmfManager() {
		return new MinionEmfManager();
	}

}

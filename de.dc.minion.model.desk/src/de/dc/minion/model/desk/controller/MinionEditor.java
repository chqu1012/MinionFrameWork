package de.dc.minion.model.desk.controller;

import de.dc.minion.fx.model.Minion;
import de.dc.minion.model.common.IEmfManager;

public class MinionEditor extends EmfDetailedTreeView<Minion>{

	@Override
	protected EmfModelTreeView<Minion> initEmfModelTreeView() {
		return new MinionModelTreeView();
	}
	
	@Override
	public String getExtension() {
		return "minion";
	}
}

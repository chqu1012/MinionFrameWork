package de.dc.minion.model.desk.controller;

import de.dc.minion.fx.model.Minion;

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

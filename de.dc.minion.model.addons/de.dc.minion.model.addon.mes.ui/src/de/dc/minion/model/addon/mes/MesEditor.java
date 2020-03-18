package de.dc.minion.model.addon.mes;

import de.dc.minion.model.addon.mes.Mes;
import de.dc.minion.model.desk.controller.EmfDetailedTreeView;
import de.dc.minion.model.desk.controller.EmfModelTreeView;
public class MesEditor extends EmfDetailedTreeView<Mes>{

	@Override
	protected EmfModelTreeView<Mes> initEmfModelTreeView() {
		return new MesTreeView();
	}
}

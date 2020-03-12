package de.dc.minion.model.addon.chart.ui;

import de.dc.javafx.xcore.workbench.chart.ChartProject;
import de.dc.minion.model.desk.controller.EmfDetailedTreeView;
import de.dc.minion.model.desk.controller.EmfModelTreeView;

public class ChartEditor extends EmfDetailedTreeView<ChartProject>{

	@Override
	protected EmfModelTreeView<ChartProject> initEmfModelTreeView() {
		return new ChartTreeView();
	}

}

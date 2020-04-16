package de.dc.minion.model.addon.chart.ui;

import de.dc.javafx.xcore.workbench.chart.ChartProject;
import de.dc.minion.model.addon.chart.ui.service.ChartManager;
import de.dc.minion.model.common.IEmfManager;
import de.dc.minion.model.desk.controller.EmfModelTreeView;

public class ChartTreeView extends EmfModelTreeView<ChartProject> {

	@Override
	public IEmfManager<ChartProject> initEmfManager() {
		return new ChartManager();
	}
}

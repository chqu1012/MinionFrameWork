package de.dc.minion.model.addon.chart.ui.service;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.javafx.xcore.workbench.chart.ChartFactory;
import de.dc.javafx.xcore.workbench.chart.ChartPackage;
import de.dc.javafx.xcore.workbench.chart.ChartProject;
import de.dc.javafx.xcore.workbench.chart.provider.ChartItemProviderAdapterFactory;
import de.dc.minion.model.addon.chart.ui.file.ChartFile;
import de.dc.minion.model.common.AbstractEmfManager;
import de.dc.minion.model.common.file.IEmfFile;

public class ChartManager extends AbstractEmfManager<ChartProject>{

	@Override
	public EPackage getModelPackage() {
		return ChartPackage.eINSTANCE;
	}

	@Override
	public EFactory getExtendedModelFactory() {
		return ChartFactory.eINSTANCE;
	}

	@Override
	public IEmfFile<ChartProject> initFile() {
		return new ChartFile();
	}

	@Override
	public AdapterFactory getModelItemProviderAdapterFactory() {
		return new ChartItemProviderAdapterFactory();
	}

	@Override
	protected ChartProject initModel() {
		return ChartFactory.eINSTANCE.createChartProject();
	}
}

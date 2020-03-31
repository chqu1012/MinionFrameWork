package de.dc.minion.model.addon.mes.service;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.minion.model.addon.mes.Mes;
import de.dc.minion.model.addon.mes.file.MesFile;
import de.dc.minion.model.common.AbstractEmfManager;
import de.dc.minion.model.common.file.IEmfFile;
public class MesManager extends AbstractEmfManager<Mes>{

	@Override
	public EPackage getModelPackage() {
		return de.dc.minion.model.addon.mes.MesPackage.eINSTANCE;
	}

	@Override
	public EFactory getExtendedModelFactory() {
		return de.dc.minion.model.addon.mes.MesFactory.eINSTANCE;
	}

	@Override
	public IEmfFile<Mes> initFile() {
		return new MesFile();
	}

	@Override
	public AdapterFactory getModelItemProviderAdapterFactory() {
		return new de.dc.minion.model.addon.mes.provider.MesItemProviderAdapterFactory();
	}

	@Override
	protected Mes initModel() {
		return de.dc.minion.model.addon.mes.MesFactory.eINSTANCE.createMes();
	}
}

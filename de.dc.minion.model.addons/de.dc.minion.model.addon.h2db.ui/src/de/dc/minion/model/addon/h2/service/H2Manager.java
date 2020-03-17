package de.dc.minion.model.addon.h2.service;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.minion.model.addon.h2.file.*;
import de.dc.minion.model.addon.h2db.*;
import de.dc.minion.model.common.AbstractEmfManager;
import de.dc.minion.model.common.file.IEmfFile;
public class H2Manager extends AbstractEmfManager<H2Servers>{

	@Override
	public EPackage getModelPackage() {
		return de.dc.minion.model.addon.h2db.H2Package.eINSTANCE;
	}

	@Override
	public EFactory getExtendedModelFactory() {
		return de.dc.minion.model.addon.h2db.H2Factory.eINSTANCE;
	}

	@Override
	public IEmfFile<H2Servers> initFile() {
		return new H2File();
	}

	@Override
	public AdapterFactory getModelItemProviderAdapterFactory() {
		return new de.dc.minion.model.addon.h2db.provider.H2ItemProviderAdapterFactory();
	}

	@Override
	protected H2Servers initModel() {
		return de.dc.minion.model.addon.h2db.H2Factory.eINSTANCE.createH2Servers();
	}
}

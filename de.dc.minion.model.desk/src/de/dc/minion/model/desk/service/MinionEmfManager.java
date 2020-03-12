package de.dc.minion.model.desk.service;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.minion.fx.model.Minion;
import de.dc.minion.fx.model.MinionFactory;
import de.dc.minion.fx.model.MinionPackage;
import de.dc.minion.fx.model.provider.MinionItemProviderAdapterFactory;
import de.dc.minion.model.common.AbstractEmfManager;
import de.dc.minion.model.common.file.IEmfFile;
import de.dc.minion.model.common.file.MinionFile;

public class MinionEmfManager extends AbstractEmfManager<Minion>{

	@Override
	public EPackage getModelPackage() {
		return MinionPackage.eINSTANCE;
	}

	@Override
	public EFactory getExtendedModelFactory() {
		return MinionFactory.eINSTANCE;
	}

	@Override
	public IEmfFile<Minion> initFile() {
		return new MinionFile();
	}

	@Override
	public AdapterFactory getModelItemProviderAdapterFactory() {
		return new MinionItemProviderAdapterFactory();
	}

	@Override
	protected Minion initModel() {
		return MinionFactory.eINSTANCE.createMinion();
	}

}

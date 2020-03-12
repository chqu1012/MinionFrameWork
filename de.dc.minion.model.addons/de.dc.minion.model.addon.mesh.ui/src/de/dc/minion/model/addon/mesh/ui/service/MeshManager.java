package de.dc.minion.model.addon.mesh.ui.service;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.minion.model.addon.mesh.MeshContainer;
import de.dc.minion.model.addon.mesh.MeshFactory;
import de.dc.minion.model.addon.mesh.MeshPackage;
import de.dc.minion.model.addon.mesh.provider.MeshItemProviderAdapterFactory;
import de.dc.minion.model.addon.mesh.ui.file.MeshFile;
import de.dc.minion.model.common.AbstractEmfManager;
import de.dc.minion.model.common.file.IEmfFile;

public class MeshManager extends AbstractEmfManager<MeshContainer>{

	@Override
	public EPackage getModelPackage() {
		return MeshPackage.eINSTANCE;
	}

	@Override
	public EFactory getExtendedModelFactory() {
		return MeshFactory.eINSTANCE;
	}

	@Override
	public IEmfFile<MeshContainer> initFile() {
		return new MeshFile();
	}

	@Override
	public AdapterFactory getModelItemProviderAdapterFactory() {
		return new MeshItemProviderAdapterFactory();
	}

	@Override
	protected MeshContainer initModel() {
		return MeshFactory.eINSTANCE.createMeshContainer();
	}

}

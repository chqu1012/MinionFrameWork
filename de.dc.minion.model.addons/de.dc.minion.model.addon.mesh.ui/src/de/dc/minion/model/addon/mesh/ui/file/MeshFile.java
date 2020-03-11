package de.dc.minion.model.addon.mesh.ui.file;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.minion.model.addon.mesh.MeshContainer;
import de.dc.minion.model.addon.mesh.MeshFactory;
import de.dc.minion.model.addon.mesh.MeshPackage;
import de.dc.minion.model.common.file.EmfFile;

public class MeshFile extends EmfFile<MeshContainer>{

	@Override
	public EPackage getEPackageEInstance() {
		return MeshPackage.eINSTANCE;
	}

	@Override
	public EFactory getEFactoryEInstance() {
		return MeshFactory.eINSTANCE;
	}

	@Override
	public String getExtension() {
		return "mesh";
	}

}

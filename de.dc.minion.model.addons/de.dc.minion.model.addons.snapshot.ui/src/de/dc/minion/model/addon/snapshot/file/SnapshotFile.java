package de.dc.minion.model.addon.snapshot.file;

import de.dc.minion.model.addon.snapshot.*;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.minion.model.common.file.EmfFile;

public class SnapshotFile extends EmfFile<Snapshot>{

	@Override
	public EPackage getEPackageEInstance() {
		return de.dc.minion.model.addon.snapshot.SnapshotPackage.eINSTANCE;
	}

	@Override
	public EFactory getEFactoryEInstance() {
		return de.dc.minion.model.addon.snapshot.SnapshotFactory.eINSTANCE;
	}

	@Override
	public String getExtension() {
		return "snapshot";
	}
}

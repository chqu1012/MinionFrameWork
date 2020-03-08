package de.dc.minion.model.common.file;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.minion.fx.model.MinionFactory;
import de.dc.minion.fx.model.MinionPackage;
import de.dc.minion.fx.model.Toady;

public class ToadyFile extends EmfFile<Toady>{

	@Override
	public EPackage getEPackageEInstance() {
		return MinionPackage.eINSTANCE;
	}

	@Override
	public EFactory getEFactoryEInstance() {
		return MinionFactory.eINSTANCE;
	}

	@Override
	public String getExtension() {
		return "minion";
	}

}

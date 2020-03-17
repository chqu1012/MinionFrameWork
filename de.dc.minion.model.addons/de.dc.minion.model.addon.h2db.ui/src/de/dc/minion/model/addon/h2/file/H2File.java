package de.dc.minion.model.addon.h2.file;

import de.dc.minion.model.addon.h2db.*;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.minion.model.common.file.EmfFile;

public class H2File extends EmfFile<H2Servers>{

	@Override
	public EPackage getEPackageEInstance() {
		return de.dc.minion.model.addon.h2db.H2Package.eINSTANCE;
	}

	@Override
	public EFactory getEFactoryEInstance() {
		return de.dc.minion.model.addon.h2db.H2Factory.eINSTANCE;
	}

	@Override
	public String getExtension() {
		return "h2db";
	}
}

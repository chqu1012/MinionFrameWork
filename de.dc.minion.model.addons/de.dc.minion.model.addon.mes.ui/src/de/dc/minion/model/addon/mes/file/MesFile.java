package de.dc.minion.model.addon.mes.file;

import de.dc.minion.model.addon.mes.*;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.minion.model.common.file.EmfFile;

public class MesFile extends EmfFile<Mes>{

	@Override
	public EPackage getEPackageEInstance() {
		return de.dc.minion.model.addon.mes.MesPackage.eINSTANCE;
	}

	@Override
	public EFactory getEFactoryEInstance() {
		return de.dc.minion.model.addon.mes.MesFactory.eINSTANCE;
	}

	@Override
	public String getExtension() {
		return "mes";
	}
}

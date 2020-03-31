package de.dc.minion.model.addon.lecture.file;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.minion.model.addon.lecture.LectureProject;
import de.dc.minion.model.common.file.EmfFile;

public class LectureFile extends EmfFile<LectureProject>{

	@Override
	public EPackage getEPackageEInstance() {
		return de.dc.minion.model.addon.lecture.LecturePackage.eINSTANCE;
	}

	@Override
	public EFactory getEFactoryEInstance() {
		return de.dc.minion.model.addon.lecture.LectureFactory.eINSTANCE;
	}

	@Override
	public String getExtension() {
		return "lecture";
	}
}

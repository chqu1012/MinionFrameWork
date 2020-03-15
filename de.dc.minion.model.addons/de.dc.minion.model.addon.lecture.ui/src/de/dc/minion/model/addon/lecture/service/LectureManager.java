package de.dc.minion.model.addon.lecture.service;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.minion.model.addon.lecture.file.*;
import de.dc.minion.model.addon.lecture.*;
import de.dc.minion.model.common.AbstractEmfManager;
import de.dc.minion.model.common.file.IEmfFile;
public class LectureManager extends AbstractEmfManager<LectureProject>{

	@Override
	public EPackage getModelPackage() {
		return de.dc.minion.model.addon.lecture.LecturePackage.eINSTANCE;
	}

	@Override
	public EFactory getExtendedModelFactory() {
		return de.dc.minion.model.addon.lecture.LectureFactory.eINSTANCE;
	}

	@Override
	public IEmfFile<LectureProject> initFile() {
		return new LectureFile();
	}

	@Override
	public AdapterFactory getModelItemProviderAdapterFactory() {
		return new de.dc.minion.model.addon.lecture.provider.LectureItemProviderAdapterFactory();
	}

	@Override
	protected LectureProject initModel() {
		return de.dc.minion.model.addon.lecture.LectureFactory.eINSTANCE.createLectureProject();
	}
}

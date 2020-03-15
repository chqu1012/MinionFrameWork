package de.dc.minion.model.editor.template

import de.dc.minion.model.editor.model.IdeModel

class EmfManagerTemplate implements IGenerator<IdeModel>{
	
	override path(IdeModel model)'''service/«model.name»Manager.java'''

	override gen(IdeModel model)'''
	package «model.packagePath».service;
	
	import org.eclipse.emf.common.notify.AdapterFactory;
	import org.eclipse.emf.ecore.EFactory;
	import org.eclipse.emf.ecore.EPackage;
	
	import «model.packagePath».file.*;
	import de.dc.minion.model.common.AbstractEmfManager;
	import de.dc.minion.model.common.file.IEmfFile;
	«val name = model.name»
	public class «name»Manager extends AbstractEmfManager<«model.rootModel»>{
	
		@Override
		public EPackage getModelPackage() {
			return «model.getePackage».eINSTANCE;
		}
	
		@Override
		public EFactory getExtendedModelFactory() {
			return «model.geteFactory».eINSTANCE;
		}
	
		@Override
		public IEmfFile<«model.rootModel»> initFile() {
			return new «name»File();
		}
	
		@Override
		public AdapterFactory getModelItemProviderAdapterFactory() {
			return new «model.itemProviderAdapterFactory»();
		}
	
		@Override
		protected «model.rootModel» initModel() {
			return «model.geteFactory».eINSTANCE.create«model.rootModel»();
		}
	}
	'''
}
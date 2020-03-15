package de.dc.minion.model.editor.template

import de.dc.minion.model.editor.model.IdeModel

class EmfFileTemplate implements IGenerator<IdeModel>{
	
	override path(IdeModel model)'''service/«model.name»Manager.java'''

	override gen(IdeModel model)'''
	package «model.packagePath».file;
	
	import org.eclipse.emf.ecore.EFactory;
	import org.eclipse.emf.ecore.EPackage;
	
	import de.dc.minion.model.common.file.EmfFile;
	
	public class «model.name»File extends EmfFile<«model.rootModel»>{
	
		@Override
		public EPackage getEPackageEInstance() {
			return «model.getePackage».eINSTANCE;
		}
	
		@Override
		public EFactory getEFactoryEInstance() {
			return «model.geteFactory».eINSTANCE;
		}
	
		@Override
		public String getExtension() {
			return "«model.name.toLowerCase»";
		}
	}
	'''
}
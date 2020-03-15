package de.dc.minion.model.editor.template

import de.dc.minion.model.editor.model.IdeModel

class EmfModelTreeViewTemplate implements IGenerator<IdeModel>{
	
	override path(IdeModel model)'''«model.name.toFirstUpper»TreeView.java'''

	override gen(IdeModel model)'''
	package «model.packagePath»;
	
	import «model.rootModelPackage».*;
	import «model.packagePath».service.*;
	import de.dc.minion.model.common.IEmfManager;
	import de.dc.minion.model.desk.controller.EmfModelTreeView;
	
	«val name = model.name.toFirstUpper»
	public class «name»TreeView extends EmfModelTreeView<«model.rootModel»>{
	
		@Override
		public IEmfManager<«model.rootModel»> initEmfManager() {
			return new «name»Manager();
		}
	}
	'''
}
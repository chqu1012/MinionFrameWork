package de.dc.minion.model.editor.template

import de.dc.minion.model.editor.model.IdeModel

class EmfModelTreeViewTemplate implements IGenerator<IdeModel>{
	
	override path(IdeModel model)'''«model.name»TreeView.java'''

	override gen(IdeModel model)'''
	package «model.packagePath»;
	
	import «model.packagePath».«model.rootModel»;
	import «model.packagePath».ui.service.«model.name»Manager;
	import de.dc.minion.model.common.IEmfManager;
	import de.dc.minion.model.desk.controller.EmfModelTreeView;
	
	public class «model.name»TreeView extends EmfModelTreeView<«model.rootModel»>{
	
		@Override
		public IEmfManager<«model.rootModel»> initEmfManager() {
			return new «model.name»Manager();
		}
	}
	'''
}
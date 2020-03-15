package de.dc.minion.model.editor.template

import de.dc.minion.model.editor.model.IdeModel

class EmfModelDetailedTreeViewTemplate implements IGenerator<IdeModel>{
	
	override path(IdeModel model)'''«model.name»Editor.java'''

	override gen(IdeModel model)'''
	package «model.packagePath»;
	
	import «model.packagePath».«model.rootModel»;
	import de.dc.minion.model.desk.controller.EmfDetailedTreeView;
	import de.dc.minion.model.desk.controller.EmfModelTreeView;
	
	public class «model.name»Editor extends EmfDetailedTreeView<«model.rootModel»>{
	
		@Override
		protected EmfModelTreeView<«model.rootModel»> initEmfModelTreeView() {
			return new «model.name»TreeView();
		}
	}
	'''
}
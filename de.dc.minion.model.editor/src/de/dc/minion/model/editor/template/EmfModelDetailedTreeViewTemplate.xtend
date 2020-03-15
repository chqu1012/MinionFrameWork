package de.dc.minion.model.editor.template

import de.dc.minion.model.editor.model.IdeModel

class EmfModelDetailedTreeViewTemplate implements IGenerator<IdeModel>{
	
	override path(IdeModel model)'''«model.name.toFirstUpper»Editor.java'''

	override gen(IdeModel model)'''
	package «model.packagePath»;
	
	import «model.packagePath».«model.rootModel»;
	import de.dc.minion.model.desk.controller.EmfDetailedTreeView;
	import de.dc.minion.model.desk.controller.EmfModelTreeView;
	«val name = model.name.toFirstUpper»
	public class «name»Editor extends EmfDetailedTreeView<«model.rootModel»>{
	
		@Override
		protected EmfModelTreeView<«model.rootModel»> initEmfModelTreeView() {
			return new «name»TreeView();
		}
	}
	'''
}
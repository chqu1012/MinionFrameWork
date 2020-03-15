package de.dc.minion.model.editor.template

import de.dc.minion.model.editor.model.IdeModel

class RendererTemplate implements IGenerator<IdeModel>{
	
	override path(IdeModel model)'''renderer/«model.name»Renderer.java'''

	override gen(IdeModel model)'''
	package «model.packagePath».renderer;
	
	import «model.packagePath».util.«model.name»Switch;
	
	public class «model.name»Renderer extends «model.name»Switch<Node> {
	}
	'''
}
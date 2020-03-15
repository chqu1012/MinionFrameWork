package de.dc.minion.model.editor.template

import de.dc.minion.model.editor.model.IdeModel

class RendererTemplate implements IGenerator<IdeModel>{
	
	override path(IdeModel model)'''renderer/«model.name.toFirstUpper»Renderer.java'''

	override gen(IdeModel model)'''
	package «model.packagePath».renderer;
	
	import «model.packagePath».util.*;
	import javafx.scene.Node;
	
	«val name = model.name.toFirstUpper»
	public class «name»Renderer extends «name»Switch<Node> {
		
		public void clear(){}
	}
	'''
}
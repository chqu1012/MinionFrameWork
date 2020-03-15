package de.dc.minion.model.editor.template

import de.dc.minion.model.editor.model.IdeModel

class DiagramTemplate implements IGenerator<IdeModel>{
	
	override path(IdeModel model)'''«model.name»Diagram.java'''

	override gen(IdeModel model)'''
	package «model.packagePath»;
	
	import org.eclipse.emf.ecore.EObject;
	
	import «model.packagePath».renderer.*;
	import de.dc.minion.model.common.control.EmfViewPart;
	import javafx.beans.value.ChangeListener;
	import javafx.beans.value.ObservableValue;
	import javafx.scene.Parent;
	import javafx.scene.control.TreeItem;
	import javafx.scene.layout.BorderPane;
		
	«val name = model.name»
	public class «name»Diagram extends EmfPreviewPart implements ChangeListener<Object> {
	
		private «name»Renderer renderer;
		private BorderPane parent;
		
		@Override
		public Parent create() {
			renderer = new «name»Renderer();
			parent = new BorderPane();
			return parent;
		}
	
		@Override
		public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
			if (newValue != null) {
				if (newValue instanceof TreeItem) {
					TreeItem<Object> treeItem = (TreeItem<Object>) newValue;
					Object value = treeItem.getValue();
					parent.setCenter(renderer.doSwitch((EObject) value));
				}
			}
		}
	}
	'''
}
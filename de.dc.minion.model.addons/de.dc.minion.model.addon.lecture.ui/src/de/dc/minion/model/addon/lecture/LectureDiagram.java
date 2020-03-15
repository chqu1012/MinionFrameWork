package de.dc.minion.model.addon.lecture;

import org.eclipse.emf.ecore.EObject;

import de.dc.minion.model.addon.lecture.renderer.*;
import de.dc.minion.model.common.control.EmfViewPart;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Parent;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.BorderPane;
	
public class LectureDiagram extends EmfViewPart implements ChangeListener<Object> {

	private LectureRenderer renderer;
	private BorderPane parent;
	
	@Override
	public Parent create() {
		renderer = new LectureRenderer();
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

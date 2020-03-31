package de.dc.minion.model.addon.lecture;

import org.eclipse.emf.ecore.EObject;

import de.dc.minion.model.addon.lecture.renderer.LectureContentSwitch;
import de.dc.minion.model.common.control.EmfViewPart;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Parent;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebView;

public class LectureDiagram extends EmfViewPart implements ChangeListener<Object> {

	private LectureContentSwitch renderer;
	private BorderPane parent;
	private WebView webView;
	
	@Override
	public Parent create() {
		webView = new WebView();
		renderer = new LectureContentSwitch(webView.getEngine());
		parent = new BorderPane();
		parent.setCenter(webView);
		return parent;
	}

	@Override
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
		if (newValue != null) {
			if (newValue instanceof TreeItem) {
				TreeItem<Object> treeItem = (TreeItem<Object>) newValue;
				Object value = treeItem.getValue();
				renderer.doSwitch((EObject) value);
			}
		}
	}
}

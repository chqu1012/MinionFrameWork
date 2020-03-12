package de.dc.minion.model.addon.chart.ui;

import org.eclipse.emf.ecore.EObject;

import de.dc.minion.model.addon.chart.ui.renderer.ChartFXRenderer;
import de.dc.minion.model.common.control.EmfViewPart;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Parent;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.BorderPane;

public class ChartDiagram extends EmfViewPart implements ChangeListener<Object> {

	private ChartFXRenderer renderer;
	private BorderPane parent;
	
	@Override
	public Parent create() {
		renderer = new ChartFXRenderer();
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

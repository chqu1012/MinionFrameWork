package de.dc.minion.model.desk.control;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;

import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.event.ISelectionService;
import de.dc.minion.model.desk.control.shape.DraggableItem;
import de.dc.minion.model.desk.util.DragResizeMod;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Parent;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.Pane;

public class MinionParentChildVision extends EmfViewPart implements ChangeListener<TreeItem<Object>>{

	@Inject ISelectionService selectionService;
	
	private Pane parent;
	
	@Override
	public Parent create() {
		parent = new Pane();
		return parent;
	}
	
	@Override
	public void initialize() {
		selectionService.addListener(this);
	}

	@Override
	public void changed(ObservableValue<? extends TreeItem<Object>> observable, TreeItem<Object> oldValue,
			TreeItem<Object> newValue) {
		if (newValue!=null) {
			parent.getChildren().clear();
			Object value = newValue.getValue();
			if (value instanceof EObject) {
				EObject eObject = (EObject) value;
				eObject.eAllContents().forEachRemaining(e->{
					DraggableItem item = new DraggableItem(e.toString());
					item.setOnMouseClicked(s-> item.selectionProperty().set(item.selectionProperty().not().get()));
					DragResizeMod.makeResizable(item);
					parent.getChildren().add(item);
				});				
			}
		}
	}
}
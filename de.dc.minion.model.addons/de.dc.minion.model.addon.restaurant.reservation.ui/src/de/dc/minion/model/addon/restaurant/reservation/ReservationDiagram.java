package de.dc.minion.model.addon.restaurant.reservation;

import org.eclipse.emf.ecore.EObject;

import de.dc.minion.model.addon.restaurant.reservation.renderer.*;
import de.dc.minion.model.addon.restaurant.reservation.renderer.control.TableNode;
import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.desk.control.shape.DraggableItem;
import de.dc.minion.model.desk.control.shape.ZoomableScrollPane;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.TreeItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
	
public class ReservationDiagram extends EmfViewPart implements ChangeListener<Object> {

	private ReservationRenderer renderer;
	private Pane parent;
	
	@Override
	public Parent create() {
		renderer = new ReservationRenderer();
		parent = new Pane();
		return new ZoomableScrollPane(parent);
	}

	@Override
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
		if (newValue != null) {
			if (newValue instanceof TreeItem) {
				TreeItem item = (TreeItem) newValue;
				parent.getChildren().clear();
				Object value = item.getValue();
				if (value instanceof EObject) {
					EObject eObject = (EObject) value;
					eObject.eAllContents().forEachRemaining(e->{
						TableNode node = (TableNode) renderer.doSwitch(e);
						node.setOnMouseClicked(s-> selectNode(node, s));
						node.layoutXProperty().addListener((obs, oldV, newV) -> changedLayoutX(node, newV));
						node.layoutYProperty().addListener((obs, oldV, newV) -> changedLayoutY(node, newV));
						parent.getChildren().add(node);
					});				
				}
			}
		}
	}
	
	public void changedLayoutY(TableNode node, Number newValue) {
		if (newValue!=null) {
			node.getData().setPosY(newValue.intValue());
			node.setLayoutY(newValue.doubleValue());
		}
	}
	
	public void changedLayoutX(TableNode node, Number newValue) {
		if (newValue!=null) {
			node.getData().setPosX(newValue.intValue());
			node.setLayoutX(newValue.doubleValue());
		}
	}
	
	public void selectNode(TableNode node, MouseEvent s) {
		if (s.getClickCount()==2) {
			node.selectionProperty().set(node.selectionProperty().not().get());
		}
	}
}

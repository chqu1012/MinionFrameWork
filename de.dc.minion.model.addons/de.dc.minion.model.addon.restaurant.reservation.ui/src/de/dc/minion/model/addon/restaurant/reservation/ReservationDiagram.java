package de.dc.minion.model.addon.restaurant.reservation;

import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;

import de.dc.minion.model.addon.restaurant.reservation.renderer.ReservationRenderer;
import de.dc.minion.model.addon.restaurant.reservation.renderer.control.TableNode;
import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.desk.control.shape.ZoomableScrollPane;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Parent;
import javafx.scene.control.TreeItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
	
public class ReservationDiagram extends EmfViewPart implements ChangeListener<Object> {
	
	private static final Logger LOG = Logger.getLogger(ReservationDiagram.class.getSimpleName());

	private ReservationRenderer renderer;
	private Pane parent;
	
	@Override
	public Parent create() {
		renderer = new ReservationRenderer();
		parent = new Pane();
		parent.setPrefSize(1200, 800);
		parent.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
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
						node.setOnMouseExited(s->onMouseExited(node));
						parent.getChildren().add(node);
					});				
				}
			}
		}
	}
	
	public void onMouseExited(TableNode node) {
		Double x = node.getLayoutX();
		Double y = node.getLayoutY();
		Double width = node.getWidth();
		Double height = node.getHeight();

		Table data = node.getData();
		data.setX(x);
		data.setY(y);
		data.setWidth(width);
		data.setHeight(height);
		
		LOG.info(String.format("x:%s, y:%s, width:%s, height:%s", x, y, width, height));
	}

	public void selectNode(TableNode node, MouseEvent s) {
		if (s.getClickCount()==2) {
			node.selectionProperty().set(node.selectionProperty().not().get());
		}
	}
}

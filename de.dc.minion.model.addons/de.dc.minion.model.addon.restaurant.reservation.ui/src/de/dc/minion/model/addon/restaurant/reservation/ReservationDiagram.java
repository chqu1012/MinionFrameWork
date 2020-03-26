package de.dc.minion.model.addon.restaurant.reservation;

import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;

import de.dc.minion.model.addon.restaurant.reservation.renderer.ReservationRenderer;
import de.dc.minion.model.addon.restaurant.reservation.renderer.control.TableNode;
import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.desk.control.shape.ZoomableScrollPane;
import de.dc.minion.model.desk.util.DragResizeMod;
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
	
	@Inject IEventBroker eventBroker;
	
	@Override
	public Parent create() {
		DragResizeMod.makeResizable(pane);
		
		renderer = new ReservationRenderer();
		parent = new Pane();
		parent.setPrefSize(2000, 2000);
		parent.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		parent.setStyle("-fx-border-color: lightgray");
		
		parent.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		return new ZoomableScrollPane(parent);
	}

	@Override
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
		if (newValue != null) {
			if (newValue instanceof TreeItem) {
				TreeItem item = (TreeItem) newValue;
				Object value = item.getValue();
				if (value instanceof EObject) {
					EObject eObject = (EObject) value;
					if (eObject instanceof Restaurant) {
						parent.getChildren().clear();
						Restaurant restaurant = (Restaurant) eObject;
						restaurant.getTables().forEach(e->{
							TableNode node = (TableNode) renderer.doSwitch(e);
							if (node != null) {
								node.setOnMouseClicked(s-> selectNode(node, s));
								node.setOnMouseExited(s->onMouseExited(node));
								parent.getChildren().add(node);
							}
						});
						
					}
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
	}

	public void selectNode(TableNode node, MouseEvent s) {
		eventBroker.post(new EventContext<>("/reservation/table/select", node.getData()));
		node.selectionProperty().set(node.selectionProperty().not().get());
	}
}

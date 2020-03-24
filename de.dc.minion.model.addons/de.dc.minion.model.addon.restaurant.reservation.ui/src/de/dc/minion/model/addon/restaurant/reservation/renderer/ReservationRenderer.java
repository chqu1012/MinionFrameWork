package de.dc.minion.model.addon.restaurant.reservation.renderer;

import de.dc.minion.model.addon.restaurant.reservation.Restaurant;
import de.dc.minion.model.addon.restaurant.reservation.Table;
import de.dc.minion.model.addon.restaurant.reservation.renderer.control.TableNode;
import de.dc.minion.model.addon.restaurant.reservation.util.ReservationSwitch;
import javafx.scene.Node;

public class ReservationRenderer extends ReservationSwitch<Node> {
	
	public void clear(){}
	
	@Override
	public Node caseRestaurant(Restaurant object) {
		return super.caseRestaurant(object);
	}
	
	@Override
	public Node caseTable(Table object) {
		return new TableNode(object);
	}
}

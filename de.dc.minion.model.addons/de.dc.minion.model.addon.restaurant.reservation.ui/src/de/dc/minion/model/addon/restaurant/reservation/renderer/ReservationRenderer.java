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
		TableNode table = new TableNode(object);
		Integer posX = object.getPosX();
		Integer posY = object.getPosY();
		if (posX!=null) {
			table.setLayoutX(posX);
		}
		if (posY!=null) {
			table.setLayoutY(posY);
		}
		return table;
	}
}

package de.dc.minion.model.addon.restaurant.reservation.renderer.control;

import de.dc.minion.model.addon.restaurant.reservation.Table;
import de.dc.minion.model.desk.control.shape.DraggableItem;

public class TableNode extends DraggableItem<Table>{

	public TableNode(Table data) {
		super("Table: "+data.getNumber());
		setData(data);
		Double posX = data.getX();
		Double posY = data.getY();
		Double width = data.getWidth();
		Double height = data.getHeight();
		if (height!=null) {
			setPrefHeight(height);
		}
		if (width!=null) {
			setPrefWidth(width);
		}
		if (posX!=null) {
			setLayoutX(posX);
		}
		if (posY!=null) {
			setLayoutY(posY);
		}
	}

}

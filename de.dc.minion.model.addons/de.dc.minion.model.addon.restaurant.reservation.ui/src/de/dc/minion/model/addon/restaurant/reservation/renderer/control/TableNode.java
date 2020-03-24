package de.dc.minion.model.addon.restaurant.reservation.renderer.control;

import de.dc.minion.model.addon.restaurant.reservation.Table;
import de.dc.minion.model.desk.control.shape.DraggableItem;

public class TableNode extends DraggableItem<Table>{

	public TableNode(Table data) {
		super("Table");
		setData(data);
	}

}

package de.dc.minion.model.addon.restaurant.reservation.renderer.control;

import de.dc.minion.model.addon.restaurant.reservation.Wall;
import de.dc.minion.model.desk.util.DragResizeMod;
import javafx.scene.shape.Line;

public class WallNode extends Line{

	private Wall data;

	public WallNode(Wall data) {
		this.data=data;
		DragResizeMod.makeResizable(this);
		
		setStrokeWidth(20);
		
		setStartX(data.getStartx());
		setStartY(data.getStartY());
		setEndX(data.getEndx());
		setEndY(data.getEndY());
		
	}

	public Wall getData() {
		return data;
	}
}

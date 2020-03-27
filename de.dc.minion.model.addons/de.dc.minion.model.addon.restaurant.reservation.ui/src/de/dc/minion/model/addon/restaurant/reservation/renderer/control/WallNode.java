package de.dc.minion.model.addon.restaurant.reservation.renderer.control;

import java.util.Optional;

import de.dc.minion.model.addon.restaurant.reservation.Wall;
import de.dc.minion.model.desk.util.DragResizeMod;
import javafx.scene.shape.Line;

public class WallNode extends Line{

	private Wall data;

	public WallNode(Wall data) {
		this.data=data;
		DragResizeMod.makeResizable(this);
		
		Optional<String> style = data.getStyles().stream().filter(e-> e.getValue()!=null).map(e->e.getStyleType().getLiteral()+": "+e.getValue()).reduce((e1, e2)->e1+":"+e2+";");
		style.ifPresent(this::setStyle);
		
		setStartX(data.getStartx());
		setStartY(data.getStartY());
		setEndX(data.getEndx());
		setEndY(data.getEndY());
		
	}

	public Wall getData() {
		return data;
	}
}

package de.dc.minion.model.addon.restaurant.reservation.renderer.control;

import de.dc.minion.model.addon.restaurant.reservation.Table;
import de.dc.minion.model.desk.control.shape.DraggableItem;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

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
		
		FlowPane flowPane = new FlowPane();
		flowPane.setHgap(10);
		flowPane.setPadding(new Insets(10));
		flowPane.setVgap(20);
		setCenter(flowPane);
		
		Integer seatCount = data.getSeatCount();
		if (seatCount!=null) {
			for (int i = 0; i < seatCount; i++) {
				Button seat = new Button(String.valueOf("Sitz: "+i));
				seat.setMinSize(60, 60);
				flowPane.getChildren().add(seat);
			}
		}
	}

}

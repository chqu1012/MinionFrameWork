package de.dc.minion.model.addon.restaurant.reservation.renderer.control;

import java.util.Optional;

import de.dc.minion.model.addon.restaurant.reservation.Wall;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;

public class WallNode extends Line {

	private Wall data;

	public WallNode(Wall data) {
		this.data = data;

		Optional<String> style = data.getStyles().stream().filter(e -> e.getValue() != null)
				.map(e -> e.getStyleType().getLiteral() + ": " + e.getValue()).reduce((e1, e2) -> e1 + ";" + e2);
		style.ifPresent(this::setStyle);

		setStartX(data.getStartx());
		setStartY(data.getStartY());
		setEndX(data.getEndx());
		setEndY(data.getEndY());
		
		setOnMouseEntered(this.enteredEventHandler);
		setOnMousePressed(this.pressedEventHandler);
		setOnMouseDragged(this.draggedEventHandler);
		setOnMouseDragExited(this.draggedExistEventHandler);

	}

	public Wall getData() {
		return data;
	}

	private double orgSceneX;
	private double orgSceneY;
	private double orgTranslateX;
	private double orgTranslateY;

	EventHandler<MouseEvent> draggedExistEventHandler = t -> setCursor(Cursor.NONE);
	EventHandler<MouseEvent> enteredEventHandler = t -> setCursor(Cursor.OPEN_HAND);
	
	EventHandler<MouseEvent> pressedEventHandler = t -> {
		setCursor(Cursor.CLOSED_HAND);
		orgSceneX = t.getSceneX();
		orgSceneY = t.getSceneY();
		orgTranslateX = ((Shape) (t.getSource())).getTranslateX();
		orgTranslateY = ((Shape) (t.getSource())).getTranslateY();
	};

	EventHandler<MouseEvent> draggedEventHandler = t -> {
		setCursor(Cursor.CLOSED_HAND);
		double offsetX = t.getSceneX() - orgSceneX;
		double offsetY = t.getSceneY() - orgSceneY;
		double newTranslateX = orgTranslateX + offsetX;
		double newTranslateY = orgTranslateY + offsetY;

		((Shape) (t.getSource())).setTranslateX(newTranslateX);
		((Shape) (t.getSource())).setTranslateY(newTranslateY);
	};
}

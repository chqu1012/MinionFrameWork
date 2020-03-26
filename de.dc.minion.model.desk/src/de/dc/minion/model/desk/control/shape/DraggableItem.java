package de.dc.minion.model.desk.control.shape;

import de.dc.minion.model.desk.util.DragResizeMod;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class DraggableItem<T> extends BorderPane{ 
	
	private BooleanProperty selectedProperty = new SimpleBooleanProperty();
	private T data;
	
	public DraggableItem(String name, T data) {
		this(name);
		this.data = data;
	}
	
	public DraggableItem(String name) {
		Label label = new Label(name);
		label.setPrefWidth(100);
		label.setLayoutX(10);
		label.setLayoutY(10);
		setTop(label);
		DragResizeMod.makeResizable(this);
		setPrefSize(100, 100);
		
		setStyle("-fx-background-color: blue; -fx-border-color: transparent; -fx-border-width: 0");
		
//		StringBinding css = Bindings.when(selectedProperty).
//				then("-fx-background-color: blue; -fx-border-color: yellow; -fx-border-width: 5").
//				otherwise("-fx-background-color: blue; -fx-border-color: transparent; -fx-border-width: 0");
//		styleProperty().bind(css);
		
//		HBox hbox = new HBox(2);
//		hbox.getChildren().add(new Button("Edit"));
//		hbox.getChildren().add(new Button("Refresh"));
//		hbox.setLayoutY(-30);
//		
//		VBox vbox = new VBox(2);
//		Button buttonColor = new Button("Color");
//		Button buttonFont = new Button("Font");
//		Button buttonEffect = new Button("Effect");
//		buttonEffect.setMaxWidth(Double.MAX_VALUE);
//		buttonColor.setMaxWidth(Double.MAX_VALUE);
//		buttonFont.setMaxWidth(Double.MAX_VALUE);
//		vbox.getChildren().add(buttonColor);
//		vbox.getChildren().add(buttonFont);
//		vbox.getChildren().add(buttonEffect);
//		vbox.setLayoutX(-50);
//		selectedProperty.addListener(new ChangeListener<Boolean>() {
//			@Override
//			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
//				if (newValue) {
//					getChildren().add(hbox);
//					getChildren().add(vbox);
//				}else {
//					getChildren().remove(hbox);
//					getChildren().remove(vbox);
//				}
//			}
//		});
	}
	
	public void setData(T data) {
		this.data=data;
	}
	
	public T getData() {
		return data;
	}
	
	public BooleanProperty selectionProperty() {
		return selectedProperty;
	}
}

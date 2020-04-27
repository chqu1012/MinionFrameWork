package de.dc.minion.model.desk.metro.component.cell;

import de.dc.minion.fx.model.Landscape;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class LandscapeListCell extends ListCell<Landscape>{

	@Override
	protected void updateItem(Landscape item, boolean empty) {
		super.updateItem(item, empty);
		if (item==null || empty) {
			setText(null);
			setGraphic(null);
		}else {
			ImageView imageView = new ImageView("/de/dc/minion/model/desk/metro/images/icons8-landschaft-64.png");
			imageView.setFitWidth(48);
			imageView.setFitHeight(48);
			VBox vbox = new VBox(3);
			VBox.setVgrow(imageView, Priority.ALWAYS);
			vbox.setAlignment(Pos.BASELINE_CENTER);
			vbox.getChildren().add(imageView);
			vbox.getChildren().add(new Label(item.getName()));
			setGraphic(vbox);
		}
	}
}

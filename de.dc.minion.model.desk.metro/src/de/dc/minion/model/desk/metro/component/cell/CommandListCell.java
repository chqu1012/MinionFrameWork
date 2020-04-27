package de.dc.minion.model.desk.metro.component.cell;

import de.dc.minion.fx.model.Command;
import javafx.scene.control.ListCell;
import javafx.scene.image.ImageView;

public class CommandListCell extends ListCell<Command>{

	@Override
	protected void updateItem(Command item, boolean empty) {
		super.updateItem(item, empty);
		if (item==null || empty) {
			setText(null);
			setGraphic(null);
		}else {
			setText(item.getName());
			ImageView imageView = new ImageView("/de/dc/minion/model/desk/metro/images/icons8-air-play-48.png");
			imageView.setFitWidth(16);
			imageView.setFitHeight(16);
			setGraphic(imageView);
		}
	}
}

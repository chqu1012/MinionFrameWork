package de.dc.minion.model.desk.control.feature;

import de.dc.minion.fx.model.RecentlyOpenFile;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class RecentFilesListCell extends ListCell<RecentlyOpenFile>{

	@Override
	protected void updateItem(RecentlyOpenFile item, boolean empty) {
		super.updateItem(item, empty);
		if (item==null || empty) {
			setText(null);
			setGraphic(null);
		}else {
			VBox vbox = new VBox();
			Label labelName = new Label(item.getName());
			labelName.setFont(Font.font("arial", FontWeight.BOLD, 11));
			vbox.getChildren().add(labelName);
			Label labelPath = new Label(item.getPath());
			labelPath.setFont(Font.font(9));
			vbox.getChildren().add(labelPath);
			Label labelTimestamp = new Label(item.getTimestamp()==null?"No Timestamp":String.valueOf(item.getTimestamp()));
			labelTimestamp.setFont(Font.font(9));
			vbox.getChildren().add(labelTimestamp);
			setGraphic(vbox);
		}
	}
}

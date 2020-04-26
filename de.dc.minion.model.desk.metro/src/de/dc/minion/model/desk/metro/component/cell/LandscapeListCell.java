package de.dc.minion.model.desk.metro.component.cell;

import de.dc.minion.fx.model.Landscape;
import javafx.scene.control.ListCell;

public class LandscapeListCell extends ListCell<Landscape>{

	@Override
	protected void updateItem(Landscape item, boolean empty) {
		super.updateItem(item, empty);
		if (item==null || empty) {
			setText(null);
		}else {
			setText(item.getName());
		}
	}
}

package de.dc.minion.model.addon.fileview.component.cell;

import java.io.File;
import java.util.Arrays;

import de.dc.minion.model.addon.fileview.util.SystemIconsHelper;
import javafx.scene.control.TreeCell;
import javafx.scene.image.ImageView;

public class FileTreeCell extends TreeCell<File> {
	
	public static final String IMG_FOLDER_URL = "/de/dc/minion/model/addon/fileview/images/icons8-mappe-16.png";
	
	@Override
	protected void updateItem(File item, boolean empty) {
		super.updateItem(item, empty);
		if (item == null || empty) {
			setText(null);
			setGraphic(null);
		} else {
			if (item.isDirectory()) {
				long count = Arrays.asList(item.listFiles()).stream().filter(File::isFile).count();
				setText(String.format("%s (%s Files)", item.getName(), count));
				setGraphic(new ImageView(IMG_FOLDER_URL));
			} else {
				setText(item.getName());
				setGraphic(new ImageView(SystemIconsHelper.getFileIcon(item.getName())));
			}
		}
	}

}

package de.dc.minion.model.addon.fileview.touch;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

import de.dc.minion.model.addon.fileview.component.SimpleFileTreeItem;
import de.dc.minion.model.addon.fileview.util.SystemIconsHelper;
import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import javafx.scene.Parent;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeView;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

public class FileVision extends EmfViewPart {

	@Inject
	IEventBroker eventBroker;

	@Override
	public Parent create() {
		TreeView<File> fileView = new TreeView<>(new SimpleFileTreeItem(new File("C:\\")));
		fileView.setCellFactory(new Callback<TreeView<File>, TreeCell<File>>() {
			@Override
			public TreeCell<File> call(TreeView<File> param) {
				return new TreeCell<File>() {
					@Override
					protected void updateItem(File item, boolean empty) {
						super.updateItem(item, empty);
						if (item == null || empty) {
							setText(null);
							setGraphic(null);
						}else {
							setText(item.getName());
							if (item.isDirectory()) {
								setGraphic(new ImageView("/de/dc/minion/model/addon/fileview/images/icons8-mappe-16.png"));
							}else {
								setGraphic(new ImageView(SystemIconsHelper.getFileIcon(item.getName())));
							}
						}
					}
				};
			}
		});
		return fileView;
	}

	@Subscribe
	public void subscribeRenderPdf(EventContext<String> context) {
		if (context.getEventId().equals("/open/dcm/file")) {
			String input = context.getInput();
			Path path = Paths.get(input);
			Path fileName = path.getFileName();

			setText(fileName.toString());
		}

	}
}

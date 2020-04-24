package de.dc.minion.model.addon.fileview.touch;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

import de.dc.minion.model.addon.fileview.component.SimpleFileTreeItem;
import de.dc.minion.model.addon.fileview.component.cell.FileTreeCell;
import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import javafx.scene.Parent;
import javafx.scene.control.TreeView;

public class FileVision extends EmfViewPart {

	@Inject
	IEventBroker eventBroker;

	@Override
	public Parent create() {
		TreeView<File> fileView = new TreeView<>(new SimpleFileTreeItem(new File("C:\\")));
		fileView.setCellFactory(cell -> new FileTreeCell());
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

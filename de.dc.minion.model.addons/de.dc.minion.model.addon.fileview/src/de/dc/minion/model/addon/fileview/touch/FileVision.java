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
import javafx.beans.value.ChangeListener;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class FileVision extends EmfViewPart {

	@Inject
	IEventBroker eventBroker;

	@Override
	public Parent create() {
		VBox vbox = new VBox(1);

		HBox hBox = new HBox();
		TextField textPath = new TextField();
		TextField textSearch = new TextField();
		HBox.setHgrow(textPath, Priority.ALWAYS);
		hBox.getChildren().addAll(textPath, textSearch);

		String currentPath = "C:\\";
		textPath.setText(currentPath);
		TreeView<File> fileView = new TreeView<>(new SimpleFileTreeItem(new File(currentPath)));
		fileView.setCellFactory(cell -> new FileTreeCell());
		VBox.setVgrow(fileView, Priority.ALWAYS);
		vbox.getChildren().addAll(hBox, fileView);

		fileView.getSelectionModel().selectedItemProperty()
				.addListener((ChangeListener<TreeItem<File>>) (observable, oldValue, newValue) -> {
					if (newValue != null) {
						textPath.setText(newValue.getValue().getAbsolutePath());
					}
				});

		return vbox;
	}

	@Subscribe
	public void subscribeRenderPdf(EventContext<String> context) {
		if (context.getEventId().equals("/open/file")) {
			String input = context.getInput();
			Path path = Paths.get(input);
			Path fileName = path.getFileName();

			setText(fileName.toString());
		}
	}
}

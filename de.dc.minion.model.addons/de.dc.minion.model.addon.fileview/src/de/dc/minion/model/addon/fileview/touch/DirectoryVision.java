package de.dc.minion.model.addon.fileview.touch;

import java.io.File;

import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.VBox;

public class DirectoryVision extends FileVision{

	private ObservableList<File> files;
	
	
	@Override
	public Parent create() {
		files = FXCollections.observableArrayList();
		
		setShowOnlyDirectory(true);
		ListView<File> listViewFiles = new ListView<>();
		listViewFiles.setItems(files);
		
		VBox filePane = createFileView();

		fileView.getSelectionModel().selectedItemProperty()
		.addListener((ChangeListener<TreeItem<File>>) (observable, oldValue, newValue) -> {
			if (newValue != null) {
				files.clear();
				File folder = newValue.getValue();
				files.addAll(folder.listFiles());
				textPath.setText(folder.getAbsolutePath());
			}
		});
		
		return new SplitPane(filePane, listViewFiles);
	}
}

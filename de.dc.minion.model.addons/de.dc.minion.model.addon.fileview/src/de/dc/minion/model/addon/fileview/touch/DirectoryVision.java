package de.dc.minion.model.addon.fileview.touch;

import java.io.File;

import de.dc.minion.model.addon.fileview.util.SystemIconsHelper;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TreeItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

public class DirectoryVision extends FileVision{

	private ObservableList<File> files;
	
	
	@Override
	public Parent create() {
		files = FXCollections.observableArrayList();
		
		setShowOnlyDirectory(true);
		ListView<File> listViewFiles = new ListView<>();
		listViewFiles.setItems(files);
		listViewFiles.setCellFactory(new Callback<ListView<File>, ListCell<File>>() {
			@Override
			public ListCell<File> call(ListView<File> param) {
				return new ListCell<File>() {
					@Override
					protected void updateItem(File item, boolean empty) {
						super.updateItem(item, empty);
						if (item==null || empty) {
							setText(null);
							setGraphic(null);
						}else {
							HBox hBox = new HBox(5);
							hBox.getChildren().add(new ImageView(SystemIconsHelper.getFileIcon(item.getName())));
							hBox.getChildren().add(new Label(item.getName()));
							setGraphic(hBox);
						}
					}
				};
			}
		});
		
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

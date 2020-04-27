package de.dc.minion.model.addon.fileview.touch;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

import org.apache.commons.io.FileUtils;

import de.dc.minion.model.addon.fileview.util.SystemIconsHelper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

public class DirectoryTableVision extends FileVision {

	private ObservableList<File> files;
	private FilteredList<File> filteredFiles;

	@Override
	public Parent create() {
		files = FXCollections.observableArrayList();
		filteredFiles = new FilteredList<File>(files);
		
		setShowOnlyDirectory(true);
		VBox vBox = new VBox();
		TableView<File> view = new TableView<>();
		TableColumn<File, String> columnName = new TableColumn<File, String>("Name");
		columnName.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getName()));
		columnName.setCellFactory(new Callback<TableColumn<File, String>, TableCell<File, String>>() {
			@Override
			public TableCell<File, String> call(TableColumn<File, String> param) {
				return new TableCell<File, String>() {
					@Override
					protected void updateItem(String item, boolean empty) {
						super.updateItem(item, empty);
						if (item == null || empty) {
							setGraphic(null);
							setText(null);
						} else {
							HBox hBox = new HBox(5);
							hBox.getChildren().add(new ImageView(SystemIconsHelper.getFileIcon(item)));
							hBox.getChildren().add(new Label(item));
							setGraphic(hBox);
						}
					}
				};
			}
		});
		columnName.setPrefWidth(300);
		view.getColumns().add(columnName);

		TableColumn<File, String> columnSize = new TableColumn<File, String>("Size");
		columnSize.setCellValueFactory(param -> new SimpleStringProperty(
				String.valueOf(FileUtils.byteCountToDisplaySize(param.getValue().length()))));
		columnSize.setPrefWidth(100);
		view.getColumns().add(columnSize);
		view.setItems(filteredFiles);
		view.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<File>() {
			@Override
			public void changed(ObservableValue<? extends File> observable, File oldValue, File newValue) {
				if (newValue != null) {
					BasicFileAttributeView bv = Files.getFileAttributeView(newValue.toPath(), BasicFileAttributeView.class);
					try {
						BasicFileAttributes ba = bv.readAttributes();
						System.out.println(ba.creationTime());
						System.out.println(ba.lastAccessTime());
						System.out.println(ba.lastModifiedTime());
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		VBox.setVgrow(view, Priority.ALWAYS);

		TextField textSearchFile = new TextField();
		textSearchFile.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (newValue!=null) {
					filteredFiles.setPredicate(p->{
						return p.getName().toLowerCase().contains(newValue.toLowerCase());
					});
				}
			}
		});
		
		vBox.getChildren().add(textSearchFile);
		vBox.getChildren().add(view);

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

		SplitPane parent = new SplitPane(filePane, vBox);
		parent.setDividerPosition(0, 0.1);
		return parent;
	}
}

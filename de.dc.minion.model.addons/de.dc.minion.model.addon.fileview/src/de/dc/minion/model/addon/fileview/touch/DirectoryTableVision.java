package de.dc.minion.model.addon.fileview.touch;

import java.io.File;

import org.apache.commons.io.FileUtils;

import de.dc.minion.model.addon.fileview.util.SystemIconsHelper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

public class DirectoryTableVision extends FileVision{

	private ObservableList<File> files;
	
	@Override
	public Parent create() {
		files = FXCollections.observableArrayList();
		
		setShowOnlyDirectory(true);
		TableView<File> view = new TableView<>();
		TableColumn<File, String> columnName = new TableColumn<File, String>("Name");
		columnName.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getName()));
		columnName.setCellFactory(new Callback<TableColumn<File,String>, TableCell<File,String>>() {
			@Override
			public TableCell<File, String> call(TableColumn<File, String> param) {
				return new TableCell<File, String>(){
					@Override
					protected void updateItem(String item, boolean empty) {
						super.updateItem(item, empty);
						if (item==null || empty) {
							setGraphic(null);
							setText(null);
						}else {
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
		columnSize.setCellValueFactory(param -> new SimpleStringProperty(String.valueOf(FileUtils.byteCountToDisplaySize(param.getValue().length()))));
		columnSize.setPrefWidth(100);
		view.getColumns().add(columnSize);
		view.setItems(files);
		
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
		
		SplitPane parent = new SplitPane(filePane, view);
		parent.setDividerPosition(0, 0.2);
		return parent;
	}
}

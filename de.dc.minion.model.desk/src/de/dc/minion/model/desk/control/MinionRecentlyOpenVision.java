package de.dc.minion.model.desk.control;

import java.io.File;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

import de.dc.minion.fx.model.RecentlyOpenFile;
import de.dc.minion.fx.model.RecentlyOpenVision;
import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.common.event.ISelectionService;
import de.dc.minion.model.common.file.RecentlyOpenFilesReader;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class MinionRecentlyOpenVision extends EmfViewPart{

	@Inject ISelectionService selectionService;
	@Inject IEventBroker eventBroker;
	
	RecentlyOpenFilesReader minionFile = new RecentlyOpenFilesReader();
	ObservableList<RecentlyOpenFile> files;
	File fileRecentlyOpenFiles = new File("./config/recentlyopenfiles.minion");
	
	@Override
	public Parent create() {
		files = FXCollections.observableArrayList();
		FilteredList<RecentlyOpenFile> filteredFiles = new FilteredList<>(files);
		
		VBox vbox = new VBox();
		
		ListView<RecentlyOpenFile> listView = new ListView<>();
		listView.setItems(filteredFiles);
		listView.setCellFactory(param -> new ListCell<RecentlyOpenFile>() {
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
		});
		listView.setOnMouseClicked(event -> {
			if (event.getClickCount()==2) {
				String selection = listView.getSelectionModel().getSelectedItem().getPath();
				eventBroker.post(new EventContext<>("open.editor", selection));
			}
		});
		
		HBox hbox = new HBox();
		
		TextField textSearch = new TextField();
		textSearch.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (newValue!=null) {
					filteredFiles.setPredicate(p->{
						boolean isEmpty = p.getName().isEmpty();
						boolean containsName = p.getName().toLowerCase().contains(newValue.toLowerCase());
						return isEmpty || containsName;
					});
				}
			}
		});
		
		HBox.setHgrow(textSearch, Priority.ALWAYS);
		
		Button buttonRefresh = new Button("Refresh");
		buttonRefresh.setOnAction(e->refreshListView());
		
		hbox.getChildren().add(textSearch);
		hbox.getChildren().add(buttonRefresh);
		
		vbox.getChildren().add(hbox);
		VBox.setVgrow(listView, Priority.ALWAYS);
		vbox.getChildren().add(listView);
		return vbox;
	}
	
	@Override
	public void initialize() {
		refreshListView();
		eventBroker.register(this);
	}
	
	@Subscribe
	public void addRecentlyOPenFile(EventContext<File> context) {
		if (context.getEventId().equals("add/recently/open/file")) {
			File input = context.getInput();
			RecentlyOpenFile openFile = minionFile.addFile(input);
			files.add(openFile);
		}
	}

	private void refreshListView() {
		if (fileRecentlyOpenFiles.exists()) {
			files.clear();
			RecentlyOpenVision minion = minionFile.load(fileRecentlyOpenFiles.getAbsolutePath());
			files.addAll(minion.getFiles());
		}
	}
}

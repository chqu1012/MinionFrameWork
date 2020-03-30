package de.dc.minion.model.addon.pdfview.touch;

import java.io.File;

import com.google.inject.Inject;

import de.dc.minion.fx.model.RecentlyOpenFile;
import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.common.file.RecentlyOpenFilesReader;
import de.dc.minion.model.desk.control.feature.RecentFilesListCell;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class RecentPdfVision extends EmfViewPart{

	@Inject IEventBroker eventBroker;
	
	RecentlyOpenFilesReader minionFile = new RecentlyOpenFilesReader();
	ObservableList<RecentlyOpenFile> files;
	File fileRecentlyOpenFiles = new File("./config/recentlyopenpdfs.minion");
	
	@Override
	public Parent create() {
//		MinionPlatform.inject(this);
		files = FXCollections.observableArrayList();
		FilteredList<RecentlyOpenFile> filteredFiles = new FilteredList<>(files);
		
		VBox parent = new VBox();
		TextField textSearch = new TextField();
		textSearch.setPromptText("Search for pdfs...");
		ListView<RecentlyOpenFile> listView = new ListView<>();
		listView.setItems(filteredFiles);
		listView.setCellFactory(param -> new RecentFilesListCell());
		listView.setOnMouseClicked(event -> {
			if (event.getClickCount()==2) {
//				String selection = listView.getSelectionModel().getSelectedItem().getPath();
				eventBroker.post(new EventContext<>("/open/pdf/file", "C:\\Development\\Repository\\MinionFrameWork\\de.dc.minion.model.addons\\de.dc.minion.model.addon.pdfview\\resources\\dummy.pdf"));
			}
		});
		
		VBox.setVgrow(listView, Priority.ALWAYS);
		parent.getChildren().add(textSearch);
		parent.getChildren().add(listView);
		return parent;
	}

}

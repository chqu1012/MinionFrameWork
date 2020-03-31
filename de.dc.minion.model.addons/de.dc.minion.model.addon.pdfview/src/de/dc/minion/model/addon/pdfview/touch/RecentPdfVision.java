package de.dc.minion.model.addon.pdfview.touch;

import java.io.File;
import java.util.Date;

import org.eclipse.emf.common.util.ECollections;

import com.google.inject.Inject;

import de.dc.minion.fx.model.MinionFactory;
import de.dc.minion.fx.model.RecentlyOpenFile;
import de.dc.minion.fx.model.RecentlyOpenVision;
import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.common.file.RecentlyOpenFilesReader;
import de.dc.minion.model.desk.control.feature.RecentFilesListCell;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class RecentPdfVision extends EmfViewPart{

	@Inject IEventBroker eventBroker;
	
	RecentlyOpenFilesReader minionFile;
	ObservableList<RecentlyOpenFile> files;
	File fileRecentlyOpenFiles;

	RecentlyOpenVision vision;
	
	@Override
	public Parent create() {
		files = FXCollections.observableArrayList();
		fileRecentlyOpenFiles = new File("./config/recentlyopenpdfs.minion");
		minionFile = new RecentlyOpenFilesReader();
		
		FilteredList<RecentlyOpenFile> filteredFiles = new FilteredList<>(files);
		
		if (!fileRecentlyOpenFiles.exists()) {
			vision = MinionFactory.eINSTANCE.createRecentlyOpenVision();
			vision.setName("Recent Open Pdfs");
			minionFile.write(vision, fileRecentlyOpenFiles.getAbsolutePath());
		}else {
			vision = minionFile.load(fileRecentlyOpenFiles.getAbsolutePath());
			ECollections.reverse(vision.getFiles());
			files.addAll(vision.getFiles());
		}
		
		VBox parent = new VBox();
		
		HBox hbox = new HBox();
		TextField textSearch = new TextField();
		textSearch.setPromptText("Search for pdfs...");
		hbox.getChildren().add(textSearch);
		Button buttonOpenPdf = new Button("Open");
		buttonOpenPdf.setOnAction(e->{
			FileChooser chooser = new FileChooser();
			File file = chooser.showOpenDialog(new Stage());
			if (file != null) {
				RecentlyOpenFile newFile = MinionFactory.eINSTANCE.createRecentlyOpenFile();
				newFile.setName(file.getName());
				newFile.setPath(file.getAbsolutePath());
				newFile.setTimestamp(new Date());
				vision.getFiles().add(newFile);
				files.add(0, newFile);
				minionFile.write(vision, fileRecentlyOpenFiles.getAbsolutePath());
				eventBroker.post(new EventContext<>("/open/pdf/file", file.getAbsolutePath()));
			}
		});
		hbox.getChildren().add(buttonOpenPdf);
		
		ListView<RecentlyOpenFile> listView = new ListView<>();
		listView.setItems(filteredFiles);
		listView.setCellFactory(param -> new RecentFilesListCell());
		listView.setOnMouseClicked(event -> {
			if (event.getClickCount()==2) {
				String selection = listView.getSelectionModel().getSelectedItem().getPath();
				eventBroker.post(new EventContext<>("/open/pdf/file", selection));
			}
		});
		
		VBox.setVgrow(listView, Priority.ALWAYS);
		parent.getChildren().add(hbox);
		parent.getChildren().add(listView);
		return parent;
	}

}

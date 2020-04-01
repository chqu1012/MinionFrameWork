package de.dc.minion.model.desk.control;

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
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public abstract class BaseMinionRecentlyOpenVision extends EmfViewPart{

	@Inject IEventBroker eventBroker;
	
	protected RecentlyOpenFilesReader minionFile;
	protected ObservableList<RecentlyOpenFile> files;
	protected File fileRecentlyOpenFiles;

	protected RecentlyOpenVision vision;

	private ListView<RecentlyOpenFile> listView;

	private FilteredList<RecentlyOpenFile> filteredFiles;
	
	@Override
	public Parent create() {
		MinionPlatform.inject(this);
		
		files = FXCollections.observableArrayList();
		fileRecentlyOpenFiles = new File(getFolder()+getFileName());
		minionFile = new RecentlyOpenFilesReader();
		filteredFiles = new FilteredList<>(files);
		
		if (!fileRecentlyOpenFiles.exists()) {
			vision = MinionFactory.eINSTANCE.createRecentlyOpenVision();
			vision.setName(getVisionName());
			minionFile.write(vision, fileRecentlyOpenFiles.getAbsolutePath());
		}else {
			vision = minionFile.load(fileRecentlyOpenFiles.getAbsolutePath());
			ECollections.reverse(vision.getFiles());
			files.addAll(vision.getFiles());
		}
		
		VBox parent = new VBox();
		
		HBox hbox = new HBox();
		TextField textSearch = new TextField();
		textSearch.setPromptText("Search for "+getFileType()+"...");
		textSearch.textProperty().addListener(this::onTextSearchChanged);
		hbox.getChildren().add(textSearch);
		HBox.setHgrow(textSearch, Priority.ALWAYS);
		Button buttonOpen = new Button("Open");
		buttonOpen.setOnAction(this::onOpenFile);
		hbox.getChildren().add(buttonOpen);
		
		listView = new ListView<>();
		listView.setItems(filteredFiles);
		listView.setCellFactory(param -> new RecentFilesListCell());
		listView.setOnMouseClicked(this::onListViewMouseClicked);
		
		VBox.setVgrow(listView, Priority.ALWAYS);
		parent.getChildren().add(hbox);
		parent.getChildren().add(listView);
		return parent;
	}
	
	protected void onListViewMouseClicked(MouseEvent e) {
		if (e.getClickCount()==2) {
			String selection = listView.getSelectionModel().getSelectedItem().getPath();
			eventBroker.post(new EventContext<>("/open/"+getFileType()+"/file", selection));
		}
	}
	
	protected void onOpenFile(ActionEvent e) {
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
			eventBroker.post(new EventContext<>("/open/"+getFileType()+"/file", file.getAbsolutePath()));
		}
	}
	
	protected void onTextSearchChanged(ObservableValue<? extends String> observable, String oldValue, String newValue) {
		if (newValue!=null) {
			filteredFiles.setPredicate(p->{
				return p.getName().toLowerCase().contains(newValue.toLowerCase()) || p.getPath().contains(newValue.toLowerCase());
			});
		}
	}
	
	protected String getFileType() {
		return "pdf";
	}

	protected String getFolder() {
		return "./config/";
	}

	protected String getVisionName() {
		return "Recent Open "+getFileType()+" Files";
	}

	protected String getFileName() {
		return "recentlyopen"+getFileType()+"s.minion";
	}
}

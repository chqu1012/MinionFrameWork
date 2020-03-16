package de.dc.minion.model.desk.controller;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

import com.google.inject.Inject;

import de.dc.minion.model.common.control.IEmfEditorPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.common.file.IEmfFileManager;
import de.dc.minion.model.desk.control.ILandscapeFX;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import javafx.util.Callback;

public class EmfFileWizard extends BorderPane implements ILandscapeFX {

    @FXML
    private BorderPane root;

    @FXML
    private VBox paneFileDirectory;

    @FXML
    private TextField textDirectory;

    @FXML
    private Button buttonOpenDirectory;

    @FXML
    private CheckBox checkBoxOpenTreeView;

    @FXML
    private TreeView<File> treeViewFile;

    @FXML
    private TextField textFilename;

    @FXML
    private Label labelFilenameHint;

    @FXML
    private VBox paneWizard;

    @FXML
    private TextField textSearch;

    @FXML
    private ListView<String> listViewWizards;

    @FXML
    private Button buttonHelp;

    @FXML
    private Button buttonBack;

    @FXML
    private Button buttonNext;

    @FXML
    private Button buttonFinish;

    @FXML
    private Button buttonCancel;
	
	@Inject
	IEmfFileManager fileManager;

	@Inject
	IEventBroker eventBroker;

	private ObservableList<String> masterData = FXCollections.observableArrayList();
	private FilteredList<String> filteredData = new FilteredList<>(masterData);
	private ObservableList<String> sortedData = new SortedList<>(filteredData);

	StringProperty extProperty = new SimpleStringProperty();
	File lastOpenDirectory;
	
	public EmfFileWizard() {
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("/de/dc/minion/model/desk/control/EmfFileWizard.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}

		listViewWizards.setItems(sortedData);

		textSearch.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (newValue != null) {
					filteredData.setPredicate(p -> {
						return p.toLowerCase().contains(newValue.toLowerCase());
					});
				}
			}
		});

		BooleanBinding directoryEmpty = textDirectory.textProperty().isEmpty();
		BooleanBinding filenameEmpty = textFilename.textProperty().isEmpty();
		buttonFinish.disableProperty().bind(directoryEmpty.or(filenameEmpty));

		BooleanBinding emptySelection = listViewWizards.getSelectionModel().selectedItemProperty().isNull();
		buttonNext.disableProperty().bind(emptySelection);

		buttonBack.setDisable(false);
		
		labelFilenameHint.visibleProperty().bind(textFilename.textProperty().isNotEmpty());
		labelFilenameHint.textProperty().bind(textDirectory.textProperty().concat("\\").concat(textFilename.textProperty().concat(".").concat(extProperty)));
		
		treeViewFile.visibleProperty().bind(checkBoxOpenTreeView.selectedProperty());
		treeViewFile.setRoot(new SimpleFileTreeItem(new File("C:\\")));
		treeViewFile.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TreeItem<File>>() {
			@Override
			public void changed(ObservableValue<? extends TreeItem<File>> observable, TreeItem<File> oldValue,
					TreeItem<File> newValue) {
				if (newValue!=null) {
					File value = newValue.getValue();
					textDirectory.setText(value.getAbsolutePath());
				}
			}
		});
		treeViewFile.setCellFactory(new Callback<TreeView<File>, TreeCell<File>>() {
			@Override
			public TreeCell<File> call(TreeView<File> param) {
				return new TreeCell<File>() {
					@Override
					protected void updateItem(File item, boolean empty) {
						super.updateItem(item, empty);
						if (item==null || empty) {
							setText(null);
						}else {
							setText(item.getName());
						}
					}
				};
			}
		});
	}

	@Override
	public void init() {
		paneWizard.toFront();
		
		masterData.clear();
		masterData.addAll(fileManager.getAllExtensions());
		
		textDirectory.setText("");
		textFilename.setText("");
		textSearch.setText("");
	}

	@FXML
	void onButtonAction(ActionEvent event) {
		Object source = event.getSource();
		if (source == buttonCancel) {
			root.toBack();
		} else if (source == buttonFinish) {
			String directory = textDirectory.getText();
			String filename = textFilename.getText();
			String ext = listViewWizards.getSelectionModel().getSelectedItem();
			String path = directory + "/" + filename + "." + ext;

			Optional<IEmfEditorPart<?>> editorPart = fileManager.getEditorByExtension(ext);
			if (editorPart.isPresent()) {
				editorPart.get().save(new File(path));
			}

			eventBroker.post(new EventContext<>("open.editor", path));
			root.toBack();
		} else if (source == buttonNext) {
			paneFileDirectory.toFront();
		} else if (source == buttonBack) {
			paneWizard.toFront();
		} else if (source == buttonOpenDirectory) {
			DirectoryChooser chooser = new DirectoryChooser();
			if (lastOpenDirectory!=null) {
				chooser.setInitialDirectory(lastOpenDirectory);
			}
			File folder = chooser.showDialog(new Stage());
			if (folder!=null) {
				lastOpenDirectory = folder;
				textDirectory.setText(folder.getAbsolutePath());
			}
		}
	}

	@FXML
	void onListViewMouseClicked(MouseEvent event) {
		Object source = event.getSource();
		if (event.getClickCount() == 2 && source == listViewWizards) {
			paneFileDirectory.toFront();
		}
		extProperty.set(listViewWizards.getSelectionModel().getSelectedItem());
	}

	@Override
	public TabPane getEditorArea() {
		return null;
	}

	@Override
	public void hideRight(boolean hide) {
	}

	@Override
	public void hideLeft(boolean hide) {
	}

	@Override
	public void hideBottom(boolean hide) {
	}
}

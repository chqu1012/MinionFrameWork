package de.dc.minion.model.desk.metro.component;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.eclipse.fx.ui.controls.styledtext.StyledTextArea;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

import de.dc.minion.fx.model.Command;
import de.dc.minion.fx.model.Landscape;
import de.dc.minion.fx.model.Minion;
import de.dc.minion.fx.model.Toady;
import de.dc.minion.fx.model.ToadyStatus;
import de.dc.minion.model.common.IControlManager;
import de.dc.minion.model.common.command.ICommandService;
import de.dc.minion.model.common.control.IEmfEditorPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.common.event.ISelectionService;
import de.dc.minion.model.common.file.IEmfFileManager;
import de.dc.minion.model.common.file.MinionFile;
import de.dc.minion.model.desk.control.ILandscapeFX;
import de.dc.minion.model.desk.control.MinionConstants;
import de.dc.minion.model.desk.control.MinionDeskFX;
import de.dc.minion.model.desk.metro.MinionRibbonBuilder;
import de.dc.minion.model.desk.metro.component.cell.CommandListCell;
import de.dc.minion.model.desk.metro.component.cell.LandscapeListCell;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MinionRibbonControl extends BaseMinionRibbonControl {

	public static final String ID = "de.dc.minion.model.desk.metro.component.MinionRibbonControl";

	private static final Logger LOG = Logger.getLogger(MinionRibbonControl.class.getName());

	protected ILandscapeFX currentLandscape;
	protected Map<Landscape, ILandscapeFX> perspectiveManager = new HashMap<>();

	protected ObservableList<Landscape> landscapes = FXCollections.observableArrayList();
	protected FilteredList<Landscape> filteredLandscapes = new FilteredList<>(landscapes);

	protected ObservableList<Command> commands = FXCollections.observableArrayList();
	protected FilteredList<Command> filteredCommands = new FilteredList<>(commands);

	@Inject
	protected MinionFile minionFile;

	@Inject
	protected IEventBroker eventBroker;

	@Inject
	protected ISelectionService selectionService;

	@Inject
	protected MinionRibbonBuilder minionBuilder;

	@Inject
	protected IControlManager controlManager;

	@Inject
	protected IEmfFileManager fileManager;

	@Inject
	protected ICommandService commandService;

	public MinionRibbonControl() {
		MinionPlatform.inject(this);
		eventBroker.register(this);

		loadFxml();
		registerTourches();
	}

	public void initialize() {
		listViewLandscapes.setItems(filteredLandscapes);
		listViewLandscapes.setCellFactory(param -> new LandscapeListCell());
		textSearchlandscapes.textProperty().addListener(this::onTextSearchLandscapes);
		
		listViewCommands.setItems(filteredCommands);
		listViewCommands.setCellFactory(param -> new CommandListCell());
		listViewCommands.setOnMouseClicked(this::onMouseClicked);
		textSearchCommand.textProperty().addListener(this::onTextSearchCommands);
	}

	private void onTextSearchCommands(ObservableValue<? extends String> observable, String oldValue,
			String newValue) {
		if (newValue != null) {
			filteredCommands.setPredicate(p -> {
				boolean isEmpty = p.getName().isEmpty() || p.getName() == null;
				boolean containsName = p.getName().toLowerCase().contains(newValue.toLowerCase());
				return isEmpty || containsName;
			});
		}
	}

	private void onTextSearchLandscapes(ObservableValue<? extends String> observable, String oldValue,
			String newValue) {
		if (newValue != null) {
			filteredLandscapes.setPredicate(p -> {
				boolean isEmpty = p.getName().isEmpty() || p.getName() == null;
				boolean containsName = p.getName().toLowerCase().contains(newValue.toLowerCase());
				return isEmpty || containsName;
			});
		}
	}

	private void loadFxml() {
		String fxmlName = "/de/dc/minion/model/desk/metro/MinionRibbon.fxml";
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlName));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			LOG.log(Level.SEVERE, "Error loading fxml " + exception.getLocalizedMessage());
		}
	}

	public void registerTourches() {
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		URL[] urls = ((URLClassLoader) cl).getURLs();
		Arrays.asList(urls).stream().forEach(e -> loadMinionFile(e.getFile()));
	}

	private void loadMinionFile(String file) {
		file = file + "desk.minion";
		File minionFile = new File(file);
		if (minionFile.exists()) {
			MinionFile efile = new MinionFile();
			Minion minion = efile.load(minionFile.getAbsolutePath());
			Toady toady = minion.getToadies().get(0);
			if (toady.getStatus() == ToadyStatus.STARTED) {
				minionBuilder.setDesk(this);
				minionBuilder.doSwitch(minion);
			}
		}
	}

	@Override
	protected void onButtonAction(ActionEvent event) {
		Object source = event.getSource();
		if (source == buttonOpen) {
			commandService.execute("open.file");
		} else if (source == buttonNew) {
			openLandscapeById("emf.file.wizard");
		} else if (source == buttonSave) {
			commandService.execute("save.as.file");
		} else if (source == buttonSaveAs) {
			commandService.execute("save.as.file");
		} else if (source == buttonTouchManager) {
			commandService.execute("open.emf.touch.manager");
		}
	}

	public void addCommands(Command command) {
		Platform.runLater(() -> {
			Button buttonCommand = new Button(command.getName());
			buttonCommand.setMaxSize(60, Double.MAX_VALUE);
			buttonCommand.setContentDisplay(ContentDisplay.TOP);
			buttonCommand.setTooltip(new Tooltip(command.getName()));
			buttonCommand.setOnAction(e -> commandService.execute(command.getId()));
			ImageView imageView = new ImageView("/de/dc/minion/model/desk/metro/images/icons8-air-play-48.png");
			imageView.setFitHeight(32);
			imageView.setFitWidth(32);
			buttonCommand.setGraphic(imageView);
			hboxRegisteredCommands.getChildren().add(buttonCommand);
			commands.add(command);
		});
	}

	public void addLandscapeFX(Landscape landscape, ILandscapeFX landscapeFX) {
		if (!landscape.isUseAsPage()) {
			landscapes.add(landscape);
		}
		perspectiveManager.put(landscape, landscapeFX);
		stackPaneMain.getChildren().add((Node) landscapeFX);
		this.currentLandscape = landscapeFX;
	}

	@Override
	protected void onMouseClicked(MouseEvent event) {
		Object source = event.getSource();
		if (event.getClickCount() == 2) {
			if (source == listViewLandscapes) {
				Landscape selection = listViewLandscapes.getSelectionModel().getSelectedItem();
				switchPerspective(selection);
			}else if (source == listViewCommands) {
				Command selection = listViewCommands.getSelectionModel().getSelectedItem();
				if (selection!=null) {
					commandService.execute(selection.getId());
				}
			}
		}
	}

	@Subscribe
	public void openFile(EventContext<?> context) {
		Object input = context.getInput();
		if (context.getEventId().equals("open.editor")) {
			File file = new File((String) input);
			String filename = file.getName();
			if (!filename.isEmpty()) {
				if (!isFileOpen(filename)) {
					String extension = FilenameUtils.getExtension(filename);
					Optional<IEmfEditorPart<?>> editorPart = fileManager.getEditorByExtension(extension);
					editorPart.ifPresent(e -> createEditor(file, filename, e));
					if (!editorPart.isPresent()) {
						openDialogForTouchManager(extension);
					}
				} else {
					getTabByName(filename).ifPresent(e -> {
						SingleSelectionModel<Tab> selectionModel = currentLandscape.getEditorArea().getSelectionModel();
						selectionModel.select(e);
					});
				}
			} else {
				createEditorDefault(file, filename);
			}
		}
	}

	private void openDialogForTouchManager(String extension) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("File Extension " + extension + " not registered");
		alert.setHeaderText("Toady not loaded or not available");
		alert.setContentText("Do you want to open the Touch Manager?");

		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK) {
			eventBroker.post(new EventContext<>(MinionConstants.EVENT_OPEN_LANDSCAPE_ID,
					MinionConstants.LANDSCAPE_TOUCH_MANAGER));
		}
	}

	private void createEditorDefault(File file, String filename) {
		StyledTextArea styledTextArea = new StyledTextArea();
		try {
			styledTextArea.getContent().setText(FileUtils.readFileToString(file, StandardCharsets.UTF_8));
			Tab editorTab = new Tab(filename);
			editorTab.setContent(styledTextArea);
			currentLandscape.getEditorArea().getTabs().add(editorTab);
			currentLandscape.getEditorArea().getSelectionModel().select(editorTab);
		} catch (IOException e1) {
			LOG.log(Level.SEVERE, "Failed to open file " + filename);
		}
	}

	private void createEditor(File file, String filename, IEmfEditorPart<?> e) {
		try {
			IEmfEditorPart<?> editor = e.getClass().newInstance();
			MinionPlatform.inject(editor);
			Tab editorTab = new Tab(file.getName());
			editor.load(file);
			editorTab.setContent((Node) editor);
			currentLandscape.getEditorArea().getTabs().add(editorTab);
			currentLandscape.getEditorArea().getSelectionModel().select(editorTab);
		} catch (InstantiationException | IllegalAccessException e1) {
			LOG.log(Level.SEVERE, "Failed to open editor " + filename);
		}
	}

	public boolean isFileOpen(String name) {
		return currentLandscape.getEditorArea().getTabs().stream().anyMatch(e -> e.getText().equalsIgnoreCase(name));
	}

	public Optional<Tab> getTabByName(String name) {
		return currentLandscape.getEditorArea().getTabs().stream().filter(e -> e.getText().equalsIgnoreCase(name))
				.findAny();
	}

	public void switchPerspective(Landscape landscape) {
		ILandscapeFX openLandscape = perspectiveManager.get(landscape);
		if (openLandscape != null) {
			this.currentLandscape = openLandscape;
			controlManager.registrate(MinionDeskFX.EDITOR_AREA_ID, currentLandscape.getEditorArea());
			labelLandscape.setText(landscape.getName());
			((Parent) openLandscape).toFront();
		}
	}

	@Subscribe
	public void openLandscapeBy(EventContext<String> context) {
		if (context.getEventId().equals(MinionConstants.EVENT_OPEN_LANDSCAPE_ID)) {
			openLandscapeById(context.getInput());
		}
	}

	private void openLandscapeById(String landscapeId) {
		perspectiveManager.entrySet().stream().filter(p -> {
			String id = p.getKey().getId();
			if (id == null) {
				return false;
			}
			return id.equals(landscapeId);
		}).findAny().ifPresent(l -> {
			l.getValue().init();
			((Parent) l.getValue()).toFront();
		});
	}
}

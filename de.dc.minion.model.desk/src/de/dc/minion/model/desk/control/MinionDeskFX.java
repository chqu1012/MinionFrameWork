package de.dc.minion.model.desk.control;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.eclipse.fx.ui.controls.styledtext.StyledTextArea;

import com.google.common.base.Charsets;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

import de.dc.minion.fx.model.Landscape;
import de.dc.minion.fx.model.Minion;
import de.dc.minion.model.common.IControlManager;
import de.dc.minion.model.common.control.IEmfEditorPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.common.event.ISelectionService;
import de.dc.minion.model.common.file.IEmfFileManager;
import de.dc.minion.model.common.file.MinionFile;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public abstract class MinionDeskFX extends AbstractFxmlControl implements ChangeListener<Object> {

	public static final String ID = "de.dc.javafx.xcore.workbench.ui.control.EmfWorkbench";
	public static final String TOOLBAR_ID = "de.dc.javafx.xcore.workbench.ui.control.Toolbar";
	public static final String PERSPECTIVE_TOOLBAR_ID = "de.dc.javafx.xcore.workbench.ui.control.Perspective";
	public static final String STATUSLINE_ID = "de.dc.javafx.xcore.workbench.ui.control.Statusline";
	public static final String EDITOR_AREA_ID = "de.dc.javafx.xcore.workbench.ui.control.EditorArea";

	@FXML
	protected StackPane perspectiveArea;

	@FXML
	protected BorderPane root;

	@FXML
	protected ToolBar toolbar;

	@FXML
	protected ToolBar statusLine;

	@FXML
	protected ToolBar perspectiveToolbar;

	@FXML
	protected TextField searchText;

	@FXML
	protected Label statusLineLabel;

	@FXML
	protected Label statusLinePerspectiveLabel;

	@Inject
	protected MinionFile minionFile;

	@Inject
	protected IEventBroker eventBroker;

	@Inject
	protected ISelectionService selectionService;

	@Inject
	protected IControlManager controlManager;

	@Inject
	protected MinionBuilder minionBuilder;
	
	protected Minion minion;

	protected LandscapeFX currentLandscape;

	protected Map<String, Optional<LandscapeFX>> perspectiveManager = new HashMap<>();
	
	public MinionDeskFX() {
		MinionPlatform.inject(this);
		selectionService.addListener(this);
		eventBroker.register(this);

		controlManager.registrate(TOOLBAR_ID, getToolBar());
		controlManager.registrate(PERSPECTIVE_TOOLBAR_ID, getPerspectiveToolBar());
		
		registerTourches();
	}

	public void registerTourches() {
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		URL[] urls = ((URLClassLoader) cl).getURLs();

		for (URL url : urls) {
			String file = url.getFile();
			file = file+"desk.minion";
			File minionFile = new File(file);
			if (minionFile.exists()) {
				MinionFile efile = new MinionFile();
				Minion minion = efile.load(minionFile.getAbsolutePath());
				minionBuilder.setDesk(this);
				minionBuilder.doSwitch(minion);
			}
		}
	}

	public Minion getMinion() {
		if (minion == null) {
			String name = getClass().getResource(getClass().getSimpleName() + ".minion").getPath();
			minion = minionFile.load(name);
		}
		return minion;
	}

	public ToolBar getToolBar() {
		return toolbar;
	}

	public ToolBar getPerspectiveToolBar() {
		return perspectiveToolbar;
	}

	@Override
	protected String fxmlName() {
		return MinionDeskFX.class.getSimpleName();
	}

	@Override
	public void changed(ObservableValue<?> observable, Object oldValue, Object newValue) {
		statusLineLabel.setText("Selection: " + newValue.toString());
	}

	@Subscribe
	public void hideBottomTabPane(EventContext<Boolean> context) {
		if (context.getEventId().equals("workbench/hide/bottom")) {
			currentLandscape.hideBottom((Boolean) context.getInput());
		}
	}
	
	@Subscribe
	public void hideLeftTabPane(EventContext<Boolean> context) {
		if (context.getEventId().equals("workbench/hide/left")) {
			currentLandscape.hideLeft((Boolean) context.getInput());
		}
	}

	@Subscribe
	public void hideRightTabPane(EventContext<Boolean> context) {
		if (context.getEventId().equals("workbench/hide/right")) {
			currentLandscape.hideRight((Boolean) context.getInput());
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
					Optional<IEmfEditorPart<?>> editorPart = MinionPlatform.getInstance(IEmfFileManager.class)
							.getEditorByExtension(FilenameUtils.getExtension(filename));
					editorPart.ifPresent(e -> {
						try {
							IEmfEditorPart<?> editor = e.getClass().newInstance();
							MinionPlatform.inject(editor);
							Tab editorTab = new Tab(file.getName());
							editor.load(file);
							editorTab.setContent((Node) editor);
							currentLandscape.getEditorArea().getTabs().add(editorTab);
							currentLandscape.getEditorArea().getSelectionModel().select(editorTab);
						} catch (InstantiationException | IllegalAccessException e1) {
							e1.printStackTrace();
						}
					});
				}else {
					getTabByName(filename).ifPresent(e -> currentLandscape.getEditorArea().getSelectionModel().select(e));
				}
			} else {
				StyledTextArea styledTextArea = new StyledTextArea();
				try {
					styledTextArea.getContent().setText(FileUtils.readFileToString(file, Charsets.UTF_8));
					Tab editorTab = new Tab(filename);
					editorTab.setContent(styledTextArea);
					currentLandscape.getEditorArea().getTabs().add(editorTab);
					currentLandscape.getEditorArea().getSelectionModel().select(editorTab);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

//	@Subscribe
//	public void openPreview(EventContext<FXPreview> context) {
//		if (context.getEventId() != null && context.getEventId().equals("open.preview")) {
//			FXPreview input = context.getInput();
//			Tab preview = new Tab(input.getTitle());
//			DIPlatform.getInstance(IEmfSelectionService.class).addListener(input);
//			preview.setContent(input);
//			currentPerspective.getBottomTabPane().getTabs().add(preview);
//			currentPerspective.getBottomTabPane().getSelectionModel().select(preview);
//		}
//	}

	public boolean isFileOpen(String name) {
		return currentLandscape.getEditorArea().getTabs().stream().anyMatch(e -> e.getText().equalsIgnoreCase(name));
	}

	public Optional<Tab> getTabByName(String name) {
		return currentLandscape.getEditorArea().getTabs().stream().filter(e -> e.getText().equalsIgnoreCase(name))
				.findAny();
	}

	public void addLandscapeFX(String id, LandscapeFX landscapeFX) {
		perspectiveArea.getChildren().add(landscapeFX);
		perspectiveManager.put(id, Optional.of(landscapeFX));
		currentLandscape = landscapeFX;
	}
	
	public LandscapeFX getCurrentLandscape() {
		return currentLandscape;
	}

	public void switchPerspective(Landscape landscape) {
		Optional<LandscapeFX> optionalPerspective = perspectiveManager.get(landscape.getId());
		if (optionalPerspective != null) {
			optionalPerspective.ifPresent(perspective -> {
				currentLandscape = perspective;
				controlManager.registrate(MinionDeskFX.EDITOR_AREA_ID, currentLandscape.getEditorArea());
				statusLinePerspectiveLabel.setText(landscape.getName());
				perspective.toFront();
			});
		}
	}
}
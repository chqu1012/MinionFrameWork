package de.dc.minion.model.desk.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;

import de.dc.minion.model.common.IControlManager;
import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.control.IEmfEditorPart;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.common.file.IEmfFileManager;
import de.dc.minion.model.desk.control.dnd.DraggingTabPaneSupport;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.binding.IntegerBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

public class LandscapeFX extends SplitPane implements ILandscapeFX{

	public static final String LEFT_PANE_ID = "de.dc.javafx.xcore.workbench.ui.control.LeftPane";
	public static final String RIGHT_PANE_ID = "de.dc.javafx.xcore.workbench.ui.control.RightPane";
	public static final String BOTTOM_PANE_ID = "de.dc.javafx.xcore.workbench.ui.control.BottomPane";
	public static final String EDITOR_AREA_ID = "de.dc.javafx.xcore.workbench.ui.control.EditorArea";

	@FXML
	private SplitPane perspective;

	@FXML
	private TabPane leftTabPane;

	@FXML
	private TabPane editorArea;

	@FXML
	private AnchorPane rightPane;

	@FXML
	private TabPane rightTabPane;

	@FXML
	private TabPane bottomPane;

	@FXML
	private AnchorPane leftAnchorPane;
	
	@FXML
	private SplitPane topSplitPane;
	
	@Inject
	protected IEventBroker eventBroker;

	@Inject
	protected IControlManager controlManager;

	@Inject
	protected IEmfFileManager emfFileManager;

	public LandscapeFX() {
		MinionPlatform.inject(this);
		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/de/dc/minion/model/desk/control/LandscapeFX.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
		eventBroker.register(this);

		controlManager.registrate(BOTTOM_PANE_ID, getBottomTabPane());
		controlManager.registrate(LEFT_PANE_ID, getLeftTabPane());
		controlManager.registrate(RIGHT_PANE_ID, getRightTabPane());
		controlManager.registrate(EDITOR_AREA_ID, getEditorArea());

		// TabPane dnd support
		DraggingTabPaneSupport support = new DraggingTabPaneSupport();
		support.addSupport(bottomPane);
		support.addSupport(rightTabPane);
		support.addSupport(leftTabPane);

		editorArea.getSelectionModel().selectedItemProperty()
				.addListener((ChangeListener<Tab>) (observable, oldValue, newValue) -> {
					if (newValue != null) {
						Node content = newValue.getContent();
						if (content instanceof IEmfEditorPart) {
							IEmfEditorPart<?> editor = (IEmfEditorPart<?>) content;
							emfFileManager.setCurrentEditor(editor);
						}
					}
				});
	}

	public TabPane getLeftTabPane() {
		return leftTabPane;
	}

	public TabPane getRightTabPane() {
		return rightTabPane;
	}

	public TabPane getBottomTabPane() {
		return bottomPane;
	}

	public TabPane getEditorArea() {
		return editorArea;
	}

	@FXML
	protected void onEditorAreaCloseMenuItem(ActionEvent event) {
		Tab selection = editorArea.getSelectionModel().getSelectedItem();
		editorArea.getTabs().remove(selection);
	}

	@FXML
	protected void onEditorAreaCloseOthersMenuItem(ActionEvent event) {
		Tab selection = editorArea.getSelectionModel().getSelectedItem();
		List<Tab> toRemoveTabs = new ArrayList<>();
		for (Tab tab : editorArea.getTabs()) {
			if (tab != selection) {
				toRemoveTabs.add(tab);
			}
		}
		editorArea.getTabs().removeAll(toRemoveTabs);
	}

	@FXML
	protected void onEditorAreaCloseAllMenuItem(ActionEvent event) {
		editorArea.getTabs().clear();
	}

	public void hideLeft(boolean hide) {
		if (hide) {
			topSplitPane.getItems().remove(topSplitPane.getItems().indexOf(leftAnchorPane));
		}else {
			topSplitPane.getItems().add(0, leftAnchorPane);
		}
	}
	
	public void hideRight(boolean hide) {
		if (hide) {
			topSplitPane.getItems().remove(topSplitPane.getItems().indexOf(rightPane));
		}else {
			topSplitPane.getItems().add(rightPane);
		}
	}

	public void hideBottom(boolean hide) {
		if (hide) {
			perspective.getItems().remove(perspective.getItems().indexOf(bottomPane));
		}else {
			perspective.getItems().add(bottomPane);
		}
	}
	
	
	
	public void addToRight(EmfViewPart tab) {
		if (tab==null) {
			return;
		}
		tab.setOnClosed(event -> {
			if (rightTabPane.getTabs().isEmpty()) {
				hideRight(true);
			}
		});
		rightTabPane.getTabs().add(tab);
	}

	public void addToLeft(Tab tab) {
		if (tab==null) {
			return;
		}
		tab.setOnClosed(event -> {
			if (leftTabPane.getTabs().isEmpty()) {
				hideLeft(true);
			}
		});
		leftTabPane.getTabs().add(tab);
	}

	public void addToBottom(EmfViewPart tab) {
		if (tab==null) {
			return;
		}
		tab.setOnClosed(event -> {
			if (bottomPane.getTabs().isEmpty()) {
				hideBottom(true);
			}
		});
		bottomPane.getTabs().add(tab);
	}

	public void addToEditorArea(EmfViewPart tab) {
		editorArea.getTabs().add(tab);
	}

	@Override
	public void init() {
	}

}

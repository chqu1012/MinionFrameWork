package de.dc.minion.model.desk.controller;

import java.io.IOException;

import de.dc.minion.model.desk.control.ILandscapeFX;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TabPane;

public class EmfTouchManager extends BaseBindingEmfTouchManagerController implements ILandscapeFX{
	
	public EmfTouchManager() {
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("/de/dc/minion/model/desk/control/EmfTouchManager.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	@Override
	public void initialize(){
		super.initialize();
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

	@Override
	public void init() {
	}
	
}

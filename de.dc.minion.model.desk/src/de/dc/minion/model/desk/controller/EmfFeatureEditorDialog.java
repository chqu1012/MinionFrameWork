package de.dc.minion.model.desk.controller;

import java.io.IOException;

import de.dc.minion.model.desk.control.ILandscapeFX;
import de.dc.minion.model.desk.control.controller.BaseBindingEmfFeatureEditorDialogController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;

public class EmfFeatureEditorDialog extends BaseBindingEmfFeatureEditorDialogController implements ILandscapeFX{

	public EmfFeatureEditorDialog() {
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("/de/dc/minion/model/desk/control/EmfFeatureEditorDialog.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}
	
	@Override
	public void initialize() {
		super.initialize();
	}

	@Override
	protected void onButtonAction(ActionEvent event) {
	}

	@Override
	protected void onListViewMouseClicked(MouseEvent event) {
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

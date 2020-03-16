package de.dc.minion.model.desk.control;

import javafx.scene.control.TabPane;

public interface ILandscapeFX {

	TabPane getEditorArea();

	void hideRight(boolean hide);

	void hideLeft(boolean hide);

	void hideBottom(boolean hide);
	
	void init();
}

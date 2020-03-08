package de.dc.minion.model.common.control;

import javafx.scene.layout.BorderPane;

public abstract class EmfViewPart extends BorderPane implements IEmfViewPart{

	public EmfViewPart() {
		setCenter(create());
	}
}

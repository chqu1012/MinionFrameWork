package de.dc.minion.model.desk.controller;

import de.dc.minion.model.common.control.EmfViewPart;
import javafx.scene.Parent;
import javafx.scene.control.Label;

public class EmptyViewPart extends EmfViewPart{

	public EmptyViewPart(String name) {
		setText(name);
	}

	@Override
	public Parent create() {
		return new Label("Failed to load Vision!");
	}

}

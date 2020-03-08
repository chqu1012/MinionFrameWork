package de.dc.minion.model.desk.demo;

import de.dc.minion.model.desk.control.MinionDeskFX;
import javafx.beans.value.ObservableValue;

public class MinionDesk extends MinionDeskFX {

	@Override
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
	}

	@Override
	protected String showTabTextByObject(Object input) {
		return input.toString();
	}

}

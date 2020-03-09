package de.dc.minion.model.common.control;

import de.dc.minion.fx.model.Vision;
import javafx.scene.Parent;

public interface IEmfViewPart {

	Parent create();
	
	void setVision(Vision vision);
	
	void initialize();
}

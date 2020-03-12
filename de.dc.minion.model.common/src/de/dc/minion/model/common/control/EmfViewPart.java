package de.dc.minion.model.common.control;

import de.dc.minion.fx.model.Vision;
import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;

public abstract class EmfViewPart extends Tab implements IEmfViewPart{

	protected BorderPane pane;

	public EmfViewPart() {
		pane = new BorderPane();
		pane.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		pane.setCenter(create());

		setContent(pane);
	}
	
	@Override
	public void initialize() {
	}
	
	@Override
	public void setVision(Vision vision) {
		setText(vision.getName());
		setClosable(true);		
	}
}

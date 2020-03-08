package de.dc.minion.model.desk.demo.vision;

import com.google.inject.Inject;

import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.event.ISelectionService;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;

public class LeftVision extends EmfViewPart	implements ChangeListener<TreeItem<Object>>{

	@Inject ISelectionService selectionService;
	private Button button;
	
	@Override
	public Parent create() {
		button = new Button("Test");
		button.setOnMouseClicked(e->{
				System.out.println(selectionService.getSelection());
		});
		
		return button;
	}

	@Override
	public void changed(ObservableValue<? extends TreeItem<Object>> observable, TreeItem<Object> oldValue,
			TreeItem<Object> newValue) {
		if (newValue!=null) {
			button.setText(newValue.getValue().toString());
		}		
	}

}

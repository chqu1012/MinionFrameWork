package de.dc.minion.model.desk.handler;

import java.io.File;
import java.util.Optional;

import com.google.inject.Inject;

import de.dc.minion.model.common.command.ICommandHandler;
import de.dc.minion.model.common.control.IEmfEditorPart;
import de.dc.minion.model.common.file.IEmfFileManager;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class SaveAsFileHandler implements ICommandHandler{

	@Inject IEmfFileManager fileManager;
	
	@Override
	public void execute() {
		Optional<IEmfEditorPart<?>> activeEditor = fileManager.getActiveEditor();
		if (activeEditor.isPresent()) {
			IEmfEditorPart<?> editorPart = activeEditor.get();
			FileChooser chooser = new FileChooser();
			chooser.setTitle("Save As...");
			File file = chooser.showSaveDialog(new Stage());
			if (file!=null) {
				editorPart.save(file);
			}
		}
	}
}

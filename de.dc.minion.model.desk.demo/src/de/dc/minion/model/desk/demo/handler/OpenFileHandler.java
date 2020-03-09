package de.dc.minion.model.desk.demo.handler;

import java.io.File;

import com.google.inject.Inject;

import de.dc.minion.model.common.IControlManager;
import de.dc.minion.model.common.command.ICommandHandler;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.desk.demo.MinionDesk;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class OpenFileHandler implements ICommandHandler{

	@Inject
	IControlManager controlManager;
	
	@Inject 
	IEventBroker eventBroker;
	
	@Override
	public void execute() {
		MinionDesk desk = controlManager.findBy(MinionDesk.ID);
		FileChooser chooser = new FileChooser();
		File file = chooser.showOpenDialog(new Stage());
		if (file != null) {
			desk.openFile(new EventContext<>("open.editor", file.getAbsolutePath()));
			eventBroker.post(new EventContext<>("add/recently/open/file", file));
		}
	}
}

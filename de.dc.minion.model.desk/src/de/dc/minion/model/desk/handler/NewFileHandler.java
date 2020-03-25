package de.dc.minion.model.desk.handler;

import com.google.inject.Inject;

import de.dc.minion.model.common.command.ICommandHandler;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;

public class NewFileHandler implements ICommandHandler{

	@Inject IEventBroker eventBroker;
	
	@Override
	public void execute() {
		eventBroker.post(new EventContext<>("/open/landscape/as/page", "emf.file.wizard"));
	}

}

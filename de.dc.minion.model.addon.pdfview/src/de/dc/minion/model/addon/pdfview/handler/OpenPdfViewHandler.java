package de.dc.minion.model.addon.pdfview.handler;

import com.google.inject.Inject;

import de.dc.minion.model.common.command.ICommandHandler;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.desk.control.MinionConstants;

public class OpenPdfViewHandler implements ICommandHandler{

	@Inject IEventBroker eventBroker;
	
	@Override
	public void execute() {
		eventBroker.post(new EventContext<>(MinionConstants.EVENT_OPEN_LANDSCAPE_ID, "landscape.pdfview"));
	}

}

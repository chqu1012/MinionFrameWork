package de.dc.minion.model.desk.demo.handler;

import de.dc.minion.model.common.command.ICommandHandler;

public class NewFileHandler implements ICommandHandler{

	@Override
	public void execute() {
		System.out.println("New File Command");
	}

}

package de.dc.minion.model.common.command;

public interface ICommandService {

	void execute(String id);
	
	void registrate(String id, ICommandHandler handler);
}

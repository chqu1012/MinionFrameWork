package de.dc.minion.model.common.command;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class CommandService implements ICommandService{

	private static final Logger LOG = Logger.getLogger(CommandService.class.getSimpleName());
	
	Map<String, ICommandHandler> commandRegistry = new HashMap<>();
	
	@Override
	public void execute(String id) {
		ICommandHandler handler = commandRegistry.get(id);
		if (handler!=null) {
			handler.execute();
			LOG.info("Execute command with id "+id);
		}
	}

	@Override
	public void registrate(String id, ICommandHandler handler) {
		commandRegistry.put(id, handler);
		LOG.info("Registrate handler "+handler.getClass().getSimpleName()+" with id "+id);
	}
}

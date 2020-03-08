package de.dc.minion.model.desk.module;

import com.google.inject.AbstractModule;

import de.dc.minion.model.common.ControlManager;
import de.dc.minion.model.common.IControlManager;
import de.dc.minion.model.common.command.CommandService;
import de.dc.minion.model.common.command.ICommandService;
import de.dc.minion.model.common.event.EventBroker;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.common.event.ISelectionService;
import de.dc.minion.model.common.event.SelectionService;
import de.dc.minion.model.common.file.EmfFileManager;
import de.dc.minion.model.common.file.IEmfFile;
import de.dc.minion.model.common.file.IEmfFileManager;
import de.dc.minion.model.common.file.MinionFile;

public class MinionModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(IEmfFileManager.class).to(EmfFileManager.class).asEagerSingleton();;
		bind(IEmfFile.class).to(MinionFile.class).asEagerSingleton();;
		bind(IEventBroker.class).to(EventBroker.class).asEagerSingleton();;
		bind(ISelectionService.class).to(SelectionService.class).asEagerSingleton();;
		bind(IControlManager.class).to(ControlManager.class).asEagerSingleton();;
		bind(ICommandService.class).to(CommandService.class).asEagerSingleton();;
	}

}

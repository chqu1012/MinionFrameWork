package de.dc.minion.model.common.control;

import de.dc.minion.model.common.IEmfManager;
import de.dc.minion.model.common.file.IEmfFileService;

public interface IEmfEditorPart<T> extends IEmfFileService<T>{
	
	IEmfManager<T> getEmfManager();
}

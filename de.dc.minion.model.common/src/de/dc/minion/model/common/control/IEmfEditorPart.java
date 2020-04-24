package de.dc.minion.model.common.control;

import org.eclipse.emf.ecore.EObject;

import de.dc.minion.model.common.IEmfManager;
import de.dc.minion.model.common.file.IEmfFileService;

public interface IEmfEditorPart<T> extends IEmfFileService<T>{
	
	IEmfManager<T> getEmfManager();
	
	Object executeAddCommand(EObject instanceObject, String className);
	
	void hideDetailedForm(boolean hide);
	
	void setSelection(Object selectedObject);
}

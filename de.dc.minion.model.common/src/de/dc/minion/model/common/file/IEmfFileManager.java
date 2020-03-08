package de.dc.minion.model.common.file;

import java.util.List;
import java.util.Optional;

import de.dc.minion.model.common.control.IEmfEditorPart;

public interface IEmfFileManager {

	void register(IEmfEditorPart<?> editorPart);
	
	Optional<IEmfEditorPart<?>> getEditorByExtension(String extension);
	
	List<String> getAllExtensions();
	
	Optional<IEmfEditorPart<?>> getActiveEditor();

	void setCurrentEditor(IEmfEditorPart<?> currentEditor);
}

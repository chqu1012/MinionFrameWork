package de.dc.minion.model.common.event;

import java.util.Optional;

import de.dc.minion.model.common.IEmfManager;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.value.ChangeListener;

public interface ISelectionService{
	
	void setFocusedProvider(ReadOnlyObjectProperty provider);
	
	Optional<?> getSelection();
	
	void addListener(ChangeListener listener);

	void removeListener(ChangeListener listener);
	
	void registerProvider(ReadOnlyObjectProperty provider);

	void unregisterProvider(ReadOnlyObjectProperty provider);
	
	Optional<? extends IEmfManager<?>> getEmfManager();
	
	void registerProvider(ReadOnlyObjectProperty<?> provider, IEmfManager<?> manager);
}

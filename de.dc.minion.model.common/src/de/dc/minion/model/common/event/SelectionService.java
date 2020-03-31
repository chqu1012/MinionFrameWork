package de.dc.minion.model.common.event;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import de.dc.minion.model.common.IEmfManager;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.value.ChangeListener;

public class SelectionService implements ISelectionService {

	protected IEmfManager<?> manager;

	protected List<ReadOnlyObjectProperty<?>> providers = new ArrayList<>();
	protected List<ChangeListener<?>> listeners = new ArrayList<>();
	protected ReadOnlyObjectProperty<?> focusedProvider;
	
	@Override
	public void addListener(ChangeListener listener) {
		System.out.println(listener);
		if (providers.contains(listener)) {
			return;
		}
		for (ReadOnlyObjectProperty<?> provider : providers) {
			provider.addListener(listener);
		}
		listeners.add(listener);
	}

	@Override
	public void registerProvider(ReadOnlyObjectProperty provider) {
		providers.add(provider);
		provider.addListener(e->setFocusedProvider(provider));		
		listeners.forEach(e->provider.addListener(e));
	}

	@Override
	public void removeListener(ChangeListener listener) {
		for (ReadOnlyObjectProperty<?> provider : providers) {
			provider.removeListener(listener);
		}
	}

	@Override
	public void unregisterProvider(ReadOnlyObjectProperty provider) {
		providers.remove(provider);		
	}

	@Override
	public void setFocusedProvider(ReadOnlyObjectProperty provider) {
		this.focusedProvider = provider;
	}

	@Override
	public Optional<?> getSelection() {
		if (focusedProvider==null) {
			return Optional.empty();
		}
		return Optional.of(focusedProvider.get());
	}
	
	@Override
	public void registerProvider(ReadOnlyObjectProperty<?> provider, IEmfManager<?> manager) {
		this.manager=manager;
		registerProvider(provider);
	}

	@Override
	public Optional<? extends IEmfManager<?>> getEmfManager() {
		return Optional.of(manager);
	}
}
package de.dc.minion.model.common;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import de.dc.minion.model.common.control.IEmfViewPart;
import javafx.scene.Node;

public class ControlManager implements IControlManager{

	private Map<String, Node> controlRegistry = new HashMap<>();
	private Map<String, Node> toolbarRegistry = new HashMap<>();
	private Map<String, IEmfViewPart> viewRegistry = new HashMap<>();

	@Override
	public void registrate(String id, Node control) {
		controlRegistry.put(id, control);
	}

	@Override
	public <T> T findBy(String id) {
		return (T) controlRegistry.get(id);
	}

	@Override
	public void registrateToolbarItem(String id, Node control) {
		toolbarRegistry.put(id, control);		
	}

	@Override
	public Node findToolbarItemBy(String id) {
		return toolbarRegistry.get(id);
	}

	@Override
	public Collection<Node> findAllToolbar() {
		return toolbarRegistry.values();
	}

	@Override
	public IEmfViewPart findViewBy(String id) {
		return viewRegistry.get(id);
	}

	@Override
	public void registrate(String id, IEmfViewPart part) {
		viewRegistry.put(id, part);
	}
	
}

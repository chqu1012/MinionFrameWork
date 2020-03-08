package de.dc.minion.model.common;

import java.util.Collection;

import javafx.scene.Node;

public interface IControlManager {

	void registrateToolbarItem(String id, Node control);
	
	void registrate(String id, Node control);
	
	<T> T findBy(String id);

	<T> T findToolbarItemBy(String id);

	Collection<Node> findAllToolbar();
	
}

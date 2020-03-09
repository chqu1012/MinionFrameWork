package de.dc.minion.model.common;

import java.util.Collection;

import de.dc.minion.model.common.control.IEmfViewPart;
import javafx.scene.Node;

public interface IControlManager {

	void registrateToolbarItem(String id, Node control);
	
	void registrate(String id, Node control);
	
	IEmfViewPart findViewBy(String id);
	
	void registrate(String id, IEmfViewPart part);
	
	<T> T findBy(String id);

	<T> T findToolbarItemBy(String id);

	Collection<Node> findAllToolbar();
	
}

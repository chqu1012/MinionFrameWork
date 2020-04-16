package de.dc.minion.model.addon.snapshot;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.eventbus.Subscribe;

import de.dc.minion.model.addon.snapshot.renderer.SnapshotRenderer;
import de.dc.minion.model.common.control.EmfViewPart;
import de.dc.minion.model.common.event.EventContext;
import de.dc.minion.model.common.event.IEventBroker;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.BorderPane;
	
public class SnapshotDiagram extends EmfViewPart implements ChangeListener<Object> {

	private SnapshotRenderer renderer;
	private BorderPane parent;
	private EObject rootElement;
	
	@Override
	public Parent create() {
		renderer = new SnapshotRenderer();
		parent = new BorderPane();
		
		MinionPlatform.getInstance(IEventBroker.class).register(this);
		return parent;
	}

	@Override
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
		if (newValue != null) {
			if (newValue instanceof TreeItem) {
				TreeItem<Object> treeItem = (TreeItem<Object>) newValue;
				Object value = treeItem.getValue();
				ResourceSetImpl root = (ResourceSetImpl) EcoreUtil.getRoot((EObject) value, true);
				rootElement = root.getResources().get(0).getContents().get(0);
				renderRoot();
			}
		}
	}

	@Subscribe
	public void subscribeUpdateDiagram(EventContext<String> context) {
		if (context.getEventId().equals("/update/snapshot/diagram")) {
			renderRoot();
		}
	}
	
	private void renderRoot() {
		Node eobject = renderer.doSwitch(rootElement);
		parent.setCenter(eobject);
	}
}

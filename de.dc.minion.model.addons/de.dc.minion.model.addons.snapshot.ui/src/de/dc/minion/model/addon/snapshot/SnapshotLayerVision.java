package de.dc.minion.model.addon.snapshot;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;

import de.dc.minion.model.addon.snapshot.component.SnapshotLayerView;
import de.dc.minion.model.common.control.EmfObservableViewPart;
import de.dc.minion.model.common.event.ISelectionService;
import de.dc.minion.model.desk.module.MinionPlatform;
import javafx.scene.Parent;

public class SnapshotLayerVision extends EmfObservableViewPart {

	private SnapshotLayerView snapshotLayer;

	@Override
	public Parent create() {
		snapshotLayer = MinionPlatform.getInstance(SnapshotLayerView.class);
		return snapshotLayer;
	}

	@Override
	protected void onChanged(Object value) {
		if (value instanceof Snapshot) {
			Snapshot snapshot = (Snapshot) value;
			snapshotLayer.setItems(snapshot.getLayers());
		}else if (value instanceof Layer) {
			Layer layer = (Layer) value;
			EObject parent = layer.eContainer();
			if (parent instanceof Snapshot) {
				Snapshot snapshot = (Snapshot) parent;
				snapshotLayer.setItems(snapshot.getLayers());
			}
		}
	}

}

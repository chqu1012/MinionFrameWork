package de.dc.minion.model.addon.snapshot.service;

import org.eclipse.emf.common.notify.AdapterFactory;

import de.dc.minion.model.addon.snapshot.file.*;
import de.dc.minion.model.addon.snapshot.*;
import de.dc.minion.model.common.AbstractEmfManager;
import de.dc.minion.model.common.file.IEmfFile;

public class SnapshotManager extends AbstractEmfManager<Snapshot>{

	@Override
	public IEmfFile<Snapshot> initFile() {
		return new SnapshotFile();
	}

	@Override
	public AdapterFactory getModelItemProviderAdapterFactory() {
		return new de.dc.minion.model.addon.snapshot.provider.SnapshotItemProviderAdapterFactory();
	}

	@Override
	protected Snapshot initModel() {
		return de.dc.minion.model.addon.snapshot.SnapshotFactory.eINSTANCE.createSnapshot();
	}
}

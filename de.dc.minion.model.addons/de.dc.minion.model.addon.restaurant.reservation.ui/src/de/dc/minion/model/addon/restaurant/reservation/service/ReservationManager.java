package de.dc.minion.model.addon.restaurant.reservation.service;

import org.eclipse.emf.common.notify.AdapterFactory;

import de.dc.minion.model.addon.restaurant.reservation.Restaurant;
import de.dc.minion.model.addon.restaurant.reservation.file.ReservationFile;
import de.dc.minion.model.common.AbstractEmfManager;
import de.dc.minion.model.common.file.IEmfFile;
public class ReservationManager extends AbstractEmfManager<Restaurant>{

	@Override
	public IEmfFile<Restaurant> initFile() {
		return new ReservationFile();
	}

	@Override
	public AdapterFactory getModelItemProviderAdapterFactory() {
		return new de.dc.minion.model.addon.restaurant.reservation.provider.ReservationItemProviderAdapterFactory();
	}

	@Override
	protected Restaurant initModel() {
		return de.dc.minion.model.addon.restaurant.reservation.ReservationFactory.eINSTANCE.createRestaurant();
	}
}

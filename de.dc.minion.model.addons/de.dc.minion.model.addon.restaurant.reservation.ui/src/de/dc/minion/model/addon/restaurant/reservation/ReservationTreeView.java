package de.dc.minion.model.addon.restaurant.reservation;

import de.dc.minion.model.addon.restaurant.reservation.service.ReservationManager;
import de.dc.minion.model.common.IEmfManager;
import de.dc.minion.model.desk.controller.EmfModelTreeView;

public class ReservationTreeView extends EmfModelTreeView<Restaurant>{

	@Override
	public IEmfManager<Restaurant> initEmfManager() {
		return new ReservationManager();
	}
}

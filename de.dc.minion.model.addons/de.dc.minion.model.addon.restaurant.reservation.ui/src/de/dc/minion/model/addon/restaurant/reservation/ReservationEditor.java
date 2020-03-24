package de.dc.minion.model.addon.restaurant.reservation;

import de.dc.minion.model.addon.restaurant.reservation.Restaurant;
import de.dc.minion.model.desk.controller.EmfDetailedTreeView;
import de.dc.minion.model.desk.controller.EmfModelTreeView;
public class ReservationEditor extends EmfDetailedTreeView<Restaurant>{

	@Override
	protected EmfModelTreeView<Restaurant> initEmfModelTreeView() {
		return new ReservationTreeView();
	}
}

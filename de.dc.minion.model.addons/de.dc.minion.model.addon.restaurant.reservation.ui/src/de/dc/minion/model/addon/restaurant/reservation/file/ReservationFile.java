package de.dc.minion.model.addon.restaurant.reservation.file;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import de.dc.minion.model.addon.restaurant.reservation.Restaurant;
import de.dc.minion.model.common.file.EmfFile;

public class ReservationFile extends EmfFile<Restaurant>{

	@Override
	public EPackage getEPackageEInstance() {
		return de.dc.minion.model.addon.restaurant.reservation.ReservationPackage.eINSTANCE;
	}

	@Override
	public EFactory getEFactoryEInstance() {
		return de.dc.minion.model.addon.restaurant.reservation.ReservationFactory.eINSTANCE;
	}

	@Override
	public String getExtension() {
		return "reservation";
	}
}

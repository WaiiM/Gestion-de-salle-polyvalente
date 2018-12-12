package reservation;

import dao.*;
import assets.*;

public class ReservationCourante {
	
	private static ReservationDAO daoReservation; //
	private Reservation reservation;
	
	public ReservationCourante(Reservation r) {
		if(daoReservation == null) {
			daoReservation = new ReservationDAO();
		}
		this.reservation = r;
	}
	
	public void reserver() {
		Object o = null;
		daoReservation.add(o);
	}
	
	public boolean verifierDisponibilite() {
		return true;
	}
	
}

package reservation;

import java.util.List;

public class GestionnaireReservation {
	
	private ReservationControle rc;
	private Reservations serviceReservations;
	private ReservationCourante serviceReserivation;
	
	public GestionnaireReservation(ReservationControle rc) {
		this.rc = rc;
		this.serviceReservations = new Reservations();
		this.serviceReservations.init();
	}
	
	public List<Reservation> getListReservation() {
		this.serviceReservations.update();
		return this.serviceReservations.getListReservation();
	}
	
	public Reservation getReservation() {
		return null;
	}
	
	public void reserver() {
		
	}
}

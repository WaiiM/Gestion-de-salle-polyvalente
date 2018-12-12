package reservation;

import java.util.List;

import assets.*;

public class GestionnaireReservation {
	
	private ReservationControle rc;
	private Reservations serviceReservations;
	
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
	
	public boolean verification(Reservation r) {
		serviceReservations.update();
		Reservation reservation = r;
		ReservationCourante serviceReserivationCourante = new ReservationCourante(reservation);
		if()
		return true;
	}
	
	public void reserver(Reservation r, ReservationCourante rc) {
		if(this.verification(r)) {
			rc.reserver();
			System.out.println("Reservation done");
		}
		else {
			System.out.println("Non Disponible");
		}
		
	}
}

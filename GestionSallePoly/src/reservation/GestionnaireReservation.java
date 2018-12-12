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
		
		return true;
	}
	
	public void reserver(Reservation r) {
		serviceReservations.update();
		Reservation reservation = r;
		ReservationCourante serviceReserivationCourante = new ReservationCourante(reservation);
		if(serviceReserivationCourante.verifierDisponibilite()) {
			System.out.println("Reservation done");
			serviceReserivationCourante.reserver();
		}
		else {
			System.out.println("Non Disponible");
		}
		
	}
}

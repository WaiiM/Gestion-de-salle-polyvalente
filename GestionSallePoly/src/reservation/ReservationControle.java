package reservation;

import java.util.*;

public class ReservationControle {
	
	private GestionnaireReservation gr;
	
	public ReservationControle() {
		this.gr = new GestionnaireReservation(this);
	}
	
	public List<Reservation> getListReservation() {
		return gr.getListReservation();
	}
	
	public Reservation getReservation() {
		return gr.getReservation();
	}
	
	public void reserver() {
		gr.reserver();
	}
}

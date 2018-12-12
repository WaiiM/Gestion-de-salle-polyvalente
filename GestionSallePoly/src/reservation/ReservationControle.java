package reservation;

import java.util.*;
import assets.*;

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
	
	public void reserver(Reservation r) {
		gr.verification(r);
		gr.reserver(r);
	}
}

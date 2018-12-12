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
	
	public List<Reservation> getListDemande(){
		return gr.getListDemande();
	}
	
	public List<Reservation> getListPreReservation(){
		return gr.getListPreResevation();
	}
	
	public Reservation getReservation() {
		return gr.getReservation();
	}
	
	public void mettreEnPreReservation(Reservation r) {
		r.setEtape(EtapeReservation.PRERESERVATION);
		gr.modifierReservation(r);
	}
	
	public void mettreEnResrvation(Reservation r) {
		r.setEtape(EtapeReservation.RESERVATION);
		gr.modifierReservation(r);
	}
	
	public void mettreEnDemande(Reservation r) {
		r.setEtape(EtapeReservation.DEMANDE);
		gr.modifierReservation(r);
	}
	
	public void demander(Reservation r) {
		if(gr.verification(r)) {
			gr.reserver(r, EtapeReservation.DEMANDE);
			System.out.println("Demander Reservation done");
			return;
		}
	}
	
	public void prereserver(Reservation r) {
		if(gr.verification(r)) {
			gr.reserver(r, EtapeReservation.PRERESERVATION);
			System.out.println("PreReservation done");
			return;
		}
		
	}
	
	public void reserver(Reservation r) {
		if(gr.verification(r)) {
			gr.reserver(r, EtapeReservation.RESERVATION);
			System.out.println("Reservation done");
			return;
		}
		System.out.println("Reservation Echoué");
		
	}
	
	public void modifierReservation(Reservation r) {
		if(gr.verification(r)) {
			gr.modifierReservation(r);
		}
	}
}

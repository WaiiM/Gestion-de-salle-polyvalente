package reservation;

import java.util.*;

import assets.*;

public class GestionnaireReservation {
	
	private ReservationControle rc;
	private Reservations serviceReservations;
	
	public GestionnaireReservation(ReservationControle rc) {
		this.rc = rc;
		this.serviceReservations = new Reservations();
		this.serviceReservations.init();
	}
	

	
	public Reservation getReservation() {
		return null;
	}
	
	public boolean verification(Reservation r) {
		serviceReservations.update();
		Reservation reservation = r;
		ReservationCourante serviceReserivationCourante = new ReservationCourante(reservation);
		return (serviceReserivationCourante.verifierDisponibilite());
	}
	
	public void modifierReservation(Reservation r) {
		ReservationCourante serviceReserivationCourante = new ReservationCourante(r);
		serviceReserivationCourante.update();
	}
	
	public boolean reserver(Reservation r, EtapeReservation etape) {
		r.setEtape(etape);
		ReservationCourante serviceReserivationCourante = new ReservationCourante(r);
		return serviceReserivationCourante.reserver();
	}

	public List<Reservation> getListReservation() {
		this.serviceReservations.update();
		return this.serviceReservations.getListReservation();
	}
	
	public List<Reservation> getListDemande() {
		this.serviceReservations.update();
		List<Reservation> listDemande = new ArrayList<Reservation>();
		for(Reservation r : this.serviceReservations.getListReservation()) {
			if(EtapeReservation.DEMANDE.equals(r.getEtape())) {
				listDemande.add(r);
			}
		}
		return listDemande;
	}

	public List<Reservation> getListPreResevation() {
		this.serviceReservations.update();
		List<Reservation> listPre = new ArrayList<Reservation>();
		for(Reservation r : this.serviceReservations.getListReservation()) {
			if(EtapeReservation.PRERESERVATION.equals(r.getEtape())) {
				listPre.add(r);
			}
		}
		return listPre;
	}
}

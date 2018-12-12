package reservation;

import dao.*;
import assets.*;
import configuration.EquipementCourant;
import configuration.SalleCourante;
import configuration.SallePoylvCourante;

public class ReservationCourante {
	
	private static ReservationDAO daoReservation;
	private static SalleDAO daoSalle;
	private static SalleDAO daoSallePoly; // SallePolyDAO
	private static EquipementDAO daoEquipement;
	private Reservation reservation;
	
	public ReservationCourante(Reservation r) {
		if(daoReservation == null) {
			daoReservation = new ReservationDAO();
		}
		if(daoSalle == null) {
			daoSalle = new SalleDAO();
		}
		if(daoSallePoly == null) {
			daoSallePoly = new SalleDAO();
		}
		if(daoEquipement == null) {
			daoEquipement = new EquipementDAO();
		}
		this.reservation = r;
	}
	
	public void reserver() {
		daoReservation.add(this.reservation);
	}
	
	public void update() {
		daoReservation.update(this.reservation);
	}
	
	public boolean verifierDisponibilite() {
		boolean result = false;
		if(this.reservation == null) return result;
		for(Piece p : this.reservation.getListSalle()) {
			if(TypeSalle.POLYVALENTE.equals(p.getType())) {
				if(!(new SallePoylvCourante((SallePolyvalente)p)).verifierDisponibilite(this.reservation.getPeriodeReservation())) {
					result = false;
					break;
				}
			}
			else if(TypeSalle.SALLE.equals(p.getType()) || TypeSalle.SALLECOMMUNE.equals(p.getType())) {
				if(!(new SalleCourante((Salle)p)).verifierDisponibilite(this.reservation.getPeriodeReservation())) {
					result = false;
					break;
				}
			}
		}
		if(!result) return result;
		for(Equipement p : this.reservation.getListEquipement()) {
			if(!(new EquipementCourant(p)).verifierDisponibilite(this.reservation.getPeriodeReservation())) {
				result = false;
				break;
			}
			result = true;
		}
		return result;
	}
	
}

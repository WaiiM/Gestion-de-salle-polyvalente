package reservation;

import dao.*;
import assets.*;
import configuration.EquipementCourant;
import configuration.SalleCourante;
import configuration.SallePoylvCourante;

public class ReservationCourante {
	
	private static ReservationDAO daoReservation;
	private static SalleDAO daoSalle;
	private static SallePolyvalenteDAO daoSallePoly; // SallePolyDAO
	private static EquipementDAO daoEquipement;
	private static OccupantDAO daoOccupant;
	private Reservation reservation;
	
	public ReservationCourante(Reservation r) {
		if(daoReservation == null) {
			daoReservation = new ReservationDAO();
		}
		if(daoSalle == null) {
			daoSalle = new SalleDAO();
		}
		if(daoSallePoly == null) {
			daoSallePoly = new SallePolyvalenteDAO();
		}
		if(daoEquipement == null) {
			daoEquipement = new EquipementDAO();
		}
    if(daoOccupant == null) {
      daoOccupant = new OccupantDAO();
    }
		this.reservation = r;
	}
	
	public boolean reserver() {
	  if(daoOccupant.add(this.reservation.getOccupant()) != 0) {
	    int idReservation;
	    if( (idReservation = daoReservation.add(this.reservation)) != 0) {
	      this.reservation.setId(idReservation);
	      for(Piece s : this.reservation.getListSalle()) {
	        if(TypeSalle.POLYVALENTE.equals(s.getType())) {
	          daoSallePoly.addReservation(this.reservation, s);
	        }
	        else {
	          daoSalle.addReservation(this.reservation, s);
	        }
	      }
	    }
	  }
	  // ajouter equipement: reste à faire
	  // ajouter service: reste à faire
	  return true;
	}
	
	public void update() {
		daoReservation.update(this.reservation);
	}
	
	public boolean verifierDisponibilite() {
		boolean result = true;
		if(this.reservation == null) {
		  return false;
		}
		for(Piece p : this.reservation.getListSalle()) {
			if(TypeSalle.POLYVALENTE.equals(p.getType())) {
				if(!(new SallePoylvCourante((SallePolyvalente)p)).verifierDisponibilite(this.reservation.getPeriodeReservation())) {
					result = false;
					System.out.println("Salle Polyv: "+p+" est non disponible");
					break;
				}
			}
			else if(TypeSalle.SALLE.equals(p.getType()) || TypeSalle.SALLECOMMUNE.equals(p.getType())) {
				if(!(new SalleCourante((Salle)p)).verifierDisponibilite(this.reservation.getPeriodeReservation())) {
					result = false;
					System.out.println("Salle: "+p+" est non disponible");
					break;
				}
			}
		}
		if(!result) return result;
		for(Equipement p : this.reservation.getListEquipement()) {
			if(!(new EquipementCourant(p)).verifierDisponibilite(this.reservation.getPeriodeReservation())) {
				result = false;
				System.out.println("Equipement: "+p+" est non disponible");
				break;
			}
		}
		return result;
	}
	
}

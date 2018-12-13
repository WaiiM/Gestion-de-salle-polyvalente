package configuration;


import assets.*;
import dao.*;
import reservation.*;


public class SalleCourante {
	private static SalleDAO daoSalle;
	private Salle salle;
	
	public SalleCourante(Salle s) {
		if(daoSalle == null) {
			daoSalle = new SalleDAO();
		}
		this.salle = s;
	}
	
	public void ajouter() {
		daoSalle.add(this.salle);
	}
	
	public void update() {
		daoSalle.update(this.salle);
	}
	
	public boolean verifierDisponibilite(PeriodeReservation periode) {
		boolean result = false;
		if(periode == null || this.salle == null) return false;
		if(TypeSalle.SALLE.equals(salle.getType()) || TypeSalle.SALLECOMMUNE.equals(salle.getType())) {
			if(daoSalle.isDateValide(salle.getId(), periode.getDateDebut(), periode.getDateFin())) {
				result = true;
			}
		}
		return result;
	}
}

package configuration;

import assets.*;
import assets.PeriodeReservation;
import dao.*;

public class EquipementCourant {
	private static EquipementDAO daoEquipement;
	private Equipement equipement;
	
	public EquipementCourant(Equipement e) {
		if(daoEquipement == null) {
			daoEquipement = new EquipementDAO();
		}
		this.equipement = e;
	}
	
	public void ajouter() {
		daoEquipement.add(this.equipement);
	}
	
	public void update() {
		daoEquipement.update(this.equipement);
	}
	
	public boolean verifierDisponibilite(PeriodeReservation periode) {
		boolean result = false;
		if(periode == null || this.equipement == null) return result;
		if(daoEquipement.isDateValide(equipement.getId(), periode.getDateDebut(), periode.getDateFin())) {
			result = true;
		}
		return result;
	}
}

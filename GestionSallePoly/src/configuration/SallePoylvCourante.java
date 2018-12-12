package configuration;

import assets.*;
import dao.*;
import reservation.*;

public class SallePoylvCourante {
	private static SallePolyvalenteDAO daoSallePoly;
	private SallePolyvalente sallePoly;
	
	public SallePoylvCourante(SallePolyvalente s) {
		if(daoSallePoly == null) {
			daoSallePoly = new SallePolyvalenteDAO();
		}
		this.sallePoly = s;
	}
	
	public void ajouter() {
		daoSallePoly.add(this.sallePoly);
	}
	
	public void update() {
		daoSallePoly.update(this.sallePoly);
	}
	
	public boolean verifierDisponibilite(PeriodeReservation periode) {
		boolean result = false;
		if(periode == null || this.sallePoly == null) return result;
		if(TypeSalle.POLYVALENTE.equals(sallePoly.getType())) {
			if(daoSallePoly.isDateValide(sallePoly.getId(), periode.getDateDebut(), periode.getDateFin())) {
				result = true;
			}
		}
		return result;
	}
}

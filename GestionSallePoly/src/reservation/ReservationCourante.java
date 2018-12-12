package reservation;

import dao.DAO;
import assets.*;

public class ReservationCourante {
	
	private static DAO dao;
	
	private Reservation reservation;
	
	public ReservationCourante(Occupant occ) {
		if(dao == null) {
			dao = new DAO();
		}
		this.reservation = new Reservation(occ);
	}
	
	public void reserver() {
		dao.add();
	}
	
	public void verifierDisponibilite() {
		
	}
	
}

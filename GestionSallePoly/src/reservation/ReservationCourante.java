package reservation;

import dao.DAO;
import assets.*;

public class ReservationCourante {
	
	private static DAO dao;
	private Reservation reservation;
	
	public ReservationCourante(Reservation r) {
		if(dao == null) {
			dao = new DAO();
		}
		this.reservation = r;
	}
	
	public void reserver() {
		dao.add();
	}
	
	public boolean verifierDisponibilite() {
		return true;
	}
	
}

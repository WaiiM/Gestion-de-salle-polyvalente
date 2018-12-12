package reservation;

import dao.*;
import java.util.*;

public class Reservations {
	
	private static DAO daoReservation;
	private List<Reservation> listReservation;
	
	public Reservations() {
		if(daoReservation == null) {
			daoReservation = new ReservationDAO();
		}
		this.listReservation = new ArrayList<Reservation>();
	}
	
	public void init() {
		// recupérer la liste des reservations depuis le DAO
	}
	
	public Reservation getUneReservation() {
		// retouner une reservation donnée
		return null;
	}
	
	public void update() {
		// mettre à jour la liste des reservations depuis la BDD
	}

	public List<Reservation> getListReservation() {
		return listReservation;
	}
	
}

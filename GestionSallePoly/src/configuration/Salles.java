package configuration;

import java.util.ArrayList;
import java.util.List;

import dao.*;
import reservation.Salle;
import assets.*;

public class Salles {
	private static SalleDAO daoSAlle;
	private List<Salle> listSalle;
	private Salle salle;
	
	public Salles() {
		if(daoSAlle == null) {
			daoSAlle = new SalleDAO();
		}
		this.listSalle = new ArrayList<Salle>();
	}
	
	public void init() {
		// recupérer la liste des reservations depuis le DAO
	}
	
	public Salle getSalle() {
		// retouner une reservation donnée
		return null;
	}
	
	public void update() {
		// mettre à jour la liste des reservations depuis la BDD
	}
	
	public void add() {
		
	}
	
	public List<Salle> getListSalle() {
		return listSalle;
	}
}

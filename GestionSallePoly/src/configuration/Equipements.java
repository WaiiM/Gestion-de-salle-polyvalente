package configuration;

import java.util.ArrayList;
import java.util.List;

import assets.*;
import dao.*;

public class Equipements {
	private static SalleDAO daoSalle;
	private List<Equipement> listEquipement;
	private Equipement equipement;
	
	public Equipements() {
		if(daoSalle == null) {
			daoSalle = new SalleDAO();
		}
		this.listEquipement = new ArrayList<Equipement>();
	}
	
	public void init() {
		// recupérer la liste des reservations depuis le DAO
	}
	
	public Equipement getEquipement() {
		// retouner une reservation donnée
		return null;
	}
	
	public void update() {
		// mettre à jour la liste des reservations depuis la BDD
	}
	
	public void add() {
		
	}
	
	public List<Equipement> getListAccount() {
		return listEquipement;
	}
}

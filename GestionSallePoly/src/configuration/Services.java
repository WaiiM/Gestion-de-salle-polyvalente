package configuration;

import java.util.ArrayList;
import java.util.List;

import assets.*;
import dao.*;
import reservation.Salle;

public class Services {
	private static ServiceDAO daoService;
	private List<Service> listService;
	
	public Services() {
		if(daoService == null) {
			daoService = new ServiceDAO();
		}
		this.listService = new ArrayList<Service>();
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
	
	
	public List<Service> getListService() {
		this.update();
		return listService;
	}
}

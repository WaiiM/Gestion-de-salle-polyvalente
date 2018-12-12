package configuration;

import java.util.ArrayList;
import java.util.List;

import assets.*;
import reservation.EtapeReservation;
import reservation.Reservation;
import reservation.Salle;

public class GestionnaireConfiguration {
	
	private ConfigurationControle cc;
	private Salles serviceSalles;
	private Services serviceServices;
	private Equipements serviceEquipements;
	
	public GestionnaireConfiguration(ConfigurationControle cc) {
		this.cc = cc;
		this.serviceSalles = new Salles();
		this.serviceSalles.init();
		this.serviceServices = new Services();
		this.serviceServices.init();
		this.serviceEquipements = new Equipements();
		this.serviceEquipements.init();
	}
	
	public List<Salle> getListSalle() {
		this.serviceSalles.update();
		return this.serviceSalles.getListSalle();
	}
	public List<Equipement> getListEquipement() {
		this.serviceEquipements.update();
		return this.serviceEquipements.getListEquipement();
	}
	public List<Service> getListService() {
		this.serviceServices.update();
		return this.serviceServices.getListService();
	}
	
	public List<Salle> getListSalleDispo(PeriodeReservation periode) { // je suis là 
		List<Salle> listSalleLibre = new ArrayList<Salle>();
		for(Salle s : this.serviceSalles.getListSalle()) {
			if(s!=null && s.get) {
				listPre.add(r);
			}
		}
		return listSalleLibre;
	}
}

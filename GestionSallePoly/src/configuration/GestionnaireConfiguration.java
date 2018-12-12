package configuration;

import java.util.List;

import assets.*;
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
}

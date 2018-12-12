package configuration;

import java.util.ArrayList;
import java.util.List;

import assets.*;
import reservation.EtapeReservation;
import reservation.Reservation;
import reservation.Salle;
import reservation.SallePolyvalente;

public class GestionnaireConfiguration {
	
	private ConfigurationControle cc;
	private SallesPolys serviceSallesPolyvs;
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
		this.serviceSallesPolyvs = new SallesPolys();
		this.serviceSallesPolyvs.init();
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
	
	public List<Salle> getListSalleDispo(PeriodeReservation periode) {
		List<Salle> listSalleLibre = new ArrayList<Salle>();
		for(Salle s : this.serviceSalles.getListSalle()) {
			if(s!=null && s.isEtat()) {
				listSalleLibre.add(s);
			}
		}
		return listSalleLibre;
	}
	
	public List<SallePolyvalente> getListSallePolyDispo(PeriodeReservation periode) {
		List<SallePolyvalente> listSallePolyLibre = new ArrayList<SallePolyvalente>();
		for(SallePolyvalente s : this.serviceSallesPolyvs.getListSalle()) {
			if(s!=null && s.isEtat()) {
				listSallePolyLibre.add(s);
			}
		}
		return listSallePolyLibre;
	}
	
	public List<Equipement> getListEquipementDispo(PeriodeReservation periode) { 
		List<Equipement> listEquipementLibre = new ArrayList<Equipement>();
		for(Equipement e : this.serviceEquipements.getListEquipement()) {
			if(e!=null && e.isEtat()) {
				listEquipementLibre.add(e);
			}
		}
		return listEquipementLibre;
	}
	
	public List<Service> getListServiceDispo() {
		List<Service> listService = new ArrayList<Service>();
		for(Service s : this.serviceServices.getListService()) {
			if(s!=null) {
				listService.add(s);
			}
		}
		return listService;
	}
}

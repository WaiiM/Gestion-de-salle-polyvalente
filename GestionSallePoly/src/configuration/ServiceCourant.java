package configuration;

import assets.*;
import dao.*;
import reservation.*;

public class ServiceCourant {
	private static SalleDAO daoService;
	private Service service;
	
	public ServiceCourant(Service s) {
		if(daoService == null) {
			daoService = new SalleDAO();
		}
		this.service = s;
	}
	
	public void ajouter() {
		daoService.add(this.service);
	}
	
	public void update() {
		daoService.update(this.service);
	}
	
	public boolean verifierDisponibilite() {
		boolean result = false;
		if(this.service == null) return result;
		result = true;
		return result;
	}
}

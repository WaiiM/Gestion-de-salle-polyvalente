package controller;
import administration.AdministrationControle;
import configuration.ConfigurationControle;
import reservation.ReservationControle;

public class Controller {
	private AdministrationControle adminController;
	private ConfigurationControle configController;
	private ReservationControle reservationController;
	
	public Controller(AdministrationControle ac, ConfigurationControle cc, ReservationControle rc) {
		this.adminController = ac;
		this.configController = cc;
		this.reservationController = rc;
	}

	public AdministrationControle getAdminController() {
		return adminController;
	}

	public ConfigurationControle getConfigController() {
		return configController;
	}

	public ReservationControle getReservationController() {
		return reservationController;
	}
	
	
}

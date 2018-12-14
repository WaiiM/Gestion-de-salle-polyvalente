package testReservation;

import reservation.*;
import vues.Window;
import administration.AdministrationControle;
import assets.*;
import configuration.ConfigurationControle;
import controller.Controller;

public class MainTest {

	public static void main(String[] args) {
		
		AdministrationControle ac = new AdministrationControle();
		ConfigurationControle cc = new ConfigurationControle();
		ReservationControle rc = new ReservationControle();
		
		Occupant occ = new Occupant(1,"WaiiM", TypeOccupant.CITOYEN);
		
		PeriodeReservation periode = new PeriodeReservation("2018-12-13", "2018-12-20");
		
		SallePolyvalente sallePoly = new SallePolyvalente(0, "Nom");
		
		Salle salle = new Salle(0, "Nom", sallePoly);
		sallePoly.addSalle(salle);
		
		Reservation r = new Reservation(occ, periode);
		
		r.addSalleToReservation(salle);
		
		rc.reserver(r);
		
		for(Reservation re : rc.getListReservation()) {
			System.out.println(re);
		}
		
		Window win = new Window(new Controller(ac, cc, rc));
	}

}

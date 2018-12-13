package testReservation;

import reservation.*;
import vue.Window;
import administration.AdministrationControle;
import assets.*;
import configuration.ConfigurationControle;
import controller.Controller;

public class MainTest {

	public static void main(String[] args) {
		
		AdministrationControle ac = new AdministrationControle();
		ConfigurationControle cc = new ConfigurationControle();
		ReservationControle rc = new ReservationControle();
		//
		/*Occupant occ = new Occupant(1,"WaiiM");
		
		PeriodeReservation periode = new PeriodeReservation("12/12/2018", "20/12/2018");
		
		
		Reservation r = new Reservation(occ, periode);
		
		rc.reserver(r);
		
		for(Reservation re : rc.getListReservation()) {
			System.out.println(re);
		}*/
		
		Window win = new Window(new Controller(ac, cc, rc));
	}

}

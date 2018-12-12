package testReservation;

import reservation.*;

public class MainTest {

	public static void main(String[] args) {
		
		ReservationControle rc = new ReservationControle();
		
		rc.reserver();
		
		for(Reservation r : rc.getListReservation()) {
			System.out.println(r);
		}
	}

}

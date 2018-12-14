package state;

import dao.*;

public class StateCourante {
  private static ReservationDAO daoReservation;
  private static SalleDAO daoSalle;
  private static SallePolyvalenteDAO daoSallePoly;
  private State state; // hello
  
  public StateCourante(State c) {
    if(daoReservation == null) {
      daoReservation = new ReservationDAO();
    }
    this.state = c;
  }
  
  public void generer() {
    
  }
}

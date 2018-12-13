package state;

import assets.PeriodeReservation;
import edition.Convention;
import edition.ConventionCourante;
import edition.EditionControle;
import reservation.Reservation;

public class GestionnaireState {
  private StateControle sc;
  
  public GestionnaireState(StateControle sc) {
    this.sc = sc;
  }

  public void getState(PeriodeReservation p) {
    State state = new State(p);
    StateCourante stateCourante = new StateCourante(state);
    stateCourante.generer();
  }

  public void generer(PeriodeReservation p) {
    // TODO Auto-generated method stub
    
  }
}

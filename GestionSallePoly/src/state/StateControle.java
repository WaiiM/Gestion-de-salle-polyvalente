package state;

import assets.PeriodeReservation;

public class StateControle {
private GestionnaireState gs;
  
  public StateControle() {
    this.gs = new GestionnaireState(this);
  }
  
  public void generer(PeriodeReservation p) {
    this.gs.generer(p);
  }
}

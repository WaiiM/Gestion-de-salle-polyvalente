package edition;

import java.util.List;

import reservation.Reservation;

public class EditionControle {
private GestionnaireEdition ge;
  
  public EditionControle() {
    this.ge = new GestionnaireEdition(this);
  }
  
  public void generer(Reservation r) {
    this.ge.generer(r);
  }
}

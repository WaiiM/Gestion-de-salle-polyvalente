package edition;

import reservation.Reservation;

public class GestionnaireEdition {
  
  private EditionControle ae;
  
  public GestionnaireEdition(EditionControle ae) {
    this.ae = ae;
    /*this.serviceAccounts = new Accounts();
    this.serviceAccounts.init(); //*/
  }

  public void generer(Reservation r) {
    String path = "C:\\Users\\Fujitsu_1\\git\\gestionSallePoly\\GestionSallePoly\\src\\edition\\"+r.getId()+r.getOccupant()+".pdf";
    Convention c = new Convention(r);
    ConventionCourante cc = new ConventionCourante(c);
    cc.generer(path);
  }
}

package edition;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import assets.Occupant;
import assets.PeriodeReservation;
import reservation.Reservation;
import reservation.Salle;
import reservation.SallePolyvalente;
import reservation.TypeOccupant;

public class TestPDF {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    EditionControle cc = new EditionControle();
    GestionnaireEdition ge = new GestionnaireEdition(cc);
    Occupant occ = new Occupant(1,"WaiiM", TypeOccupant.CITOYEN);
    
    PeriodeReservation periode = new PeriodeReservation("2018-12-13", "2018-12-20");
    
    SallePolyvalente sallePoly = new SallePolyvalente(0, "Nom");
    
    Salle salle = new Salle(0, "Nom", sallePoly);
    sallePoly.addSalle(salle);
    
    Reservation r = new Reservation(occ, periode);
    
    r.addSalleToReservation(salle);
    cc.generer(r);
    
  }

}

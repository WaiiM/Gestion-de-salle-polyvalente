package state;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;

import dao.*;
import edition.Convention;

public class StateCourante {
  private static ReservationDAO daoReservation;
  private static SalleDAO daoSalle;
  private static SallePolyvalenteDAO daoSallePoly;
  private State state;
  
  public StateCourante(State c) {
    if(daoReservation == null) {
      daoReservation = new ReservationDAO();
    }
    this.state = c;
  }
  
  public void generer() {
    
  }
}

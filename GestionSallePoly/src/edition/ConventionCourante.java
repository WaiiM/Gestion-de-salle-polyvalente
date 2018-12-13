package edition;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import dao.*;

public class ConventionCourante {
  private static ReservationDAO daoReservation;
  private Convention convention;
  
  public ConventionCourante(Convention c) {
    if(daoReservation == null) {
      daoReservation = new ReservationDAO();
    }
    this.convention = c;
  }
  
  public void generer(String path) {
    if(this.convention == null) return;
    Document document = new Document();
    try {
      PdfWriter.getInstance(document, new FileOutputStream(path));
      document.open();
      document.add(Convention.title);
      document.add(convention.mairie);
      document.add(convention.nom);
      document.add(convention.article1);
      document.add(convention.loyer);
      document.add(convention.article2);
      document.add(Convention.reglement);
      document.add(Convention.p1);
      document.add(Convention.p2);
      document.add(Convention.p3);
      document.add(Convention.p4);
      document.add(Convention.p5);
      document.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    System.out.println("PDF Generation DONE");
  }
}

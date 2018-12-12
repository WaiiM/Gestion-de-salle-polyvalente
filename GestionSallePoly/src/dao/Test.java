package dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
  public static void main(String[] args) {
    SalleDAO salleDAO = new SalleDAO();
    try {
      System.out.println("Test 1 : " + salleDAO.isDateValide(1, new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-12"), 
          new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-13")));
      
      System.out.println("Test 2 : " + salleDAO.isDateValide(1, new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-12"), 
          new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-14")));
      
      
    } catch (ParseException e) {
      e.printStackTrace();
    }
    /*
    System.out.println("Test 2 : " + salleDAO.isDateValide(1, new Date(2018, 12, 14), new Date(2018, 12, 18)));
    System.out.println("Test 3 : " + salleDAO.isDateValide(1, new Date(2018, 12, 12), new Date(2018, 12, 14)));
    System.out.println("Test 4 : " + salleDAO.isDateValide(1, new Date(2018, 12, 12), new Date(2018, 12, 15)));
    System.out.println("Test 5 : " + salleDAO.isDateValide(1, new Date(2018, 12, 15), new Date(2018, 12, 18)));
    System.out.println("Test 6 : " + salleDAO.isDateValide(1, new Date(2018, 12, 16), new Date(2018, 12, 18)));
    */
  }
}

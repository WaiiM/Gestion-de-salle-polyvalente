package dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;  

public class Test {
  public static void main(String[] args) throws ParseException {
    SalleDAO salleDAO = new SalleDAO();

 // correct --> true
    System.out.println("Test 1 : " + salleDAO.isDateValide(1, new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-12"),
        new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-13")));

 // correct --> false
    System.out.println("Test 2 : " + salleDAO.isDateValide(1, new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-14"),
        new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-18")));
    
    // correct --> false
    System.out.println("Test 3 : " + salleDAO.isDateValide(1, new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-12"),
        new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-14")));
    
    // correct --> false
    System.out.println("Test 4 : " + salleDAO.isDateValide(1, new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-12"),
        new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-15")));
    
    // correct --> false
    System.out.println("Test 5 : " + salleDAO.isDateValide(1, new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-15"),
        new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-18")));
    
    // correct --> true
    System.out.println("Test 6 : " + salleDAO.isDateValide(1, new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-16"),
        new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-18")));

  }
}

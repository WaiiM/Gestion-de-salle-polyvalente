package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import assets.Equipement;
import assets.Occupant;
import assets.Service;
import reservation.Piece;
import reservation.Reservation;

public class ReservationDAO extends DAO{
 
  @Override
  public boolean add(Object o) {
    if(o == null) return false;
    if(!(o instanceof Reservation)) return false;
    else {
      
    }
    return false;
  }

  @Override
  public boolean delete(int id) {
    Statement statement;
    try{
      String query = "DELETE FROM **** WHERE ****="+id;
      statement = connection.createStatement();
      statement.executeUpdate(query);
      System.out.println("Suppression effectue");
      return true;
   }catch(SQLException e){
       System.out.println(e.getMessage());
       return false;
   }
  }

  @Override
  public boolean update(Object o) {
    
    return false;
  }
  public Reservation getReservation(int id) {
    ResultSet result;
    
    
    
    Reservation reservation = null;
    Occupant occupant;
    List<Piece> listSalle;
    List<Service> listSerivce;
    List<Equipement> listEquipement;
    
    
    return reservation;
  }
  
  
  
  public boolean isDateValide(int id, Date dateDebut, Date dateFin) {
    Statement statement;
    try{
      String query = "SELECT  FROM **** WHERE ****="+id;
      statement = connection.createStatement();
      statement.executeUpdate(query);
      
      return true;
   }catch(SQLException e){
       System.out.println(e.getMessage());
       return false;
   }
  }
  
  public List<Reservation> getAllReservation(){
    List<Reservation> res = new ArrayList<>();
    
    return res;
  }

}

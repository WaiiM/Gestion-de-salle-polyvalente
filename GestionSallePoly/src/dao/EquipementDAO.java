package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import assets.Equipement;
import assets.PeriodeReservation;

public class EquipementDAO extends DAO {

  @Override
  public int add(Object o) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public boolean delete(int id) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean update(Object o) {
    // TODO Auto-generated method stub
    return false;
  }

  
  public Equipement getEquipement(int idEquipement) {
    
 // TODO Auto-generated method stub
    return null;
  }
  
  
  public boolean isDateValide(int equMobId, Date dateDebut, Date dateFin) {
    if (dateDebut.after(dateFin)) return false;
    Statement statement;
    ResultSet resultSet;
    try {
      String query = "SELECT res_date_debut, res_date_fin FROM r_reservation_equipement_mobile WHERE sal_id=" + equMobId+" ORDER BY DESC LIMIT 1,1";
      statement = connection.createStatement();
      resultSet = statement.executeQuery(query);
      while (resultSet.next()) {
        return new PeriodeReservation(resultSet.getString("res_date_debut"), resultSet.getString("res_date_fin")).isIncluded(new PeriodeReservation(dateDebut.toString(), dateFin.toString()));
      }
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }
}

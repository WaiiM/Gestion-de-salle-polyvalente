package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import assets.Equipement;
import assets.Occupant;
import assets.Service;
import reservation.Piece;
import reservation.Reservation;

public class ReservationDAO extends DAO {

  @Override
  public boolean add(Object o) {
    if (o == null)
      return false;
    if (!(o instanceof Reservation))
      return false;
    else {
      Reservation reservation = (Reservation) o;
      Statement statement;

      try {
        statement = connection.createStatement();
        for (int i = 0; i < reservation.getListSalle().size(); i++) {
          String query = "INSERT INTO t_reservation_res(res_occ_id) VALUES ("
              + reservation.getListSalle().get(i).getId() + ")";
          statement.executeUpdate(query);
        }
        return true;

      } catch (Exception e) {
        return false;
      } 
    }
  }

  @Override
  public boolean delete(int id) {
    Statement statement;
    try {
      String query = "DELETE FROM r_reservation_salle WHERE res_id=" + id;
      statement = connection.createStatement();
      statement.executeUpdate(query);
      return true;
    } catch (SQLException e) {
      return false;
    }
  }

  @Override
  public boolean update(Object o) {

    return false;
  }

  public Reservation getReservation(int id) {
    Reservation reservation = null;
    Occupant occupant;
    List<Piece> listSalle;
    List<Service> listSerivce;
    List<Equipement> listEquipement;
    
    Statement statement;
    ResultSet resultSet;
    try {
      String query = "SELECT res_date_debut, res_date_fin FROM r_reservation_salle WHERE sal_id=" +id;
      
      statement = connection.createStatement();
      resultSet = statement.executeQuery(query);
      while (resultSet.next()) {
        Date debut = new SimpleDateFormat("yyyy-MM-dd").parse(resultSet.getString("res_date_debut"));
        Date fin = new SimpleDateFormat("yyyy-MM-dd").parse(resultSet.getString("res_date_fin"));

        if (dateDebut.before(debut) && !dateDebut.equals(debut) && dateFin.before(debut) && !dateFin.equals(debut)) {
          return true;
        } else {

          if (dateDebut.after(fin) && !dateDebut.equals(fin)) {
            return true;
          } else {
            return false;
          }
        }
      }
    } catch (Exception e) {
      return false;
    }

    return reservation;
  }


  public List<Reservation> getAllReservation() {
    List<Reservation> res = new ArrayList<>();

    return res;
  }

}

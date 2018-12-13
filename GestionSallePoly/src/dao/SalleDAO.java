package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import assets.PeriodeReservation;
import reservation.Piece;
import reservation.Reservation;
import reservation.Salle;

public class SalleDAO extends DAO {

  @Override
  public int add(Object o) {
    if (o == null)
      return 0;
    if (!(o instanceof Salle))
      return 0;
    else {
      int id;
      Salle salle = (Salle) o;
      Statement statement;

      try {
        statement = connection.createStatement();
        //for (int i = 0; i < reservation.getListSalle().size(); i++) {
          String query = "INSERT INTO t_salle_sal(sal_type) VALUES ('"+salle.getType().toString()+"', "+ salle.getSallePolyv().getId() + ")";
          id = statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        //}
        return id;

      } catch (Exception e) {
        e.printStackTrace();
        return 0;
      }
    }
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
  
  public Piece getSalle(int idSalle) {
    
 // TODO Auto-generated method stub
    return null;
  }
  

  public boolean isDateValide(int salleId, Date dateDebut, Date dateFin) {
    if (dateDebut.after(dateFin)) return false;

    Statement statement;
    ResultSet resultSet;
    try {
      String query = "SELECT res_date_debut, res_date_fin FROM r_reservation_salle WHERE sal_id="+salleId+" ORDER BY res_date_debut DESC LIMIT 1,1";
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

  public boolean addReservation(Reservation r, Piece s) {
    if (s == null || r == null) return false;
    Salle salle = (Salle) s;
    Statement statement;
    try {
      statement = connection.createStatement();
      String query = "INSERT INTO r_reservation_salle(res_id, sal_id, res_date_debut, res_date_fin) VALUES ("+r.getId()+", "+ salle.getId() + ", '"+r.getPeriodeReservation().getDateDebutString()+"', '"+r.getPeriodeReservation().getDateFinString()+"')";
      statement.executeUpdate(query);
      return true;

    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

}

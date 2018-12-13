package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import assets.PeriodeReservation;
import reservation.Piece;
import reservation.Reservation;
import reservation.Salle;

public class SallePolyvalenteDAO extends DAO{

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

  public boolean isDateValide(int sallePolId, Date dateDebut, Date dateFin) {
    if (dateDebut.after(dateFin)) return false;
    Statement statement;
    ResultSet resultSet;
    try {
      String query = "SELECT res_date_debut, res_date_fin FROM r_reservation_salle_plyvalente WHERE sal_id=" + sallePolId+" ORDER BY DESC LIMIT 1,1";
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
      String query = "INSERT INTO r_reservation_salle_plyvalente(res_id, sal_id, res_date_debut, res_date_fin) VALUES ('"+salle.getId()+"', "+ r.getId() + ", '"+r.getPeriodeReservation().getDateDebut().toString()+"', '"+r.getPeriodeReservation().getDateFin().toString()+"')";
      statement.executeUpdate(query);
      return true;

    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }
}

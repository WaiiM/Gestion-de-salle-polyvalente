package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SallePolyvalenteDAO extends DAO{

  @Override
  public boolean add(Object o) {
    // TODO Auto-generated method stub
    return false;
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
    else {
      Statement statement;
      ResultSet resultSet;
      try {
        String query = "SELECT res_date_debut, res_date_fin FROM r_reservation_salle_plyvalente WHERE spl_id=" + sallePolId;
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
      return false;
    }
  }
}

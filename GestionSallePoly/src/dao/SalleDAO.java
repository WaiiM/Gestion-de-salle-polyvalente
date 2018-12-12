package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SalleDAO extends DAO {

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
  
  public boolean isDateValide(int salleId, Date dateDebut, Date dateFin) {
    if(dateDebut.after(dateFin)) return false;
    else {
      Statement statement;
      ResultSet resultSet;

      try {
        String query = "SELECT res_date_debut, res_date_fin FROM r_reservation_salle WHERE sal_id=" + salleId;
        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);
        while(resultSet.next()) { // pourquoi while, alors qu'on va récuprer juste une seule instruction
        	/*
        	 * REMARQUE: J'ai codé une méthode fla classe PeriodeReservation, tu peux l'utiliser pour comparer les dates
        	 * Tu l'instances avec les 2 dates de l'occupation de la salle et tu donnes les dates passés en param fla méthode isIncluded
        	 */
          //
          /* Dans le cas ou la date de debut en parametre est avant la date recuperer de la BDD */
          if(new SimpleDateFormat("yyyy-MM-dd").parse(resultSet.getString("res_date_debut")).before(new SimpleDateFormat("yyyy-MM-dd").format(dateDebut)) && 
              dateFin.before(new SimpleDateFormat("yyyy-MM-dd").parse(resultSet.getString("res_date_debut"))) 
              ) {
            System.out.println(dateDebut);
            System.out.println(new SimpleDateFormat("yyyy-MM-dd").parse(resultSet.getString("res_date_debut")));
            return true;
          }
          else {
            /* Dans le cas ou la date de debut en parametre est avant la date recuperer de la BDD */
            if(dateDebut.after(new SimpleDateFormat("yyyy-MM-dd").parse(resultSet.getString("res_date_fin")))) {
              System.out.println(dateDebut);
              System.out.println(new SimpleDateFormat("yyyy-MM-dd").parse(resultSet.getString("res_date_debut")));
              return true;
            }
            else {
              return false;
            }
          }
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        return false;
      }
      return false;
    }
  }

}

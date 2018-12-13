package dao;

import java.sql.ResultSet;
import java.sql.Statement;

import assets.Occupant;
import reservation.Reservation;
import reservation.TypeOccupant;

public class OccupantDAO extends DAO{

  @Override
  public int add(Object o) {
    if (o == null)
      return 0;
    if (!(o instanceof Occupant))
      return 0;
    else {
      Occupant occupant = (Occupant) o;
      Statement statement;
      int id;
      try {
        //int typeId = getIdType(occupant.getType());
        
        statement = connection.createStatement();
        //for (int i = 0; i < reservation.getListSalle().size(); i++) {
          String query = "INSERT INTO t_occupant_occ(occ_nom, occ_toc_id) VALUES ('"+ occupant.getName() + "', 1)";
          id = statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        //}
        return id;

      } catch (Exception e) {
        e.printStackTrace();
        return 0;
      }
    }
  }

  private int getIdType(TypeOccupant o) {
    if (o == null)
      return 1;
    if (!(o instanceof TypeOccupant))
      return 1;
    else {
      TypeOccupant type = (TypeOccupant) o;
      Statement statement;
      ResultSet resultSet;
      try {
        statement = connection.createStatement();
        //for (int i = 0; i < reservation.getListSalle().size(); i++) {
          String query = "SELECT toc_id FROM t_type_occupant_toc WHERE toc_libelle in ('"+type.toString()+"')";
          statement.executeQuery(query);
          resultSet = statement.executeQuery(query);
          int id = Integer.parseInt(resultSet.getString("toc_id"));
          return id;
        //}

      } catch (Exception e) {
        e.printStackTrace();
        return 1;
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

  public Occupant getOccupnt(int idOccupant) {
    
    return null;
  }

}

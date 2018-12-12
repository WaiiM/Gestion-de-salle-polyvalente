package dao;

import java.sql.*;

public abstract class DAO {

  protected Connection connection;
  protected Statement statement;
  protected ResultSet result;

  public boolean connect() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Driver ok");

      connection = DriverManager.getConnection(Infos.url, Infos.user, Infos.pass);
      System.out.println("Connexion bien établié");
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  public abstract boolean add(Object o);

  public abstract boolean delete(int id);

  public abstract boolean update(Object o);
}

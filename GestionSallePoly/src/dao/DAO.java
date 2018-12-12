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

      String url = "jdbc:mysql://obiwan2.univ-brest.fr/zfm1-zkardyan0";
      String user = "zkardyan0";
      String password = "xphvfvqb";
      
      connection = DriverManager.getConnection(url, user, password);
      System.out.println("Connexion bien établié");
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }
  public abstract boolean create();

  public abstract boolean delete();

  public abstract boolean update();
  /*
  public static void main(String []args) {
    new DAO().connect();
  }
  */
}

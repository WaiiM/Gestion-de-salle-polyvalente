package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import administration.*;
import assets.*;

import reservation.*;


public class AccountDAO extends DAO{
  @Override
  public int add(Object o) {
    if (o == null)
      return 0;
    if (!(o instanceof Account))
      return 0;
    else {
      Account account = (Account) o;
      Statement statement;
      int id;
      try {
        statement = connection.createStatement();
        String query = "INSERT INTO account(user, password, type) VALUES ("
            + account.getName() + ", "+account.getPassword()+", "+account.getType()+")";
        id = statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        return id;

      } catch (Exception e) {
        return 0;
      }
    }
  }

  @Override
  public boolean delete(int id) {
    Statement statement;
    try {
      String query = "DELETE FROM account WHERE id=" + id;
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

  public Account getAccount(Account account) {
    Statement statement;
    ResultSet resultSet;
    Account accountResult = null;
    try {
      String query = "SELECT * FROM account WHERE user='"+account.getName()+"' AND password = '"+account.getPassword()+"'";
      statement = connection.createStatement();
      resultSet = statement.executeQuery(query);
      // Get the occupant id

      if (resultSet.next()) {
        int id = Integer.parseInt(resultSet.getString("id"));
        String user = (resultSet.getString("user"));
        String password = (resultSet.getString("password"));
        String type = (resultSet.getString("type"));
        if (id != 0) {
          if("Admin".equals(type)) {
            accountResult = new Admin(id, user, password);
          }
          else {
            accountResult = new Secretaire(id, user, password);
          } 
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
    return accountResult;
  }

  public List<Account> getAllAccount() {
    Statement statement;
    ResultSet resultSet;

    List<Account> listAccount = new ArrayList<Account>();

    try {
      String query = "SELECT * FROM account";
      statement = connection.createStatement();
      resultSet = statement.executeQuery(query);
      // Get the occupant id
      while (resultSet.next()) { 
        int idAccount = Integer.parseInt(resultSet.getString("id"));
        String user = (resultSet.getString("user"));
        String password = (resultSet.getString("password"));
        String type = (resultSet.getString("type"));
        if (idAccount != 0) {
          if("Admin".equals(type)) {
            listAccount.add(new Admin(idAccount, user, password));
          }
          else {
            listAccount.add(new Secretaire(idAccount, user, password));
          }
        }
      }
    } catch (Exception e) {
    }

    return listAccount;
  }
}

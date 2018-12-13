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
import assets.PeriodeReservation;
import assets.Service;
import reservation.EtapeReservation;
import reservation.Piece;
import reservation.Reservation;

public class ReservationDAO extends DAO {

  @Override
  public int add(Object o) {
    if (o == null)
      return 0;
    if (!(o instanceof Reservation))
      return 0;
    else {
      int id;
      Reservation reservation = (Reservation) o;
      Statement statement;

      try {
        statement = connection.createStatement();
        //for (int i = 0; i < reservation.getListSalle().size(); i++) {
          String query = "INSERT INTO t_reservation_res(res_etape, res_occ_id) VALUES ('"+reservation.getEtape().toString()+"', "+ reservation.getOccupant().getId() + ")";
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

  private Occupant getOccupant(int idReservation) {
    Statement statement;
    ResultSet resultSet;
    try {
      String query = "SELECT res_occ_id FROM t_reservation_res WHERE res_id=" + idReservation;
      statement = connection.createStatement();
      resultSet = statement.executeQuery(query);
      // Get the occupant id
      int idOccupant = 0;
      while (resultSet.next()) {
        idOccupant = Integer.parseInt(resultSet.getString("res_occ_id"));
      }
      // get the occupant data
      if (idOccupant != 0) {
        OccupantDAO ocupantDAO = new OccupantDAO();
        return ocupantDAO.getOccupnt(idOccupant);
      } else {
        return null;
      }
    } catch (Exception e) {
      return null;
    }
  }

  private List<Piece> getSalles(int idReservation) {
    Statement statement;
    ResultSet resultSet;

    List<Piece> listeSalles = new ArrayList<>();

    try {
      String query = "SELECT sal_id FROM r_reservation_salle WHERE res_id=" + idReservation;
      statement = connection.createStatement();
      resultSet = statement.executeQuery(query);
      // Get the salle id
      int idSalle = 0;
      while (resultSet.next()) {
        idSalle = Integer.parseInt(resultSet.getString("sal_id"));

        if (idSalle != 0) {
          SalleDAO salleDAO = new SalleDAO();
          listeSalles.add(salleDAO.getSalle(idSalle));
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return listeSalles;
  }

  private List<Service> getServices(int idReservation) {
    Statement statement;
    ResultSet resultSet;

    List<Service> listeServices = new ArrayList<>();

    try {
      String query = "SELECT ser_id FROM r_reservation_service WHERE res_id=" + idReservation;
      statement = connection.createStatement();
      resultSet = statement.executeQuery(query);
      // Get the seervice id
      int idService = 0;
      while (resultSet.next()) {
        idService = Integer.parseInt(resultSet.getString("ser_id"));

        if (idService != 0) {
          ServiceDAO servieDAO = new ServiceDAO();
          listeServices.add(servieDAO.getService(idService));
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return listeServices;
  }

  private List<Equipement> getEquipements(int idReservation) {
    Statement statement;
    ResultSet resultSet;

    List<Equipement> listeEquipements = new ArrayList<>();

    try {
      String query = "SELECT eqm_id FROM r_reservation_equipement_mobile WHERE res_id="
          + idReservation;
      statement = connection.createStatement();
      resultSet = statement.executeQuery(query);
      // Get the equipement id
      int idEquipement = 0;
      while (resultSet.next()) {
        idEquipement = Integer.parseInt(resultSet.getString("eqm_id"));

        if (idEquipement != 0) {
          EquipementDAO equipementDAO = new EquipementDAO();
          listeEquipements.add(equipementDAO.getEquipement(idEquipement));
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return listeEquipements;
  }

  private PeriodeReservation getPeriodeReservation(int idReservation) {
    Statement statement;
    ResultSet resultSet;
    try {
      String query = "SELECT res_date_debut, res_date_fin FROM r_reservation_salle WHERE res_id="
          + idReservation;
      statement = connection.createStatement();
      resultSet = statement.executeQuery(query);
      // Get the occupant id
      String dateDebut = null;
      String dateFin = null;
      while (resultSet.next()) {
        dateDebut = (resultSet.getString("res_date_debut"));
        dateFin = (resultSet.getString("res_date_fin"));
      }
      // get the occupant data
      if (dateDebut != null && dateFin != null) {
        return new PeriodeReservation(dateDebut, dateFin);
      } else {
        return null;
      }
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  public Reservation getReservation(int idReservation) {
    // get occupant
    Occupant occupant = this.getOccupant(idReservation);
    // get list salle
    List<Piece> listSalle = this.getSalles(idReservation);
    // get liste service
    List<Service> listSerivce = getServices(idReservation);
    // get liste equipement
    List<Equipement> listEquipement = getEquipements(idReservation);
    // get periode reservation
    PeriodeReservation periodeReservation = getPeriodeReservation(idReservation);
    // get liste equipement --> attr
    EtapeReservation etape = null;
    // retourner la reservation
    Reservation reservation = new Reservation(occupant, periodeReservation);
    reservation.setOccupant(occupant);
    reservation.setListSalle(listSalle);
    reservation.setListSerivce(listSerivce);
    reservation.setListEquipement(listEquipement);
    reservation.setEtape(etape);
    return reservation;
  }

  public List<Reservation> getAllReservation() {
    Statement statement;
    ResultSet resultSet;

    List<Reservation> listeReservations = new ArrayList<>();

    try {
      String query = "SELECT res_id FROM t_reservation_res";
      statement = connection.createStatement();
      resultSet = statement.executeQuery(query);
      // Get the occupant id
      int idReservation = 0;
      while (resultSet.next()) {
        idReservation = Integer.parseInt(resultSet.getString("res_id"));

        if (idReservation != 0) {
          listeReservations.add(getReservation(idReservation));
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return listeReservations;
  }

}

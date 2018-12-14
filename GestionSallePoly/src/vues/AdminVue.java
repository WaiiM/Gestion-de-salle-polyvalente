package vues;

import javax.swing.JPanel;

import vues.menu.MenuAdministrateur;
import vues.reservation.GestionReservation;

public class AdminVue extends JPanel{
  private static final long serialVersionUID = 1L;

  public AdminVue() {
    this.setLayout(null);
    
    MenuAdministrateur menu = new MenuAdministrateur();
    GestionReservation gestionReservation = new GestionReservation();
    menu.setBounds(0, 0, 199, 502);
    gestionReservation.setBounds(200, 0, 716, 502);
    
    this.add(menu);
    this.add(gestionReservation);
  }
}

package vues;

import javax.swing.JPanel;

import vues.menu.MenuSecretaire;
import vues.reservation.GestionReservation;

public class SecretaireVue extends JPanel{
  private static final long serialVersionUID = 1L;

  private MenuSecretaire menu;
  private GestionReservation gestionReservation;
  
  public SecretaireVue() {
		this.setLayout(null);
		menu = new MenuSecretaire();
		gestionReservation = new GestionReservation();
		
		menu.setBounds(0, 0, 199, 502);		
		gestionReservation.setBounds(200, 0, 716, 502);
		
		this.add(menu);
		this.add(gestionReservation);
	}
}

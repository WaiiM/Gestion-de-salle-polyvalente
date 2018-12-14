package vues.menu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import vues.reservation.GestionReservation;

public class MenuSecretaire extends JPanel {
  private static final long serialVersionUID = 1L;

  public MenuSecretaire() {
    this.setLayout(null);
    JButton btnNewButton = new JButton("Acceuil");
    btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
    btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
    btnNewButton.setBounds(0, 0, 200, 41);
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        new GestionReservation();
      }
    });
    add(btnNewButton);

    JButton btnGestionSalle = new JButton("Gestion des Salles");
    btnGestionSalle.setHorizontalAlignment(SwingConstants.LEFT);
    btnGestionSalle.setFont(new Font("Tahoma", Font.PLAIN, 15));
    btnGestionSalle.setBounds(0, 37, 200, 41);
    add(btnGestionSalle);

    JButton btnGestionEquipement = new JButton("Gestion des Equipements");
    btnGestionEquipement.setHorizontalAlignment(SwingConstants.LEFT);
    btnGestionEquipement.setFont(new Font("Tahoma", Font.PLAIN, 15));
    btnGestionEquipement.setBounds(0, 75, 200, 41);
    add(btnGestionEquipement);

    JButton btnStatistiques = new JButton("Statistiques");
    btnStatistiques.setHorizontalAlignment(SwingConstants.LEFT);
    btnStatistiques.setFont(new Font("Tahoma", Font.PLAIN, 15));
    btnStatistiques.setBounds(0, 114, 200, 41);
    add(btnStatistiques);

    JButton btnGestionDesOccupants = new JButton("Gestion des Occupants");
    btnGestionDesOccupants.setFont(new Font("Tahoma", Font.PLAIN, 15));
    btnGestionDesOccupants.setHorizontalAlignment(SwingConstants.LEFT);
    btnGestionDesOccupants.setBounds(0, 152, 200, 41);
    add(btnGestionDesOccupants);
  }

}

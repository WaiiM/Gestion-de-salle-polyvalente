package vues.equipement;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import vues.reservation.AjouterReservation;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionEquipement extends JPanel{
  public GestionEquipement() {
    setLayout(null);
    
    JLabel lblFiltre = new JLabel("Filtre : ");
    lblFiltre.setFont(new Font("Tahoma", Font.PLAIN, 18));
    lblFiltre.setBounds(28, 32, 88, 22);
    add(lblFiltre);
    
    JComboBox<String> comboBox = new JComboBox<>();
    comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
    comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tout", "Statique", "Modele"}));
    comboBox.setBounds(140, 33, 177, 25);
    add(comboBox);
    
    JLabel lblRechrche = new JLabel("Recherche : ");
    lblRechrche.setFont(new Font("Tahoma", Font.PLAIN, 18));
    lblRechrche.setBounds(28, 78, 110, 22);
    add(lblRechrche);
    
    textField = new JTextField();
    textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
    textField.setBounds(140, 81, 177, 22);
    add(textField);
    textField.setColumns(10);
    
    JLabel lblListeDesReservations = new JLabel("Liste des reservations : ");
    lblListeDesReservations.setBounds(28, 123, 156, 14);
    add(lblListeDesReservations);
    
    JButton btnAjouterUneReservation = new JButton("Ajouter un nouvel equipement");
    btnAjouterUneReservation.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        new AjouterReservation();
      }
    });
    btnAjouterUneReservation.setHorizontalAlignment(SwingConstants.LEFT);
    btnAjouterUneReservation.setFont(new Font("Tahoma", Font.PLAIN, 15));
    btnAjouterUneReservation.setBounds(374, 32, 243, 38);
    add(btnAjouterUneReservation);
    
    JButton btnNewButton = new JButton("Exporter la liste des Equipement");
    btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
    btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
    btnNewButton.setBounds(374, 78, 243, 38);
    add(btnNewButton);
    
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(28, 138, 589, 329);
    add(scrollPane);
    
    table = new JTable();
    scrollPane.setViewportView(table);
    table.setModel(new DefaultTableModel(
      new Object[][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
      },
      new String[] {
        "Ref", "Nom de l'equipement", "Disponibilite de l'equipement", "Actions"
      }
    ));
    table.getColumnModel().getColumn(1).setPreferredWidth(150);
    table.getColumnModel().getColumn(2).setPreferredWidth(150);
  }
  private static final long serialVersionUID = 1L;
  private JTextField textField;
  private JTable table;
}

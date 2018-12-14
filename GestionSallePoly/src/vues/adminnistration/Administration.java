package vues.adminnistration;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Administration extends JPanel{
  public Administration() {
    setLayout(null);
    
    JLabel lblRechrche = new JLabel("Recherche : ");
    lblRechrche.setFont(new Font("Tahoma", Font.PLAIN, 18));
    lblRechrche.setBounds(10, 10, 110, 29);
    add(lblRechrche);
    
    textField = new JTextField();
    textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
    textField.setBounds(118, 11, 177, 28);
    add(textField);
    textField.setColumns(10);
    
    JLabel lblListeDesReservations = new JLabel("Liste des utilisateurs : ");
    lblListeDesReservations.setBounds(10, 62, 156, 14);
    add(lblListeDesReservations);
    
    JButton btnAjouterUneReservation = new JButton("Ajouter un Utilisateur");
    btnAjouterUneReservation.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        new AjouterUtilisateur();
      }
    });
    btnAjouterUneReservation.setHorizontalAlignment(SwingConstants.LEFT);
    btnAjouterUneReservation.setFont(new Font("Tahoma", Font.PLAIN, 15));
    btnAjouterUneReservation.setBounds(536, 11, 170, 31);
    add(btnAjouterUneReservation);
    
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(15, 87, 702, 202);
    add(scrollPane);
    
    table = new JTable();
    scrollPane.setViewportView(table);
    table.setModel(new DefaultTableModel(
      new Object[][] {
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
      },
      new String[] {
        "Username", "Nom", "Pr\u00E9nom", "Telephone", "D\u00E9sactivation", "Type Utilisateur", "Supression"
      }
    ));
    table.getColumnModel().getColumn(0).setPreferredWidth(100);
    table.getColumnModel().getColumn(1).setPreferredWidth(100);
    table.getColumnModel().getColumn(2).setPreferredWidth(100);
    table.getColumnModel().getColumn(3).setPreferredWidth(100);
    table.getColumnModel().getColumn(4).setPreferredWidth(100);
    table.getColumnModel().getColumn(5).setPreferredWidth(100);
    table.getColumnModel().getColumn(6).setPreferredWidth(100);
  }
  private static final long serialVersionUID = 1L;
  private JTextField textField;
  private JTable table;
}

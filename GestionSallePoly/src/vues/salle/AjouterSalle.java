package vues.salle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class AjouterSalle extends JFrame{
  public AjouterSalle() {
    setTitle("Ajouter une salle");
    setResizable(false);
    getContentPane().setLayout(null);
    
    JLabel lblNomDeLa = new JLabel("Nom de la salle : ");
    lblNomDeLa.setBounds(10, 24, 105, 14);
    getContentPane().add(lblNomDeLa);
    
    JLabel lblSurfaceDeLa = new JLabel("Surface de la salle : ");
    lblSurfaceDeLa.setBounds(10, 60, 105, 14);
    getContentPane().add(lblSurfaceDeLa);
    
    JLabel lblCapacitDeLa = new JLabel("Capacité de la salle :");
    lblCapacitDeLa.setBounds(10, 95, 105, 14);
    getContentPane().add(lblCapacitDeLa);
    
    JLabel lblNombreDeLa = new JLabel("Nombre de la salle : ");
    lblNombreDeLa.setBounds(10, 132, 105, 14);
    getContentPane().add(lblNombreDeLa);
    
    JLabel lblListeDesEquipements = new JLabel("Liste des equipements : ");
    lblListeDesEquipements.setBounds(10, 161, 145, 14);
    getContentPane().add(lblListeDesEquipements);
    
    JLabel lblAjouterEquipement = new JLabel("Ajouter equipement : ");
    lblAjouterEquipement.setBounds(41, 186, 114, 14);
    getContentPane().add(lblAjouterEquipement);
    
    JLabel lblListeDesEquipements_1 = new JLabel("Liste des equipements à louer : ");
    lblListeDesEquipements_1.setBounds(41, 213, 188, 14);
    getContentPane().add(lblListeDesEquipements_1);
    
    textField = new JTextField();
    textField.setBounds(125, 21, 200, 20);
    getContentPane().add(textField);
    textField.setColumns(10);
    
    textField_1 = new JTextField();
    textField_1.setBounds(125, 57, 62, 20);
    getContentPane().add(textField_1);
    textField_1.setColumns(10);
    
    textField_2 = new JTextField();
    textField_2.setColumns(10);
    textField_2.setBounds(125, 92, 62, 20);
    getContentPane().add(textField_2);
    
    JComboBox comboBox = new JComboBox();
    comboBox.setModel(new DefaultComboBoxModel(new String[] {"Equipement 1", "Equipement 2", "Equipement 3", "Equipement 4", "Equipement 5"}));
    comboBox.setBounds(165, 183, 114, 20);
    getContentPane().add(comboBox);
    
    JLabel lblTarifsDeLa = new JLabel("Tarifs de la salle : ");
    lblTarifsDeLa.setBounds(371, 161, 145, 14);
    getContentPane().add(lblTarifsDeLa);
    
    JLabel lblTypeDuClient = new JLabel("Type du client : ");
    lblTypeDuClient.setBounds(380, 186, 94, 14);
    getContentPane().add(lblTypeDuClient);
    
    JLabel lblCotDeLa = new JLabel("Coût de la  location :");
    lblCotDeLa.setBounds(380, 213, 114, 14);
    getContentPane().add(lblCotDeLa);
    
    JComboBox comboBox_1 = new JComboBox();
    comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Association", "Citoyen", "Autres"}));
    comboBox_1.setBounds(496, 183, 126, 20);
    getContentPane().add(comboBox_1);
    
    textField_3 = new JTextField();
    textField_3.setColumns(10);
    textField_3.setBounds(496, 210, 62, 20);
    getContentPane().add(textField_3);
    
    JLabel label = new JLabel("€");
    label.setFont(new Font("Tahoma", Font.BOLD, 13));
    label.setBounds(560, 213, 22, 14);
    getContentPane().add(label);
    
    JButton btnAjouter = new JButton("+");
    btnAjouter.setBounds(581, 209, 41, 23);
    getContentPane().add(btnAjouter);
    
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(41, 238, 238, 92);
    getContentPane().add(scrollPane);
    
    JList list = new JList();
    scrollPane.setViewportView(list);
    
    JButton button = new JButton("+");
    button.setBounds(289, 182, 41, 23);
    getContentPane().add(button);
    
    JScrollPane scrollPane_1 = new JScrollPane();
    scrollPane_1.setBounds(384, 238, 238, 92);
    getContentPane().add(scrollPane_1);
    
    JList list_1 = new JList();
    scrollPane_1.setViewportView(list_1);
    
    JButton btnNewButton = new JButton("Ajouter la salle");
    btnNewButton.setBounds(241, 375, 159, 33);
    getContentPane().add(btnNewButton);
    
    JLabel lblM = new JLabel("m2");
    lblM.setBounds(197, 60, 46, 14);
    getContentPane().add(lblM);
    
    JLabel lblPices = new JLabel("pièce(s)");
    lblPices.setBounds(197, 95, 46, 14);
    getContentPane().add(lblPices);
  }
  private static final long serialVersionUID = 1L;
  private JTextField textField;
  private JTextField textField_1;
  private JTextField textField_2;
  private JTextField textField_3;
}

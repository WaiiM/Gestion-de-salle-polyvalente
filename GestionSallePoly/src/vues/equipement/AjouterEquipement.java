package vues.equipement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class AjouterEquipement extends JFrame{
  public AjouterEquipement() {
    setResizable(false);
    setTitle("Ajouter un Equipement");
    getContentPane().setLayout(null);
    
    JLabel lblNomDeLequipement = new JLabel("Nom de l'equipement : ");
    lblNomDeLequipement.setBounds(10, 26, 120, 14);
    getContentPane().add(lblNomDeLequipement);
    
    JLabel lblTypeDeLequipement = new JLabel("Type de l'equipement : ");
    lblTypeDeLequipement.setBounds(10, 60, 120, 14);
    getContentPane().add(lblTypeDeLequipement);
    
    JLabel lblNewLabel = new JLabel("Disponibilité  : ");
    lblNewLabel.setBounds(10, 94, 108, 14);
    getContentPane().add(lblNewLabel);
    
    textField = new JTextField();
    textField.setBounds(140, 23, 180, 20);
    getContentPane().add(textField);
    textField.setColumns(10);
    
    JComboBox comboBox = new JComboBox();
    comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mobile", "Statique"}));
    comboBox.setBounds(140, 57, 92, 20);
    getContentPane().add(comboBox);
    
    JComboBox comboBox_1 = new JComboBox();
    comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Disponible", "Non Disponible"}));
    comboBox_1.setBounds(136, 91, 96, 20);
    getContentPane().add(comboBox_1);
    
    JButton btnNewButton = new JButton("Ajouter l'equipement");
    btnNewButton.setBounds(40, 149, 252, 41);
    getContentPane().add(btnNewButton);
  }
  private static final long serialVersionUID = 1L;
  private JTextField textField;
}

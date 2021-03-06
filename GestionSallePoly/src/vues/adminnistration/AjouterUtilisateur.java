package vues.adminnistration;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AjouterUtilisateur extends JFrame{
  public AjouterUtilisateur() {
    setTitle("Ajouter un Utilisateur");
    setResizable(false);
    getContentPane().setLayout(null);
    setVisible(true);
    
    JLabel lblNom = new JLabel("Nom : ");
    lblNom.setFont(new Font("Tahoma", Font.PLAIN, 13));
    lblNom.setBounds(10, 11, 56, 14);
    getContentPane().add(lblNom);
    
    JLabel lblPrnom = new JLabel("Prénom : ");
    lblPrnom.setFont(new Font("Tahoma", Font.PLAIN, 13));
    lblPrnom.setBounds(10, 43, 68, 14);
    getContentPane().add(lblPrnom);
    
    textField = new JTextField();
    textField.setBounds(115, 9, 150, 20);
    getContentPane().add(textField);
    textField.setColumns(10);
    
    textField_1 = new JTextField();
    textField_1.setBounds(115, 41, 150, 20);
    getContentPane().add(textField_1);
    textField_1.setColumns(10);
    
    JLabel lblPseudonyme = new JLabel("Pseudo : ");
    lblPseudonyme.setFont(new Font("Tahoma", Font.PLAIN, 13));
    lblPseudonyme.setBounds(10, 74, 86, 14);
    getContentPane().add(lblPseudonyme);
    
    textField_2 = new JTextField();
    textField_2.setBounds(115, 72, 150, 20);
    getContentPane().add(textField_2);
    textField_2.setColumns(10);
    
    JLabel lblTypeUtilisateur = new JLabel("Type Utilisateur : ");
    lblTypeUtilisateur.setFont(new Font("Tahoma", Font.PLAIN, 13));
    lblTypeUtilisateur.setBounds(10, 143, 103, 14);
    getContentPane().add(lblTypeUtilisateur);
    
    JComboBox<String> comboBox = new JComboBox<>();
    comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Administrateur", "Secretaire"}));
    comboBox.setBounds(115, 139, 150, 20);
    getContentPane().add(comboBox);
    
    JLabel lblMotDePasse = new JLabel("Mot de passe : ");
    lblMotDePasse.setBounds(10, 186, 103, 14);
    getContentPane().add(lblMotDePasse);
    
    passwordField = new JPasswordField();
    passwordField.setBounds(115, 183, 150, 20);
    getContentPane().add(passwordField);
    
    JButton btnNewButton = new JButton("Ajouter le nouvel utilisateur");
    btnNewButton.setBounds(10, 234, 264, 30);
    getContentPane().add(btnNewButton);
    
    JLabel lblTlephone = new JLabel("Télephone : ");
    lblTlephone.setFont(new Font("Tahoma", Font.PLAIN, 13));
    lblTlephone.setBounds(10, 101, 86, 14);
    getContentPane().add(lblTlephone);
    
    textField_3 = new JTextField();
    textField_3.setColumns(10);
    textField_3.setBounds(115, 99, 150, 20);
    getContentPane().add(textField_3);
  }
  private static final long serialVersionUID = 1L;
  private JTextField textField;
  private JTextField textField_1;
  private JTextField textField_2;
  private JPasswordField passwordField;
  private JTextField textField_3;
}

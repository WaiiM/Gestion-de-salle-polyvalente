package vue;

import java.awt.*;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Window extends JFrame implements Observator {

  private static final long serialVersionUID = 1L;
  private JPanel mainPanel;
  private JTextField textFieldUser;
  private JLabel lblUser;
  private JLabel lblPassword;
  private JTextField textFieldPassword;

  /**
   * Constructeur de la fenêtre.
   */
  public Window(/*GestionFourmiliere gf*/) {
    /*this.gf = gf;
    gf.addObservator(this);*/
    this.setWinLook();
    this.setTitle("Gestion d'une salle polyvalente");
    this.setSize(1000, 600);
    this.setPreferredSize(new Dimension(1000, 600));
    this.setResizable(false);
    // this.getContentPane().setBackground(Color.WHITE);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.mainPanel = new JPanel();
    mainPanel.setBackground(Color.WHITE);
    mainPanel.setLayout(null);
    this.setContentPane(mainPanel);
    
    JLabel lblConnexion = new JLabel("Connexion");
    lblConnexion.setBounds(300, 159, 82, 20);
    mainPanel.add(lblConnexion);
    
    textFieldUser = new JTextField();
    textFieldUser.setBounds(310, 190, 86, 20);
    mainPanel.add(textFieldUser);
    textFieldUser.setColumns(10);
    
    lblUser = new JLabel("User");
    lblUser.setBounds(243, 193, 46, 14);
    mainPanel.add(lblUser);
    
    lblPassword = new JLabel("Password");
    lblPassword.setBounds(243, 233, 46, 14);
    mainPanel.add(lblPassword);
    
    textFieldPassword = new JTextField();
    textFieldPassword.setBounds(310, 221, 86, 20);
    mainPanel.add(textFieldPassword);
    textFieldPassword.setColumns(10);
    
    JButton btnConnexion = new JButton("Connexion");
    btnConnexion.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent arg0) {
    		System.out.println("Hello World");
    		System.out.println(textFieldPassword.getText());
    	}
    });
    btnConnexion.setBounds(293, 267, 89, 23);
    mainPanel.add(btnConnexion);
    this.setVisible(true);
  }


  private void setWinLook() {
    try {
      UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
        | UnsupportedLookAndFeelException e) {
      e.printStackTrace();
    }
  }
}

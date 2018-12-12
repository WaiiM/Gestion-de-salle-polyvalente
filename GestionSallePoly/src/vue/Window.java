package vue;

import java.awt.*;

import javax.swing.*;

import administration.Account;
import administration.TypeAccount;
import controller.Controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Window extends JFrame implements Observator {

  private static final long serialVersionUID = 1L;
  private JPanel mainPanel;
  private JPanel adminPanel;
  private JPanel secretairePanel;
  private JTextField textFieldUser;
  private JLabel lblUser;
  private JLabel lblPassword;
  private JTextField textFieldPassword;
  private Controller controller;
  
  String[] listContent = {"Connexion", "Secretaire","Admin"};

  /**
   * Constructeur de la fenêtre.
   */
  public Window(Controller controller) {
    this.controller = controller;
    /*gf.addObservator(this);*/
    this.setWinLook();
    this.setTitle("Gestion d'une salle polyvalente");
    this.setSize(1000, 600);
    this.setPreferredSize(new Dimension(1000, 600));
    this.setResizable(false);
    // this.getContentPane().setBackground(Color.WHITE);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.mainPanel = new JPanel();
    this.adminPanel = new AdminVue();
    this.secretairePanel = new SecretaireVue();
    mainPanel.setBackground(Color.WHITE);
    mainPanel.setLayout(null);
    CardLayout card = new CardLayout();
    this.getContentPane().setLayout(card);
    
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
    		String user = textFieldUser.getText();
    		String password = textFieldPassword.getText();
    		Account account = null;
    		if( (account = controller.getAdminController().connecter(new Account(0, user, password))) != null) {
    			System.out.println("Connexion OK");
    			if(TypeAccount.ADMIN.equals(account.getType())) {
    				System.out.println("Connexion ADMIN");
    				card.show(getContentPane(), listContent[2]);
    			}
    			else {
    				System.out.println("Connexion Secretaire");
    				card.show(getContentPane(), listContent[1]);
    			}
    		}
    		else {
    			System.out.println("Connexion KO");
    		}
    	}
    });
    btnConnexion.setBounds(293, 267, 89, 23);
    mainPanel.add(btnConnexion);
    this.getContentPane().add(mainPanel, listContent[0]);
    this.getContentPane().add(secretairePanel, listContent[1]);
    this.getContentPane().add(adminPanel, listContent[2]);
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

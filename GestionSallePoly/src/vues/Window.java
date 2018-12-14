package vues;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import administration.Account;
import administration.TypeAccount;
import controller.Controller;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
    
    JLabel lblConnexion = new JLabel("Authentification");
    lblConnexion.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 30));
    lblConnexion.setBounds(367, 97, 224, 59);
    mainPanel.add(lblConnexion);
    
    textFieldUser = new JTextField();
    textFieldUser.setFont(new Font("Tahoma", Font.PLAIN, 20));
    textFieldUser.setBounds(445, 207, 364, 43);
    mainPanel.add(textFieldUser);
    textFieldUser.setColumns(10);
    
    lblUser = new JLabel("Userame  : ");
    lblUser.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 40));
    lblUser.setBounds(146, 207, 273, 43);
    mainPanel.add(lblUser);
    
    lblPassword = new JLabel("Password : ");
    lblPassword.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 40));
    lblPassword.setBounds(146, 276, 273, 49);
    mainPanel.add(lblPassword);
    
    textFieldPassword = new JPasswordField();
    textFieldPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
    textFieldPassword.setBounds(445, 292, 364, 43);
    mainPanel.add(textFieldPassword);
    textFieldPassword.setColumns(10);
    
    JButton btnConnexion = new JButton("Connexion");
    btnConnexion.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        
      }
    });
    btnConnexion.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 40));
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
    btnConnexion.setBounds(367, 439, 289, 75);
    mainPanel.add(btnConnexion);
    this.getContentPane().add(mainPanel, listContent[0]);
    
    JLabel lblGestionnaireDeSalle = new JLabel("Gestionnaire de Salle Polyvatente");
    lblGestionnaireDeSalle.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 60));
    lblGestionnaireDeSalle.setBounds(29, 11, 930, 75);
    mainPanel.add(lblGestionnaireDeSalle);
    this.getContentPane().add(secretairePanel, listContent[1]);
    secretairePanel.setLayout(null);
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

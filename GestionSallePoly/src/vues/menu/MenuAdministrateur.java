package vues.menu;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import vues.menu.MenuSecretaire;;

public class MenuAdministrateur extends MenuSecretaire {
  private static final long serialVersionUID = 1L;

  public MenuAdministrateur() {
    this.setLayout(null);

    JButton btnNewButton_1 = new JButton("Gestion des Profils");
    btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
    btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
    btnNewButton_1.setBounds(0, 190, 200, 41);
    add(btnNewButton_1);
  }

}

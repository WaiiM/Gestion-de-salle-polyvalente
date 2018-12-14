package vues.reservation;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AjouterReservation extends JFrame{
  public AjouterReservation() {
    setTitle("Ajouter une nouvelle reservation de salle");
    setResizable(false);
    getContentPane().setLayout(null);
    setVisible(true);
    
    JLabel lblNewLabel = new JLabel("Salle Poyvalente à louer : ");
    lblNewLabel.setBounds(10, 14, 185, 14);
    getContentPane().add(lblNewLabel);
    
    JLabel lblListeDesPieces = new JLabel("Liste des Pieces à louer : ");
    lblListeDesPieces.setBounds(11, 85, 145, 14);
    getContentPane().add(lblListeDesPieces);
    
    JLabel lblPieceCommunes = new JLabel("Piece Communes : ");
    lblPieceCommunes.setBounds(35, 118, 94, 14);
    getContentPane().add(lblPieceCommunes);
    
    JLabel lblPieceEquipe = new JLabel("Piece equipée : ");
    lblPieceEquipe.setBounds(35, 143, 94, 14);
    getContentPane().add(lblPieceEquipe);
    
    JComboBox<String> comboBox = new JComboBox<>();
    comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Piece Commune 1", "Piece Commune 2", "Piece Commune 3", "Piece Commune 4", "Piece Commune 5", "Piece Commune 6", "Piece Commune 7", "Piece Commune 8", "Piece Commune 9", "Piece Commune 10", "Piece Commune 11", "Piece Commune 12"}));
    comboBox.setBounds(139, 115, 132, 20);
    getContentPane().add(comboBox);
    
    JComboBox<String> comboBox_1 = new JComboBox<>();
    comboBox_1.setModel(new DefaultComboBoxModel<>(new String[] {"Piece Equipée 1", "Piece Equipée 2", "Piece Equipée 3", "Piece Equipée 4", "Piece Equipée 5", "Piece Equipée 6", "Piece Equipée 7", "Piece Equipée 8", "Piece Equipée 9"}));
    comboBox_1.setBounds(139, 140, 132, 20);
    getContentPane().add(comboBox_1);
    
    JLabel lblTypeDeLocation = new JLabel("Type de Location : ");
    lblTypeDeLocation.setBounds(10, 39, 132, 14);
    getContentPane().add(lblTypeDeLocation);
    
    JComboBox<String> comboBox_2 = new JComboBox<>();
    comboBox_2.setModel(new DefaultComboBoxModel<>(new String[] {"Salle Polyvalente 1", "Salle Polyvalente 2", "Salle Polyvalente 3", "Salle Polyvalente 4"}));
    comboBox_2.setBounds(139, 11, 132, 20);
    getContentPane().add(comboBox_2);
    
    JComboBox<String> comboBox_3 = new JComboBox<>();
    comboBox_3.setModel(new DefaultComboBoxModel<>(new String[] {"Complete", "Partielle"}));
    comboBox_3.setBounds(139, 39, 70, 20);
    getContentPane().add(comboBox_3);
    
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(24, 232, 125, 87);
    getContentPane().add(scrollPane);
    
    JList<String> list = new JList<>();
    list.setModel(new AbstractListModel() {
      String[] values = new String[] {};
      public int getSize() {
        return values.length;
      }
      public Object getElementAt(int index) {
        return values[index];
      }
    });
    scrollPane.setViewportView(list);
    
    JLabel lblEquipements = new JLabel("Equipements : ");
    lblEquipements.setBounds(35, 168, 79, 14);
    getContentPane().add(lblEquipements);
    
    JComboBox<String> comboBox_4 = new JComboBox<>();
    comboBox_4.setModel(new DefaultComboBoxModel<>(new String[] {"Equipement 1", "Equipement 2", "Equipement 3", "Equipement 4", "Equipement 5", "Equipement 6", "Equipement 7", "Equipement 8", "Equipement 9", "Equipement 10", "Equipement 11", "Equipement 12"}));
    comboBox_4.setBounds(139, 165, 132, 20);
    getContentPane().add(comboBox_4);
    
    JLabel lblPiecesCommunes = new JLabel("Pieces Communes à louer : ");
    lblPiecesCommunes.setBounds(24, 207, 132, 14);
    getContentPane().add(lblPiecesCommunes);
    
    JLabel lblPiecesEquipes = new JLabel("Pieces equipées à louer : ");
    lblPiecesEquipes.setBounds(174, 207, 132, 14);
    getContentPane().add(lblPiecesEquipes);
    
    JScrollPane scrollPane_1 = new JScrollPane();
    scrollPane_1.setBounds(174, 232, 123, 85);
    getContentPane().add(scrollPane_1);
    
    JList<String> list_1 = new JList<>();
    list_1.setModel(new AbstractListModel() {
      String[] values = new String[] {};
      public int getSize() {
        return values.length;
      }
      public Object getElementAt(int index) {
        return values[index];
      }
    });
    scrollPane_1.setViewportView(list_1);
    
    JLabel lblEquipementsLouer = new JLabel("Equipements à louer : ");
    lblEquipementsLouer.setBounds(316, 207, 123, 14);
    getContentPane().add(lblEquipementsLouer);
    
    JScrollPane scrollPane_2 = new JScrollPane();
    scrollPane_2.setBounds(316, 232, 104, 85);
    getContentPane().add(scrollPane_2);
    
    JList<String> list_2 = new JList<>();
    list_2.setModel(new AbstractListModel() {
      String[] values = new String[] {};
      public int getSize() {
        return values.length;
      }
      public Object getElementAt(int index) {
        return values[index];
      }
    });
    scrollPane_2.setViewportView(list_2);
    
    JButton btnAjouterLaReservation = new JButton("Préreserver la salle");
    btnAjouterLaReservation.setBounds(21, 349, 132, 23);
    getContentPane().add(btnAjouterLaReservation);
    
    JButton btnMettreEnAttente = new JButton("Mettre en attente");
    btnMettreEnAttente.setBounds(174, 349, 123, 23);
    getContentPane().add(btnMettreEnAttente);
    
    JButton btnReserverLaSalle = new JButton("Reserver la salle");
    btnReserverLaSalle.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
      }
    });
    btnReserverLaSalle.setBounds(316, 349, 120, 23);
    getContentPane().add(btnReserverLaSalle);
  }
  private static final long serialVersionUID = 1L;
}

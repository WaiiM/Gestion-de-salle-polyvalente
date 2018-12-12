package vue;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SecretaireVue extends JPanel{
	
	public SecretaireVue() {
		this.setLayout(null);
		
		JLabel lblListeDesRservations = new JLabel("Liste des réservations:");
		lblListeDesRservations.setBounds(10, 11, 120, 14);
		add(lblListeDesRservations);
		
		JButton btnNouveauRservation = new JButton("Nouveau réservation");
		btnNouveauRservation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnNouveauRservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNouveauRservation.setBounds(10, 266, 148, 23);
		add(btnNouveauRservation);
	}
}

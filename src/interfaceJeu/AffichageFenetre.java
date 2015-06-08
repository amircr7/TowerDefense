package interfaceJeu;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;



public class AffichageFenetre extends JFrame{

	
	private static final long serialVersionUID = 1L;
	private final AffichagePanneau affichagePanneau;

	

	public AffichageFenetre(final int largeur, final int hauteur, final AffichageCases affichageCases[][]) {
		this.setTitle("TowerDefense");
		this.setSize(15000, 1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.affichagePanneau = new AffichagePanneau(largeur, hauteur, affichageCases);
		this.setContentPane(this.affichagePanneau);
		this.setLayout(new BorderLayout());
		this.getContentPane().add(new JButton("Tour 1"), BorderLayout.SOUTH);
		this.getContentPane().add(new JButton("Tour 2"), BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	
	public void placerPiece(final AffichagePieces piece) {
		this.affichagePanneau.placerPiece(piece);
	}

	public void rafraichir() {
		this.affichagePanneau.repaint();
	}
}

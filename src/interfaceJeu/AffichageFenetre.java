package interfaceJeu;

import javax.swing.JFrame;




public class AffichageFenetre extends JFrame{

	
	private static final long serialVersionUID = 1L;
	private final AffichagePanneau affichagePanneau;

	public AffichageFenetre(final int largeur, final int hauteur, final AffichageCases affichageCases[][]) {
		this.setTitle("Plateau de jeu");
		this.setSize(700, 700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.affichagePanneau = new AffichagePanneau(largeur, hauteur, affichageCases);
		this.setContentPane(this.affichagePanneau);
		this.setVisible(true);
	}
	
	
	public void placerPiece(final AffichagePieces piece) {
		this.affichagePanneau.placerPiece(piece);
	}

	public void rafraichir() {
		this.affichagePanneau.repaint();
	}
}

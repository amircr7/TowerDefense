package interfaceJeu;


import javax.swing.JFrame;


public class AffichageFenetre extends JFrame{

	
	private static final long serialVersionUID = 1L;
	private final AffichagePanneau affichagePanneau;

	

	public AffichageFenetre(final int largeur, final int hauteur, final AffichageCases affichageCases[][]) {
		this.setTitle("TowerDefense");
		this.setSize(1500, 1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
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

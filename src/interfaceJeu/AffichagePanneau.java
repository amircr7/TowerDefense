package interfaceJeu;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class AffichagePanneau extends JPanel {

	
	
	private static final long serialVersionUID = 1L;
	private final AffichageCases affichageCases[][];
	private final ArrayList<AffichagePieces> pieces;
	private final int largeur;
	private final int hauteur;

	public AffichagePanneau(final int largeur, final int hauteur, final AffichageCases plateauCases[][]) {
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.affichageCases = plateauCases;
		this.pieces = new ArrayList<>();
	}

	@Override
	public void paintComponent(final Graphics g) {
		final int tailleLargeur = this.getWidth() / this.largeur;
		final int tailleHauteur = this.getHeight() / this.hauteur;

		for (int i = 0; i < this.largeur; i++) {
			for (int j = 0; j < this.hauteur; j++) {
				g.drawImage(this.affichageCases[i][j].getImage(), tailleLargeur * i, tailleHauteur
						* j, tailleLargeur, tailleHauteur, this);
			}
		}

		for (final AffichagePieces piece : this.pieces) {
			g.drawImage(piece.getImage(), tailleLargeur * piece.getPositionHorizontale(),
					tailleHauteur * piece.getPositionVerticale(), tailleLargeur, tailleHauteur,
					this);
		}
	}

	public void placerPiece(final AffichagePieces piece) {
		this.pieces.add(piece);
	}
}

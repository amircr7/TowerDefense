package interfaceJeu;


import carte.Case;
import interfaceJeu.AffichageFenetre;

public class Affichage {

	private AffichageFenetre affichageFenetre;

	public Affichage(final int largeur, final int hauteur, final AffichageCases affichageCases[][], Case tabCase[][]) {
		this.affichageFenetre = new AffichageFenetre(largeur, hauteur, affichageCases, tabCase);
	}
	
	
	
}

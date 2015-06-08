package interfaceJeu;


import interfaceJeu.AffichageFenetre;

public class Affichage {

	private AffichageFenetre affichageFenetre;

	public Affichage(final int largeur, final int hauteur, final AffichageCases affichageCases[][]) {
		this.affichageFenetre = new AffichageFenetre(largeur, hauteur, affichageCases);
	}
	
	
	
}

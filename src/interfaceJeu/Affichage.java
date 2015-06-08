package interfaceJeu;



public class Affichage {

	public Affichage(final int largeur, final int hauteur, final AffichageCases affichageCases[][]) {
		this.affichageFenetre = new AffichageFenetre(largeur, hauteur, AffichageCases);
	}
}

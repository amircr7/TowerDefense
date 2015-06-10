package jeu;

import interfaceJeu.AffichageFenetre;
import carte.Case;
import interfaceJeu.Affichage;
import jeu.FenetreParametres;

public class TowerDefense {
	

	public static void main(String[] args) {
		
		//AffichageFenetre fen = new AffichageFenetre(0, 0, null);
		
		Partie partie = new Partie();
		FenetreParametres fenetreParametres = new FenetreParametres(partie); //Lance fenetre de choix de la carte
		
		
	}

}

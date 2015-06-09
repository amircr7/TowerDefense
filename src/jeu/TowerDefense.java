package jeu;

import interfaceJeu.AffichageFenetre;
import carte.Case;
import interfaceJeu.Affichage;
import jeu.FenetreParametres;

public class TowerDefense {
	

	public static void main(String[] args) {
		
		//AffichageFenetre fen = new AffichageFenetre(0, 0, null);
		FenetreParametres fenetreParametres = new FenetreParametres(); //Lance fenetre de choix de la carte
		String carte = Case.recuperationStringCarte(choixCarte.getSelectedItem()); //Récupère la carte choisie dans la BDD
		Case.StringToTab(carte); //Convertie la carte choisie en tableau 2D
		
	}

}

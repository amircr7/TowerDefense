package jeu;

import java.io.IOException;
import interfaceJeu.AffichageFenetre;
import carte.Case;
import interfaceJeu.Affichage;
import jeu.FenetreParametres;

import interfaceJeu.AffichageFenetre;
import interfaceJeu.Affichage;
import carte.*;
public class TowerDefense {


	public static void main(String[] args) {

		Case cases = new Case();
		String carte = cases.recuperationStringCarte(2);
		cases.stringToTab(carte);
		try {
			AffichageFenetre fen = new AffichageFenetre(0, 0, null, cases.construireCase() );
		} catch (IOException e) {
	
			//e.printStackTrace();
	}
		
		
		//AffichageFenetre fen = new AffichageFenetre(0, 0, null);
		//FenetreParametres fenetreParametres = new FenetreParametres(); //Lance fenetre de choix de la carte
		//String carte = Case.recuperationStringCarte(choixCarte.getSelectedItem()); //Récupère la carte choisie dans la BDD
		//Case.StringToTab(carte); //Convertie la carte choisie en tableau 2D
		
	}

}
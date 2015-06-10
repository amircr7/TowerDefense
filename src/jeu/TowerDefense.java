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
		
		//AffichageFenetre fen = new AffichageFenetre(0, 0, null);
		Partie partie = new Partie();
		FenetreParametres fenetreParametres = new FenetreParametres(partie); //Lance fenetre de choix de la carte
		/*try {
			AffichageFenetre fen = new AffichageFenetre(0, 0, null, cases.construireCase() );
		} catch (IOException e) {
	
			//e.printStackTrace();
	}*/
		
		
	}

}
package jeu;

import interfaceJeu.AffichageFenetre;
import carte.Case;

public class TowerDefense {
	

	public static void main(String[] args) {
		
		//AffichageFenetre fen = new AffichageFenetre(0, 0, null);
		
		String carte =Case.recuperationStringCarte(1);
		Case.StringToTab(carte);
		
	}

}

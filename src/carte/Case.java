package carte;


import java.awt.Image;



import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.*;

public class Case {
	
	protected Image image;
	protected int statut;
	
	
	public static String recuperationStringCarte (int idCarte) {
		String url = "jdbc:mysql://localhost:3306/towerdefense";
		String utilisateur = "root";
		String motDePasse = "";
		String carte = "";
		Connection connexion = null;
		try {
		    connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
    	    Statement statement = connexion.createStatement();
    	    ResultSet resultat = statement.executeQuery( "SELECT carte FROM carte WHERE idCarte = "+idCarte+";" );
    	    resultat.next() ;
    	    carte = resultat.getString("carte");
    	    
		} catch ( SQLException e ) {
		} finally {
    	    if ( connexion != null )
    	        try {
    	            connexion.close();
    	        } catch ( SQLException ignore ) {
    	        }
    	}	
		//System.out.println(carte); // pour tester
		return carte;
	}
	
	public static void StringToTab (String carte) {
		int largeur = 20;
		int hauteur = 20;
		char tabCarte[][] = new char[hauteur][largeur];
		char tabCarte1d_temp[] = new char[largeur];
		String temp;
		int beginIndex = 0;
		int endIndex = largeur;
		for (int i=0; i<hauteur; ++i) {
			temp = carte.substring(beginIndex, endIndex);
			tabCarte1d_temp = temp.toCharArray();
			tabCarte[i] = tabCarte1d_temp;
			// pareil en plus court: tabCarte[i] = carte.substring(beginIndex, endIndex).toCharArray();
			beginIndex = beginIndex + largeur + 1; // +1 parce que ya virgule qu'on ne veut pas recuperer
			endIndex = endIndex + largeur + 1;
			//System.out.println(tabCarte[i]); // pour tester
		}
	}
	public Case(Image image){
		this.image = image;
	
	
	}
		
		
		
		
	private Case[][] construireCase(char tabCarte[][], Case tabCase[][]) {
		for(int x = 0; x < 20; x++){
			for(int y = 0; y < 20; y++){
				switch (tabCarte[x][y]){

				case 0 : 
					tabCase[x][y] = new EmplacementTour(image);
				case 1 :
					tabCase[x][y] = new Chemin(image);
				case 2 :
					tabCase[x][y] = new AssaillantSpawn(image);
				case 3 :
					tabCase[x][y] = new EmplacementPosteTravail(image);
				case 4 :
					tabCase[x][y] = new Decors(image);
				}
			}
		}
		return tabCase;

	}
}
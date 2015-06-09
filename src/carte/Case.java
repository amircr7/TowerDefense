package carte;
import java.awt.Image;



import java.awt.image.BufferedImage;
import java.sql.*;

public class Case {
	
	protected Image image;
	protected Boolean vide;
	
	public Case(){
		image = null;
		vide = null;
	}
	
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
	public Case(Image image, int statut){
		switch(statut){
		
		case 0 : 
		EmplacementTour();
		break;
		case 1 :
		Chemin();
		break;
		case 2 :
		AssaillantSpawn();
		break;
		case 3 :
		EmplacementPosteTravail();
		break;
		case 4 :
		Decors();
		break;
		}
	}

}
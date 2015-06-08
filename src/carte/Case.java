package carte;

import java.sql.*;

public class Case {
	
	public char tableauCarte[][] = new char[20][20];
	
	public static String recuperationStringCarte (int idCarte) {
		String url = "jdbc:mysql://localhost:3306/towerdefense";
		String utilisateur = "root";
		String motDePasse = "";
		String carte = "";
		Connection connexion = null;
		try {
		    connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
    	    Statement statement = connexion.createStatement();
    	    ResultSet resultat = statement.executeQuery( "SELECT carte FROM carteinit WHERE idCarte = "+idCarte+";" );
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
		System.out.println(carte);
		return carte;
	}
	
	public static void StringToTab (String carte) {
		char tabCarte[][] = new char[20][20];
		for (int i=0; i<20; i++) {
			for (int j=0; j<20; j++) {
				for (int a=0; a<carte.length(); a++) {
					tabCarte[i][j] = carte.charAt(a);
				}
			}
		}
	System.out.println(tabCarte);
	}
	
}

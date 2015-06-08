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
		// System.out.println(carte); pour tester
		return carte;
	}
	
	public static void StringToTab (String carte) {
		char tabCarte2d[][] = new char[20][20];
		char tabCarte1d_temp[] = new char[20];
		String temp;
		int beginIndex = 0;
		int endIndex = 20;
		for (int i=0; i<20; ++i) {
			temp = carte.substring(beginIndex, endIndex);
			tabCarte1d_temp = temp.toCharArray();
			tabCarte2d[i] = tabCarte1d_temp;
			// pareil en plus court: tabCarte2d[i] = carte.substring(beginIndex, endIndex).toCharArray();
			beginIndex = beginIndex+21; // 21 parce que ya virgule qu'on veut pas recuperer gros naze
			endIndex = endIndex+21;
			//System.out.println(tabCarte[i]); pour tester
		}
	}
	
}
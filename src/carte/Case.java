package carte;

import java.sql.*;

public class Case {
	
	public char tableauCarte[][] = new char[20][20];
	public String recuperationStringCarte (int idCarte) {
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
    	    // System.out.println(carte);
    	    
		} catch ( SQLException e ) {
		} finally {
    	    if ( connexion != null )
    	        try {
    	            connexion.close();
    	        } catch ( SQLException ignore ) {
    	        }
    	}		
		return carte;
	}
	
	
	
	public String StringToTab(String carte){
		
		for(char i = 0; i != ','; i++){
			i = tableauCarte[20][20];
		}
		return tableauCarte[20][20];

	}
	
}

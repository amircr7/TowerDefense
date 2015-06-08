package carte;

import java.sql.*;

public class Case {
		
	public String recuperationStringCarte (int idCarte) {
		String url = "jdbc:mysql://localhost:3306/towerdefense";
		String utilisateur = "root";
		String motDePasse = "";
		String carte = "";
		Connection connexion = null;
		try {
		    connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
		   
		    /* Cr�ation de l'objet g�rant les requ�tes */
    	    Statement statement = connexion.createStatement();
    	    /* Ex�cution d'une requ�te de lecture */
    	    ResultSet resultat = statement.executeQuery( "SELECT carte FROM carteinit WHERE idCarte = "+idCarte+";" );
    	    resultat.next() ;
    	    carte = resultat.getString("carte");
    	    // System.out.println(carte);
    	    
		} catch ( SQLException e ) {
	    /* G�rer les �ventuelles erreurs ici */
		} finally {
    	    if ( connexion != null )
    	        try {
    	            /* Fermeture de la connexion */
    	            connexion.close();
    	        } catch ( SQLException ignore ) {
    	            /* Si une erreur survient lors de la fermeture, il suffit de l'ignorer. */
    	        }
    	}		
		return carte;
	}
	
}

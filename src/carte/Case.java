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

/*File file = new File("maps/Map1.txt");
        Scanner inputFile = new Scanner(file);
        this.cases = new Case[20][20];


        int a = 0;
        while(inputFile.hasNext()){
            //read line and convert to char[]; store it.
            array[a] = inputFile.nextLine().toCharArray();

            //if there are more lines, increment the size of the array.
            if (inputFile.hasNext()){
                //create a clone array of the same length.
                char[][] clone = new char[array.length][];
                //copy elements from the array to the clone. Note that this can be
                //done by index with a for loop
                System.arraycopy(array, 0, clone, 0, array.length);
                //make array a new array with an extra char[]
                array = new char[array.length + 1][];
                //copy elements back.
                System.arraycopy(clone, 0, array, 0, clone.length);
                a++;
            }
        }*/

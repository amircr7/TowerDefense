package carte;


import java.awt.Image;



import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.*;

public class Case {

	public Image image;
	Case tabCase[][];
	char tabCarte[][];
	
	public Case(){

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

	public void stringToTab (String carte) {
		int largeur = 20;
		int hauteur = 20;
		tabCarte = new char[hauteur][largeur];
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




	public Case[][] construireCase() throws IOException{
		tabCase=new Case[20][20];
		for(int x = 0; x < 20; x++){
			for(int y = 0; y < 20; y++){
				switch (tabCarte[x][y]){

				case '0' : 
					tabCase[x][y] = new EmplacementTour();
					break;
				case '1' :
					tabCase[x][y] = new Chemin();
					break;
				case '2' :
					tabCase[x][y] = new AssaillantSpawn();
					break;
				case '3' :
					tabCase[x][y] = new EmplacementPosteTravail();
					break;
				case '4' :
					tabCase[x][y] = new Decors();
					break;
				}
			}
		}
		return tabCase;

	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

}
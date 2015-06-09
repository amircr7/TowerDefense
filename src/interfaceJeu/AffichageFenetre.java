package interfaceJeu;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class AffichageFenetre extends JFrame{

	
	private static final long serialVersionUID = 1L;
	private final AffichagePanneau affichagePanneau;

	

	public AffichageFenetre(final int largeur, final int hauteur, final AffichageCases affichageCases[][]) {
		this.setTitle("TowerDefense");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.affichagePanneau = new AffichagePanneau(largeur, hauteur, affichageCases);
		
		JPanel contentGrille = new JPanel();
		this.setContentPane(contentGrille);
		this.setLayout(new BorderLayout());
		contentGrille.setLayout(new GridLayout(20, 20));
		creationGrille(contentGrille);
		this.setVisible(true);
	}
	
	public static void creationGrille(JPanel contentGrille){
        JPanel cell[][]= new JPanel[20][20];
        for(int i=0; i<cell.length; i++){
            for(int j=0; j<cell.length; j++){
                cell[i][j]= new JPanel();
                cell[i][j].setSize(new Dimension(20, 20));
                if ((i + j) % 2 == 0) {
                    cell[i][j].setBackground(Color.gray);
                } else {
                    cell[i][j].setBackground(Color.white);
                }
                contentGrille.add(cell[i][j]);
            }
        }
	}
}
	
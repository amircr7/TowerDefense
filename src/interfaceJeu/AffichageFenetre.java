package interfaceJeu;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import carte.Case;


public class AffichageFenetre extends JFrame{

	
	private static final long serialVersionUID = 1L;
	private final AffichagePanneau affichagePanneau;

	

	public AffichageFenetre(final int largeur, final int hauteur, final AffichageCases affichageCases[][], Case tabCase[][]) {
		this.setTitle("TowerDefense");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.affichagePanneau = new AffichagePanneau(largeur, hauteur, affichageCases);
		
		JLabel contentGrille = new JLabel();
		this.setContentPane(contentGrille);
		this.setLayout(new BorderLayout());
		contentGrille.setLayout(new GridLayout(20, 20));
		creationGrille(contentGrille, tabCase);
		this.setVisible(true);
	}
	
	public static void creationGrille(JLabel contentGrille, Case tabCase[][]){
        JPanel cell[][]= new JpanelImage[20][20];
        for(int i=0; i<cell.length; i++){
            for(int j=0; j<cell.length; j++){
                cell[i][j]= new JpanelImage(tabCase[i][j].getImage());
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
		
	
	

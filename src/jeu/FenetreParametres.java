package jeu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import carte.Case;

public class FenetreParametres extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2298298089373714925L;

	public FenetreParametres(){
	    
		// Création des parametres de la fenetre	
		this.setTitle("Paramètres");
	    this.setSize(300, 140); //largeur , hauteur
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setResizable(false);
	    this.setLayout(new BorderLayout());
	    
	    
	  //Création zone texte pour nom
	    JPanel panNorth = new JPanel();
	    JLabel labelNom = new JLabel("Entrez votre nom ---> ");
	    JTextField nomUtilisateur = new JTextField("Michel Sapin");
	    nomUtilisateur.setPreferredSize(new Dimension(100, 20));
	    panNorth.add(labelNom);
	    panNorth.add(nomUtilisateur);
	    this.getContentPane().add(panNorth, BorderLayout.NORTH);
	    
	    
	    //Création choix carte
	    JPanel panCenter = new JPanel();
	    JLabel labelCarte = new JLabel("Choisissez votre carte ---> ");
	    JComboBox<Integer> choixCarte = new JComboBox<Integer>();
	    choixCarte.setPreferredSize(new Dimension(100, 20));
	    choixCarte.addItem(1);
	    choixCarte.addItem(2);
	    choixCarte.addItem(3);
	    panCenter.add(labelCarte);
	    panCenter.add(choixCarte);
	    this.getContentPane().add(panCenter, BorderLayout.CENTER);
	    
	    
	    // Création boutons valider et annnuler en bas de la fenetre
	    JPanel panSouth = new JPanel();
	    JButton valider = new JButton ("Valider");
		JButton annuler = new JButton ("Annuler");
	    panSouth.add(valider);
	    panSouth.add(annuler);
	    this.getContentPane().add(panSouth, BorderLayout.SOUTH);
	    valider.addActionListener(new ActionListener()
	    {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//String nomJoueur = nomUtilisateur.getText(); enregistrer le nom du joueur dans un String
				//String carte =Case.recuperationStringCarte(choixCarte.getSelectedItem());
				//Case.StringToTab(carte);
			}
	    });
	    annuler.addActionListener(new ActionListener()
	    {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
	    });
	    
	    
	    // rendre la fenetre visible
	    this.setVisible(true);
	}
}

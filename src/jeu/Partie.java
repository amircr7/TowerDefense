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

public class Partie {
	public void fenetreParametres () {
		
		// Création des parametres de la fenetre	
		JFrame fenetreParametres = new JFrame();
		fenetreParametres.setTitle("Paramètres");
		fenetreParametres.setSize(300, 150); //largeur , hauteur
		fenetreParametres.setLocationRelativeTo(null);
		fenetreParametres.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetreParametres.setResizable(false);
		fenetreParametres.setLayout(new BorderLayout());
			    
			    
		//Création choix carte
		JPanel panCenter = new JPanel();
		JLabel labelCarte = new JLabel("Choisissez votre carte ---> ");
		JComboBox<String> choixCarte = new JComboBox<String>();
		choixCarte.setPreferredSize(new Dimension(100, 20));
		choixCarte.addItem("Carte 1");
		choixCarte.addItem("Carte 2");
		choixCarte.addItem("Carte 3");
		panCenter.add(labelCarte);
		panCenter.add(choixCarte);
		fenetreParametres.getContentPane().add(panCenter, BorderLayout.CENTER);
		    
			    
		//Création zone texte pour nom
		JPanel panNorth = new JPanel();
		JLabel labelNom = new JLabel("Entrez votre nom ---> ");
		JTextField nomUtilisateur = new JTextField("");
		nomUtilisateur.setPreferredSize(new Dimension(100, 20));
		panNorth.add(labelNom);
		panNorth.add(nomUtilisateur);
		fenetreParametres.getContentPane().add(panNorth, BorderLayout.NORTH);
		  
			    
		// Création boutons valider et annnuler en bas de la fenetre
		JPanel panSouth = new JPanel();
		JButton valider = new JButton ("Valider");
		JButton annuler = new JButton ("Annuler");
		panSouth.add(valider);
		panSouth.add(annuler);
		fenetreParametres.getContentPane().add(panSouth, BorderLayout.SOUTH);
		valider.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent arg0) {
			// balance les parametre et ouvre la game
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
		fenetreParametres.setVisible(true);
	}
}

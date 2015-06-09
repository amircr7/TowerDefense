package jeu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel; 

public interface InterfaceUtilisateur {
	
	public void fenetreParametres () {
		// Création des parametres de la fenetre	
		this.setTitle("Paramètres");
		this.setSize(300, 150); //largeur , hauteur
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(new BorderLayout());
			    
			    
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
		this.getContentPane().add(panCenter, BorderLayout.CENTER);
		    
			    
		//Création zone texte pour nom
		JPanel panNorth = new JPanel();
		JLabel labelNom = new JLabel("Entrez votre nom ---> ");
		JTextField nomUtilisateur = new JTextField("");
		nomUtilisateur.setPreferredSize(new Dimension(100, 20));
		panNorth.add(labelNom);
		panNorth.add(nomUtilisateur);
		this.getContentPane().add(panNorth, BorderLayout.NORTH);
		  
			    
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
			// balance les parametre et ouvre la game
			}
		});
		annuler.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) {
			System.exit(EXIT_ON_CLOSE);
			}
		});
			    
			    
		// rendre la fenetre visible
		this.setVisible(true);
	}
}

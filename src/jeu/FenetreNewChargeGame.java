package jeu;

import interfaceJeu.AffichageFenetre;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import carte.Case;


public class FenetreNewChargeGame extends JFrame{
	
	private static final long serialVersionUID = -996645829700638527L;

	public FenetreNewChargeGame() {
		
		//Création des paramètres de la fenêtre
		this.setTitle("Paramètres");
	    this.setSize(250, 110); //largeur , hauteur
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setResizable(false);
	    this.setLayout(new BorderLayout());
		
	    //Création bouton nouvelle partie
		JPanel pan1 = new JPanel();
		JButton newGame = new JButton ("Nouvelle Partie");
		pan1.add(newGame);
		this.getContentPane().add(pan1, BorderLayout.NORTH);
		
		//Création bouton charger partie
		JPanel pan2 = new JPanel();
		JButton chargeGame = new JButton ("Charger Partie");
		pan2.add(chargeGame);
		this.getContentPane().add(pan2, BorderLayout.SOUTH);
		
		newGame.addActionListener(new ActionListener()
	    {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Partie partie = new Partie();
				setVisible(false);
				FenetreParametres fenetre = new FenetreParametres(partie);
			}});
		
		chargeGame.addActionListener(new ActionListener()
	    {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//charger partie
				//setVisible(false);
				//derniere action charger partie
			}});
		this.setVisible(true);
	}
}

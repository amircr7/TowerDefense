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
import javax.swing.JRadioButton;

import carte.Case;

public class FenetreParametres extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2298298089373714925L;

	public FenetreParametres(Partie partie){
		
		// Création des parametres de la fenetre	
		this.setTitle("Paramètres");
	    this.setSize(300, 200); //largeur , hauteur
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setResizable(false);
	    this.setLayout(new BorderLayout());
	    
	    
	    //Création choix nouvelle partie ou charger partie
	    JPanel panNorth = new JPanel();
	    JRadioButton radioNew = new JRadioButton("Nouvelle Partie");
	    JRadioButton radioCharge = new JRadioButton("Charger Partie");
	    panNorth.add(radioNew);
	    panNorth.add(radioCharge);
	    this.getContentPane().add(panNorth, BorderLayout.NORTH);
	    
	    
	    //Création Panel nom + choix carte
	    JPanel panCenter = new JPanel();
	    this.getContentPane().add(panCenter, BorderLayout.CENTER);
	    
	    
	    //Création zone texte pour nom
	    JPanel panNom = new JPanel();
	    JLabel labelNom = new JLabel("Entrez votre nom ---> ");
	    JTextField nomUtilisateur = new JTextField("Michel Sapin");
	    nomUtilisateur.setPreferredSize(new Dimension(120, 20));
	    panNom.add(labelNom);
	    panNom.add(nomUtilisateur);
	    panCenter.add(panNom, BorderLayout.NORTH);
	    
	    
	    //Création choix carte
	    JPanel panCarte = new JPanel();
	    JLabel labelCarte = new JLabel("Choisissez votre carte ---> ");
	    JComboBox<Integer> choixCarte = new JComboBox<Integer>();
	    choixCarte.setPreferredSize(new Dimension(100, 20));
	    choixCarte.addItem(1);
	    choixCarte.addItem(2);
	    choixCarte.addItem(3);
	    panCarte.add(labelCarte);
	    panCarte.add(choixCarte);
	    panCenter.add(panCarte, BorderLayout.CENTER);
	    
	    
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
				partie.setNomJoueur(nomUtilisateur.getText()); //enregistrer le nom du joueur dans un String
				//System.out.println(choixCarte.getSelectedItem());
				partie.choixCarte = (int) choixCarte.getSelectedItem();
				//System.out.println(partie.choixCarte);
				String carte = Case.recuperationStringCarte(partie.choixCarte); //Récupère la carte choisie dans la BDD
				Case cases = new Case();
				cases.stringToTab(carte); //Convertie la carte choisie en tableau 2D
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

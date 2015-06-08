package carte;

import interfaceJeu.AffichageCases;

import java.awt.Image;

public class AssaillantSpawn implements AffichageCases{

	protected Image image;
	protected Boolean vide;

	public AssaillantSpawn(final Image image, final Boolean vide) {
		this.image = image;
		this.vide = vide;
	}

	public Boolean estVide() {
		return this.vide;
	}

	

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return this.image;
	}
}

package pieces;

import java.io.File;

import javax.imageio.ImageIO;

public class Error404 extends Assaillant{

public Error404(Case case) throws IOexception{
	this.enemyName = "Error404";
	this.enemyHealth = 500;
	this.enemyDamage = 100;
	this.damageSpeed = 0.8;
	this.enemySpeed = 1;
	this.enemyRange = 4;
	this.enemyResistance = 50;
	this.slowResistance = 0.8;
	this.freezeResistance = 0.9;
	this.dropRessources = 500;
	
	super(case, ImageIO.read(new File("Images/error404.png")), "Error404");
}
}

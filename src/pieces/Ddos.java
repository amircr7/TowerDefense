package pieces;

import java.io.File;

import javax.imageio.ImageIO;

public class Ddos extends Assaillant{

public Ddos(Case case) throws IOexception{
	this.enemyName = "Ddos";
	this.enemyHealth = 150;
	this.enemyDamage = 25;
	this.damageSpeed = 1;
	this.enemySpeed = 1;
	this.enemyRange = 2;
	this.enemyResistance = 2;
	this.slowResistance = 0;
	this.freezeResistance = 0;
	this.dropRessources = 150;
	
	super(case, ImageIO.read(new File("Images/ddos.png")), "Ddos");
}
}

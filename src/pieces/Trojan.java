package pieces;

import java.io.File;

import javax.imageio.ImageIO;

public class Trojan extends Assaillant{

public Trojan(Case case) throws IOexception{
	this.enemyName = "Trojan";
	this.enemyHealth = 100;
	this.enemyDamage = 20;
	this.damageSpeed = 0.2;
	this.enemySpeed = 0.5;
	this.enemyRange = 5;
	this.enemyResistance = 0;
	this.slowResistance = 0;
	this.freezeResistance = 0;
	this.dropRessources = 100;
	
	super(case, ImageIO.read(new File("Images/trojan.png")), "Trojan");
}
}

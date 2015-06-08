package pieces;

import java.io.File;

import javax.imageio.ImageIO;

public class Hack extends Assaillant{
	
public Hack(Case case) throws IOexception{
	this.enemyName = "Hack";
	this.enemyHealth = 200;
	this.enemyDamage = 50;
	this.damageSpeed = 0.5;
	this.enemySpeed = 0.5;
	this.enemyRange = 2;
	this.enemyResistance = 3;
	this.slowResistance = 0.2;
	this.freezeResistance = 0;
	this.dropRessources = 200;
	
	super(case, ImageIO.read(new File("Images/hack.png")), "Hack");
}

}

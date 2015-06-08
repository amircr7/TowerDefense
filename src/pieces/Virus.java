package pieces;

public class Virus extends Assaillant{

public Virus(){
	this.enemyName = "Virus";
	this.enemyHealth = 250;
	this.enemyDamage = 75;
	this.damageSpeed = 0.6;
	this.enemySpeed = 0.6;
	this.enemyRange = 3;
	this.enemyResistance = 4;
	this.slowResistance = 0.3;
	this.freezeResistance = 0.3;
	this.dropRessources = 250;
}
}

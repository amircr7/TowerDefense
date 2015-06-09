package pieces;
import java.util.Random;



public abstract class Assaillant {
	protected String enemyName;
	protected int IDenemy, enemyHealth, enemyDamage, enemyRange, enemyResistance, dropRessources;
	protected double enemySpeed, damageSpeed;
	protected double slowResistance, freezeResistance;
	protected static int nombreAssaillant = 5;



	public AssaillantSpawn genererAssaillantRandom()
	{
		switch (hasard.nextInt(nombreAssaillant)) {
		case 0:
			return new Ddos();
		case 1:
			return new Error404();
		case 2:
			return new Hack();
		case 3:
			return new Trojan();
		default:
			return new Virus();
		}
	
	}
	
	
	
}
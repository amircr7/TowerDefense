package pieces;

public abstract class Tour {
	protected String tourName;
	protected int tourCost, freezeDamage, tourDamage, tourRange, tourHealth;
	protected double slowDamage, attackSpeed;
	
	abstract void attackTour();
	
}

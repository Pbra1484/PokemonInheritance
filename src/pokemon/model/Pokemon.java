package pokemon.model;

public abstract class Pokemon 
{
	private int attackPoints;
	private int healthPoints;
	private double speed;
	private String name;
	private int number;
	
	public Pokemon(String name, int number)
	{
		
	}
	
	public String getPokemonTypes()
	{
		
	}
	
	public String toString()
	{
		return "You called toString";
	}
	
	public String getPokemonInformation()
	{
		
	}
	
	public int getNumber() {
		return number;
	}
	public int getAttackPoints() {
		return attackPoints;
	}
	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}
	public int getHealthPoints() {
		return healthPoints;
	}
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getName() {
		return name;
	}

	
	
	
	
	

}

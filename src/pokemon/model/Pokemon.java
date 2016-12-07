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
		String ptypes = "This Pokemon is of type(s):\n";
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String[types.length];
		
		for(int index = 0; index < types.length; index++)
		{
			String temp = types[index].getCanonicalName();
			
			pokeTypes[index] = temp;
		}
		
		for(String current : pokeTypes)
		{
			String temp = current.replace(this.getClass().getPackage().getName() + ".",  "");
			ptypes += temp + "\n";
		}
		
		return ptypes;
	}
	
	public String toString()
	{
		return "You called toString";
	}
	
	public String getPokemonInformation()
	{
		String pokemonInfo = "This pokemon is of type: " + this.getClass().getSimpleName();
		
		reurn pokemonInfo;
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

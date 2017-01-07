package poke.model;

public class Heatran extends Pokemon implements Fire, Steel
{
	private int attackPoints;
	private int healthPoints;
	private double speed;
	private String name;
	private int number;
	private String advInfo;
	
	public Heatran()
	{
		super();
		super();
		this.name = "Heatran";
		this.number =  485;
		this.speed = 1;
		this.attackPoints = 1;
		this.healthPoints = 1;
		this.advInfo = "Stuff";
		
	}
	public Heatran(String name)
	{
		super();
		this.name = name;
		this.number = 485;
		this.speed = 1;
		this.attackPoints = 1;
		this.healthPoints = 1;
		this.advInfo = "Stuff";
	}
	
	public void flameThrower()
	{
		
	}
	public void fireBlast()
	{
		
	}
	public void ironTail()
	{
		
	}
	public void ironDefence()
	{
		
	}

}

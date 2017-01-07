package poke.model;

public class Darkrai extends Pokemon implements Dark
{
	private int attackPoints;
	private int healthPoints;
	private double speed;
	private String name;
	private int number;
	private String advInfo;
	
	public Darkrai()
	{
		super();
		this.name = "Darkrai";
		this.number =  491;
		this.speed = 1;
		this.attackPoints = 1;
		this.healthPoints = 1;
		this.advInfo = "Stuff";
		
	}
	public Darkrai(String name)
	{
		super();
		this.name = name;
		this.number = 491;
		this.speed = 1;
		this.attackPoints = 1;
		this.healthPoints = 1;
		this.advInfo = "Stuff";
	}
	
	public void nightmare()
	{
		
		
	}
	public void darkPulse()
	{
		
	}

}

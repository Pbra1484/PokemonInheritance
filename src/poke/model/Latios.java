package poke.model;

public class Latios extends Pokemon implements Dragon, Psychic
{
	private int attackPoints;
	private int healthPoints;
	private double speed;
	private String name;
	private int number;
	private String advInfo;
	
	public Latios()
	{
		super();
		this.name = "Latios";
		this.number =  381;
		this.speed = 1;
		this.attackPoints = 1;
		this.healthPoints = 1;
		this.advInfo = "Stuff";
		
	}
	pulic Latios(String name)
	{
		super();
		this.name = name;
		this.number = 381;
		this.speed = 1;
		this.attackPoints = 1;
		this.healthPoints = 1;
		this.advInfo = "Stuff";
	}
	
	public void dragonPulse()
	{
		
	}
	public void dragonClaw()
	{
		
	}
	public void phychic()
	{
		
	}
	public void zenHeadbut()
	{
		
	}

}

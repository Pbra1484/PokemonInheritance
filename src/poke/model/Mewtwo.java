package poke.model;

public class Mewtwo extends Pokemon implements  Psychic
{
	private int attackPoints;
	private int healthPoints;
	private double speed;
	private String name;
	private int number;
	private String advInfo;
	
	public Mewtwo()
	{
		super();
		this.name = "Mewtwo";
		this.number =  150;
		this.speed = 1;
		this.attackPoints = 1;
		this.healthPoints = 1;
		this.advInfo = "Stuff";
		
	}
	public Mewtwo(String name)
	{
		super();
		this.name = name;
		this.number = 150;
		this.speed = 1;
		this.attackPoints = 1;
		this.healthPoints = 1;
		this.advInfo = "Stuff";
	}
	
	public void phychic()
	{
		
	}
	public void zenHeadbut()
	{
		
	}
	

}

package poke.model;

public class Entei extends Pokemon implements Fire
{
	private int attackPoints;
	private int healthPoints;
	private double speed;
	private String name;
	private int number;
	private String advInfo;
	
	public Entei()
	{
		super();
		this.name = "Entei";
		this.number =  244;
		this.speed = 1;
		this.attackPoints = 1;
		this.healthPoints = 1;
		this.advInfo = "Stuff";
		
		
		
	}
	public Entei(String name)
	{
		super();
		this.name = name;
		this.number = 244;
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

}

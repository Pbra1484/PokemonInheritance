package poke.controller;

import poke.view.PokemonFrame;
import java.util.ArrayList;
import poke.model.*;
public class PokemonController 

{
	
	private ArrayList<Pokemon> pokedex;
	private PokemonFrame baseFrame;
	public Latios latios;
	public Mewtwo mewtwo;
	public Darkrai darkrai;
	public Entei entei;
	public Heatran heatran;
	public Latios flyingWhale;
	
	
	public PokemonController()
	{
		this.pokedex = new ArrayList<Pokemon>();
		makePokedex();
		baseFrame = new PokemonFrame(this);
		
	}
	
	private void makePokedex()
	{
		latios = new Latios();
		mewtwo  = new Mewtwo();
		darkrai = new Darkrai();
		entei = new Entei();
		heatran = new Heatran();
		flyingWhale = new Latios("FlyingWhale");
		
		
		
		pokedex.add(latios);
		pokedex.add(mewtwo);
		pokedex.add(darkrai);
		pokedex.add(entei);
		pokedex.add(heatran);
		pokedex.add(flyingWhale);
		
		
	}
	
	public void updateSelected(int index, String name, int attack, int health, double speed)
	{
		Pokemon currentPokemon = pokedex.get(index);
		currentPokemon.setName(name);
		currentPokemon.setAttackPoints(attack);
		currentPokemon.setHealthPoints(health);
		currentPokemon.setSpeed(speed);
		
//		
//		pokedex.get(index).setAttackPoints(attack);
//		pokedex.get(index).setHealthPoints(health);
//		pokedex.get(index).setSpeed(speed);
	}
	
	public ArrayList<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public void start()
	{
		
	}
	
	public PokemonFrame getBaseFrame()
	{
		return baseFrame;
	}

}

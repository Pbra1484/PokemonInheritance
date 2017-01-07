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

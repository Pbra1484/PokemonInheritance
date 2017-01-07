package poke.controller;

import poke.view.PokemonFrame;
import java.util.ArrayList;
import poke.model.*;
public class PokemonController 

{
	
	private ArrayList<Pokemon> pokedex;
	private PokemonFrame baseFrame;
	private Latios latios;
	private Mewtwo mewtwo;
	private Darkrai darkrai;
	private Entei entei;
	private Heatran heatran;
	
	
	public PokemonController()
	{
	//	makePokedex();
		baseFrame = new PokemonFrame(this);
		
	}
	
	private void makePokedex()
	{
		latios = new Latios();
		mewtwo  = new Mewtwo();
		darkrai = new Darkrai();
		entei = new Entei();
		heatran = new Heatran();
		
		
		
		pokedex.add(latios);
		pokedex.add(mewtwo);
		pokedex.add(darkrai);
		pokedex.add(entei);
		pokedex.add(heatran);
		
		
		
	}
	
	public void start()
	{
		
	}
	
	public PokemonFrame getBaseFrame()
	{
		return baseFrame;
	}

}

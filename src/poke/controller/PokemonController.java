package poke.controller;

import poke.view.PokemonFrame;
public class PokemonController 
{
	
	
	private PokemonFrame baseFrame;
	public PokemonController()
	{
		baseFrame = new PokemonFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public PokemonFrame getBaseFrame()
	{
		return baseFrame;
	}

}

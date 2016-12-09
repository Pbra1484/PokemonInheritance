package pokemon.controller;

import pokemon.view.PokemonFrame;
public class PokemonController 
{
	private PokemonFrame baseFrame;
	PokemonController()
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

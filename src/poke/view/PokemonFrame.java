package poke.view;

import javax.swing.JFrame;

import poke.controller.PokemonController;

import java.awt.Dimension;

public class PokemonFrame extends JFrame
{
	private PokemonController baseController;
	private PokemonPanel appPanel;
	
	public PokemonFrame(PokemonController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new PokemonPanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Pokemon");
		this.setSize(new Dimension(900, 600));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}

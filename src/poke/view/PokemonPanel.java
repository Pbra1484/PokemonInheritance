package poke.view;
 
import javax.swing.*;

import poke.controller.PokemonController;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private SpringLayout baseLayout;
	private ImageIcon pokemonIcon;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	public PokemonPanel(PokemonController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource("images/Pokeball.png"));
		this.updateButton = new JButton("Update");
		this.pokedexSelector = new JComboBox(new String [] {"Latios", "Mewtwo", "Darkrai", "Entei", "Heatran"});
		this.pokemonLabel = new JLabel("The current pokemon:", pokemonIcon, JLabel.CENTER);
		this.healthLabel = new JLabel("Health Points:");
		this.combatLabel = new JLabel("Atack Points:");
		this.speedLabel = new JLabel("Speed Points:");
		this.nameLabel = new JLabel("Name:");
		this.numberLabel = new JLabel("Pokemon Number:");
		this.advancedLabel = new JLabel("Advanced Information:");
		this.healthField = new JTextField(5);
		this.combatField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.nameField = new JTextField(25);
		this.numberField = new JTextField(5);
		numberField.setEditable(false);
		this.advancedArea = new JTextArea(10, 25);
		
				
		
		
		setupPanel();
		setupLayout();
		setupListeners();

		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.setBackground(Color.RED);
		this.add(updateButton);
		this.add(pokedexSelector);
		this.add(pokemonLabel);
		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pokemonLabel.setHorizontalTextPosition(JLabel.CENTER);
		this.add(healthLabel);
		this.add(combatLabel);
		this.add(speedLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(advancedLabel);
		this.add(healthField);
		this.add(combatField);
		this.add(speedField);
		this.add(nameField);
		this.add(numberField);
		this.add(advancedArea);
		
		
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, -93, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 32, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 0, SpringLayout.WEST, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.EAST, pokedexSelector, 200, SpringLayout.WEST, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 40, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokemonLabel, -40, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, healthLabel, 507, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, updateButton, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, combatLabel, 507, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, speedLabel, 507, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, nameLabel, 507, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, numberLabel, 507, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, advancedLabel, 267, SpringLayout.EAST, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedLabel, -259, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 6, SpringLayout.NORTH, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 6, SpringLayout.NORTH, combatField);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, -93, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 21, SpringLayout.SOUTH, combatField);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, combatField);
		baseLayout.putConstraint(SpringLayout.EAST, speedField, -93, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 6, SpringLayout.NORTH, speedField);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, 23, SpringLayout.SOUTH, healthField);
		baseLayout.putConstraint(SpringLayout.WEST, nameField, 507, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -6, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, numberField, -93, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameField, -19, SpringLayout.NORTH, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 6, SpringLayout.NORTH, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, 21, SpringLayout.SOUTH, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, 128, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, advancedArea, 267, SpringLayout.EAST, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 6, SpringLayout.SOUTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedArea, 6, SpringLayout.SOUTH, advancedLabel);
		
	}
	private void setupListeners()
	{
//		this.addMouseListener(new MouseListener()
//				{
//			public void mouseEntered(MouseEvent entered)
//			{
////				JOptionPane.shwoMessageDialog(baseController.getBaseFrame(), "The mouse entered the program");
//			}
//			
//			public void mouseReleased(MouseEvent released)
//			{
////				JOptionPane.shwoMessageDialog(baseController.getBaseFrame(), "The mouse was released");
//			}
//			
//			public void mouseExited(MouseEvent exit)
//			{
////				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse was released");
//			}
//			
//			public void mouseClicked(MouseEvent clicked)
//			{
////				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse was clicked");
//			}
//			
//			public void mousePressed(MouseEvent pressed)
//			{
////				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse was pressed");
//			}
//				});
//	
//		this.addMouseMotionListener(new MouseMotionListener()
//				{
//			public void mouseDragged(MouseEvent dragged)
//			{
//				setRandomColor();
//			}
//			public void mouseMoved(MouseEvent moved)
//			{
//				if((Math.abs(moved.getX() - updateButton.getX()) < 5 ) || (Math.abs(moved.getY() - updateButton.getY()) < 5))
//				{
//					updateButton.setLocation(moved.getX() + 10, moved.getY() - 10);
//				}
//				
//			}
//				});
	}
	
	private void setRandomColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
}

package pokemon.view;
 
import pokemon.controller.PokemonController;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, -93, SpringLayout.EAST, this);
		this.pokedexSelector = new JComboBox(new String [] {"Latios", "Mewtwo", "Darkrai", "Entei", "Heatran"});
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 32, SpringLayout.NORTH, this);
		this.pokemonLabel = new JLabel("The current pokemon:", pokemonIcon, JLabel.CENTER);
		baseLayout.putConstraint(SpringLayout.WEST, updateButton, 267, SpringLayout.EAST, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 0, SpringLayout.WEST, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.EAST, pokedexSelector, 200, SpringLayout.WEST, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 199, SpringLayout.NORTH, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 40, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokemonLabel, -40, SpringLayout.SOUTH, this);
		this.healthLabel = new JLabel("Health Points:");
		baseLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, updateButton);
		this.combatLabel = new JLabel("Atack Points:");
		baseLayout.putConstraint(SpringLayout.WEST, combatLabel, 0, SpringLayout.WEST, updateButton);
		this.speedLabel = new JLabel("Speed Points:");
		baseLayout.putConstraint(SpringLayout.WEST, speedLabel, 0, SpringLayout.WEST, updateButton);
		this.nameLabel = new JLabel("Name:");
		baseLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, updateButton);
		this.numberLabel = new JLabel("Pokemon Number:");
		baseLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, updateButton);
		this.advancedLabel = new JLabel("Advanced Information:");
		baseLayout.putConstraint(SpringLayout.EAST, advancedLabel, -250, SpringLayout.EAST, this);
		this.healthField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 6, SpringLayout.NORTH, healthField);
		this.combatField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 6, SpringLayout.NORTH, combatField);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, -93, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 21, SpringLayout.SOUTH, combatField);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, combatField);
		this.speedField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 6, SpringLayout.NORTH, speedField);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, 23, SpringLayout.SOUTH, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, speedField, 0, SpringLayout.EAST, updateButton);
		this.nameField = new JTextField(25);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -6, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, updateButton);
		this.numberField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameField, -19, SpringLayout.NORTH, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 6, SpringLayout.NORTH, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, 21, SpringLayout.SOUTH, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, 128, SpringLayout.NORTH, this);
		this.advancedArea = new JTextArea(10, 25);
		baseLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, advancedArea);
		baseLayout.putConstraint(SpringLayout.EAST, advancedArea, -93, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedArea, 370, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedLabel, -6, SpringLayout.NORTH, advancedArea);
				
		
		
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
		
	}
	private void setupListeners()
	{
		
	}
}

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
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 129, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, updateButton, 202, SpringLayout.WEST, this);
		this.pokedexSelector = new JComboBox(new String [] {"Latios", "Mewtwo", "Darkrai", "Entei", "Heatran"});
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 246, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 294, SpringLayout.WEST, this);
		this.pokemonLabel = new JLabel("The current pokemon:", pokemonIcon, JLabel.CENTER);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 10, SpringLayout.WEST, this);
		this.healthLabel = new JLabel("Health Points:");
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonLabel, 61, SpringLayout.SOUTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 222, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, healthLabel, 92, SpringLayout.WEST, this);
		this.combatLabel = new JLabel("Atack Points:");
		baseLayout.putConstraint(SpringLayout.EAST, combatLabel, 0, SpringLayout.EAST, pokedexSelector);
		this.speedLabel = new JLabel("Speed Points:");
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 36, SpringLayout.SOUTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, speedLabel, 173, SpringLayout.WEST, this);
		this.nameLabel = new JLabel("Name:");
		baseLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -6, SpringLayout.NORTH, healthLabel);
		this.numberLabel = new JLabel("Pokemon Number:");
		this.advancedLabel = new JLabel("Advanced Information:");
		baseLayout.putConstraint(SpringLayout.NORTH, advancedLabel, 71, SpringLayout.SOUTH, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.WEST, advancedLabel, 224, SpringLayout.WEST, this);
		this.healthField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.SOUTH, healthField, -522, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, healthField, -516, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 33, SpringLayout.SOUTH, healthField);
		this.combatField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.SOUTH, combatField, -36, SpringLayout.NORTH, updateButton);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, 0, SpringLayout.EAST, nameLabel);
		this.speedField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, -2, SpringLayout.NORTH, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.WEST, speedField, 20, SpringLayout.EAST, pokedexSelector);
		this.nameField = new JTextField(25);
		baseLayout.putConstraint(SpringLayout.EAST, nameLabel, -336, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, 196, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 6, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, numberLabel, -157, SpringLayout.WEST, nameField);
		this.numberField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, 0, SpringLayout.NORTH, healthField);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 123, SpringLayout.EAST, healthField);
		this.advancedArea = new JTextArea(10, 25);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, advancedArea);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedArea, -50, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, advancedArea, -45, SpringLayout.EAST, this);
				
		
		
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

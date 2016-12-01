package pokemon.view;
 
import pokemon.controller.PokemonController;
import javax.swing.*;
import java.awt.Color;
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
		this.pokemonIcon = new ImageIcon(getClass().getResource(""));
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
		this.advancedArea = new JTextArea(10, 25);
				
		
		
		setupPanel();
		setupLayout();
		setupListeners();

		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
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

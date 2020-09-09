// Game Zone page 108

import javax.swing.JOptionPane;

public class MadLib
{
	public static void main(String[] args) 
	{
		// Variables and Constants
		// Input phase
		String noun1 = JOptionPane.showInputDialog(null, "Please enter a noun:");

		String noun2 = JOptionPane.showInputDialog(null, "Please enter another noun:");

		String adjective = JOptionPane.showInputDialog(null, "Please enter a adjective:");

		String verb = JOptionPane.showInputDialog(null, "Please enter a paste tense verb:");

		// Output phase
		JOptionPane.showMessageDialog(null, " Mary had a little " + noun1 + "\nIt's " + noun2 + " was " + adjective + " as snow" + "\nAnd everywhere that Mary " + verb + "\nThe " + noun1 + " was sure to go.");
	}
}
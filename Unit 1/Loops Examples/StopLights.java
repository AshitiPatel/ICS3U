import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ashiti
 *Date: 10 December 2020
 *Description: Displays Stop, Slow-down or Go depending on the input of three colours from the user.
 */
public class StopLights {

	public static void main(String[] args)
	{
		String colour;

		JOptionPane.showMessageDialog(null, "Hellooooo! This program gives driving suggestions based on the colour you enter.");

		do 
		{
			colour = JOptionPane.showInputDialog(null, "Please enter red, green or yellow.\nOr enter quit to stop.");

			//check if valid colour option entered
			while (!colour.equalsIgnoreCase("green") 
					&& !colour.equalsIgnoreCase("yellow")
					&& !colour.equalsIgnoreCase("red")
					&& !colour.equalsIgnoreCase("quit"))
			{
				colour = JOptionPane.showInputDialog(null, "Error! Please enter red, yellow, green or quit.");
			}

			if (colour.equalsIgnoreCase("red"))
			{
				JOptionPane.showMessageDialog(null, "Stop!");
			}

			else if (colour.equalsIgnoreCase("yellow"))
			{
				JOptionPane.showMessageDialog(null, "Slow down and stop!");
			}

			else if (colour.equalsIgnoreCase("green"))
			{
				JOptionPane.showMessageDialog(null, "Gooooooooo!");
			}

			else
			{
				JOptionPane.showMessageDialog(null, "Thank you for using this program. Hope it helped you!");
			}
		}

		while (!colour.equalsIgnoreCase("Quit"));

	}

}

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 * @author Ashiti 
 * Date: 12 December 2020
 * Description: A program that calculates and displays the price of a computer
 *
 */
public class Question5 
{

	public static void main(String[] args) 
	{
		//declaring variables for storage type, memmory and cost and a variable for input of yes/anything else to continue or not
		int storageSize, memory;
		double cost;
		String cont = "yes";

		//a friendly informing message
		JOptionPane.showMessageDialog(null, "Helloooo! This program helps you calculate the price of a computer with customizable specs.");

		while (cont.equalsIgnoreCase("yes"))
		{
			//prompt for memory
			memory = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the RAM:"
					+ "\n\"8\" for 8GB"
					+ "\n\"16\" for 16GB"
					+ "\n\"32\" for 32GB"));

			//check for valid input for memory
			while (!(memory == 8) && !(memory == 16) && !(memory == 32))
			{
				memory = Integer.parseInt(JOptionPane.showInputDialog(null,"ERROR! "
						+ "\nPlease enter the RAM:"
						+ "\n\"8\" for 8GB"
						+ "\n\"16\" for 16GB"
						+ "\n\"32\" for 32GB"));
			}

			//prpmpt and get storage size
			storageSize = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Storage Size(SSD):"
					+ "\n\"500\" for 500GB"
					+ "\n\"1\" for 1TB"));

			//check for valid input of ssd
			while(!(storageSize == 500) && !(storageSize == 1))
			{
				storageSize = Integer.parseInt(JOptionPane.showInputDialog(null,"ERROR!"
						+ "\nPlease enter the Storage Size(SSD):"
						+ "\n\"500\" for 500GB"
						+ "\n\"1\" for 1TB"));
			}

			//display cost based on input
			if (storageSize == 500)
			{
				if (memory == 8)
				{
					cost = 599.99;
				}
				else if (memory == 16)
				{
					cost = 649.99;
				}
				else
				{
					cost = 999.99;
				}
			}
			else 
			{
				if (memory == 8)
				{
					cost = 799.50;
				}
				else if (memory == 16)
				{
					cost = 899.99;
				}
				else
				{
					cost = 1229.99;
				}
			}

			//display cost
			JOptionPane.showMessageDialog(null, "$" + cost + " is the cost of computer with " + memory + "GB memory and " + storageSize + "GB SSD.");

			//ask whether user wants to continue calculating the cost
			cont = JOptionPane.showInputDialog(null, "Would you like to calculate the cost of a computer with different specs?");
		}
		JOptionPane.showMessageDialog(null, "Thank you for using my program. Hope it was helpful.");
	}

}

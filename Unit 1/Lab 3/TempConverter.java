import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ashiti
 * Date: 2 December 2020
 * Description: A program to convert temperatures from farenheit to celsius and vice-versa
 *
 */
public class TempConverter
{
	public static void main(String[] args) 
	{
		//declare variables for the temps
		double celsius, fahrenheit; 

		//declare variable for choice
		int choice;

		//declare and initialize variable for input from user whether he/she wants to continue or not
		String userReply = "yes";

		while (userReply.equalsIgnoreCase("yes"))
		{
			//prompt for choice
			choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter\n1-Celsius to Fahrenheit\n2-Fahrenheit to Celsius"));

			//check whether the input for choice is valid or not
			while (!(choice == 1) && !(choice == 2))
			{
				//ask for valid input for choice
				choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Error! Please enter 1 or 2."));
			}

			//decide on what choice is entered
			if (choice == 1) 
			{
				//*****************Convert to Fahrenheit

				//prompt for celsius 
				celsius = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the temperature in deg. Celsius"));

				//convert the temperature
				fahrenheit = celsius*9/5 + 32;

				//display the new temperature in fahrenheit
				JOptionPane.showMessageDialog(null, celsius + " deg C. equals \n" + fahrenheit + " deg. F."); 

			}

			else
			{

				//***************** Convert to Celsius 

				//prompt for Farhenheit
				fahrenheit = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter temp in deg. fahrenheit"));

				//convert the temp 
				celsius = (fahrenheit - 32) *5/9;

				//display the new temp
				JOptionPane.showMessageDialog(null, fahrenheit + " deg F. equals \n" + celsius + " deg. C.");


			}
			//prompt and get userReply
			userReply = JOptionPane.showInputDialog("Do you want to continue temperature conversion?"
					+ "\nEnter \"yes\" if you'd like to continue "
					+ "\nand anything else if you'd like to stop"); 

		}
		JOptionPane.showMessageDialog(null, "Thank you for using my program. Hope it was helpfull.");
	}
}

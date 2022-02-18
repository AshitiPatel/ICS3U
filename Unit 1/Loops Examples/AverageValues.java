import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ashiti
 * Date: 10 December 2020
 * Description: A program that calculates the average of numbers entered by the user till a negative number is entered.
 *
 */
public class AverageValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		double avg = 0, total = 0, number = 0;
		int numOfValues = 0;

		JOptionPane.showMessageDialog(null, "Hi there! This program is designed to help you calculate the average numbers."
				+ "You can enter a negative number to stop.");

		number = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Enter the first number:"));
		if (number >= 0)
		{
			while(number >= 0) 
			{
				numOfValues = numOfValues + 1;	//adds 1 to numOfValues
				total = total + number; //adds the number entered to the total

				number = Double.parseDouble(JOptionPane.showInputDialog(null,
						"Enter another number:"));
			}

			//calculate the avg outside the loop
			avg = total / numOfValues;

			JOptionPane.showMessageDialog(null, "The average is " + avg + ".");
			JOptionPane.showMessageDialog(null, "Thank you for using my program. Hope it helped you.");
		}

		else
		{
			JOptionPane.showMessageDialog(null, "The program ends here. Have a good day!");
		}

	}
}

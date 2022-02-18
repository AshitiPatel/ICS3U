import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ashiti
 * Date: 6 December 2020
 * Description: Calculate the number of hours, minutes and seconds from the number of seconds as input
 *
 */
public class PartC_Q8 {

	public static void main(String[] args) 
	{
		//declare variable for input of seconds 
		int seconds;
		
		//declare variable for the no. of hours, minutes and seconds(output)
		int numHr, numMin, numSec;
		
		//Display a friendly message for the user
		JOptionPane.showMessageDialog(null, "Hi! This program takes the number of seconds as input and calculates the hours, minutes and seconds.");
		
		//Prompt and get seconds
		seconds = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of seconds:"));
		
		//check whether seconds is positive or negative
		if (seconds > 0)
		{
			//calculation
			numSec = seconds % 60;
	        numHr = seconds / 60;
	        numMin = numHr % 60;
	        numHr = numHr / 60;
			
			//display the result
			JOptionPane.showMessageDialog(null,(seconds + "seconds = " + numHr + "hours, " + numMin + "minutes, " + numSec + "seconds"));
			JOptionPane.showMessageDialog(null, "Thank-you for using my program.");
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "Error! The number of seconds can't be negative.");
		}

	}
}


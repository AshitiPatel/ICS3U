import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Ashiti
 * Date: 4 December 2020
 * Description: A program that calculates and displays the hypotenuse of a right angled triangle 
 *
 */
public class PartB_Q4 {

	public static void main(String[] args) {
		
		//declare variables for two sides and hypotenuse
		double side1, side2, hypo=0;
		
		//setup output for two decimal places
		DecimalFormat twoDigit = new DecimalFormat("#0.00");
		
		//greet and inform the user
		JOptionPane.showMessageDialog(null, "Hi! This program calculates the hypotenuse of a right angle triangle.");
		
		//prompt and get the sides
		side1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length of the first side in metres(m):"));
		side2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length of the second side in metres(m):"));
		
		if(side1 > 0 && side2 > 0)
		{
			//calculate the hypotenuse 
			hypo = Math.sqrt((Math.pow(side1, 2)) + (Math.pow(side2, 2)));
			
			//display the hypotenuse and formula
			JOptionPane.showMessageDialog(null, "The hypotenuse of a right angle triangle with sides " + twoDigit.format(side1) + "m and " + twoDigit.format(side2) + "m is " + twoDigit.format(hypo) + "m."
					+ "\nThe original formula used for this calculation was (hypo)^2 = (side1)^2 + (side2)^2.");
			
			JOptionPane.showMessageDialog(null, "Thank-you for using my program. Hope it was able to help you.");
			
		}
		
		else 
		{
			//display an error message	
			JOptionPane.showMessageDialog(null, "Error! A side can't be negative.");
		}
	}//end main method
}//end class PartB_Q4

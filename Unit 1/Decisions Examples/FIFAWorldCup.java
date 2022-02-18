import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ashiti
 *Date: 7 December 2020
 *Description: Display ticket prices
 */
public class FIFAWorldCup {

	public static void main(String[] args) 
	{
		//declaring variables for ticket type, age and cost
		String ticketType = "";
		int age = 0;
		double cost = 0;
		
		//setting up for currency format
		DecimalFormat curr = new DecimalFormat("#.00");
		
		JOptionPane.showMessageDialog(null, "Hello! This program helps you calculate the cost of your ticket for the FIFA World Cup.");
		
		//prompt for ticket type
		ticketType = JOptionPane.showInputDialog(null, "Enter:"
												+ "\n\'EB\' for Early Bird Ticket"
												+ "\n\'LM\' for Last Minute Ticket");
		
		//ask for correct ticket type if not correct
		while (!ticketType.equalsIgnoreCase("EB") && !ticketType.equalsIgnoreCase("LM"))
		{
			//Wrong input. Prompt for ticket type
			ticketType = JOptionPane.showInputDialog(null, "Error! Please enter:"
													+ "\n\'EB\' for Early Bird Ticket"
													+ "\n\'LM\' for Last Minute Ticket");
												
		}
		
		//prompt for age
		age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));
		
		//ask for valid age if not valid
		while (age < 0 || age > 150)
		{
			age = Integer.parseInt(JOptionPane.showInputDialog(null, "Error! Please enter a reasonable age(between 0 to 150)."));
		}
		
		//checking ticket type
		if (ticketType.equalsIgnoreCase("EB"))
		{
			//early bird
			if (age <= 12) 
			{
				cost = 70;	
			}
			
			else if (age > 12)
			{
				cost = 150;
			}
		}
		else if (ticketType.equalsIgnoreCase("LM"))
		{
			//last minute
			if (age <= 12)
			{
				cost = 500;
			}
			else if (age > 12)
			{
				cost = 1000;
			}
		}
		
		//display cost
		JOptionPane.showMessageDialog(null, "The cost for your ticket is $" + curr.format(cost));
		JOptionPane.showMessageDialog(null, "Thank-you for using my program. Hope it helped you! Enjoy the game!");
	}//end main method

}//end class FIFAWorldCup

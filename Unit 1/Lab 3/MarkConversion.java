import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ashiti
 * Date: 11 December 2020
 * Description: A program that converts and displays the marks input by the user into grade levels
 *
 */
public class MarkConversion 
{

	public static void main(String[] args) 
	{
		//declare and initialize variable for input mark
		int mark = 0;

		//declare and initialize variable for user answer
		String ans = "yes";

		//display a friendly message for the user
		JOptionPane.showMessageDialog(null, "Hello! This program is designed to help you calculate the grade level of your marks.");

		//calculate the grade level
		while (ans.equalsIgnoreCase("yes"))
		{

			//prompt and get mark
			mark = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your mark (as a whole number)"));

			//check whether valid mark entered
			while (mark < 0 || mark > 100)
			{
				//prompt for valid mark
				if (mark < 0)
				{
					mark = Integer.parseInt(JOptionPane.showInputDialog(null, "ERROR! Mark can't be negative." +
							"\nPlease enter a valid mark(between 0 to 100)."));
				}

				else 
				{
					mark = Integer.parseInt(JOptionPane.showInputDialog(null, "ERROR! Mark can't be more than 100." +
							"\nPlease enter a valid mark(between 0 to 100)."));
				}
			}

			//display grade level according to mark
			if (mark < 50)
			{
				//display grade level
				JOptionPane.showMessageDialog(null, "The grade level for your mark " + mark + " is Level R.");

				//ask if user wants to continue and save input
				ans = JOptionPane.showInputDialog(null, "Would you like to continue to enter and convert marks?" + 
						"\nEnter \"yes\" to continue" +
						"\nEnter anything else to exit");
			}

			else if (mark >= 50 && mark < 60)
			{
				//display grade level
				JOptionPane.showMessageDialog(null, "Well done! The grade level for your mark " + mark + " is Level 1.");

				//ask if user wants to continue and save input
				ans = JOptionPane.showInputDialog(null, "Would you like to continue to enter and convert marks?" + 
						"\nEnter \"yes\" to continue" +
						"\nEnter anything else to exit");
			}

			else if (mark >=60 && mark < 70)
			{
				//display grade level
				JOptionPane.showMessageDialog(null, "Great Job! The grade level for your mark " + mark + " is Level 2.");

				//ask if user wants to continue and save input
				ans = JOptionPane.showInputDialog(null, "Would you like to continue to enter and convert marks?" + 
						"\nEnter \"yes\" to continue" +
						"\nEnter anything else to exit");
			}

			else if (mark >= 70 && mark < 80)
			{
				//display grade level
				JOptionPane.showMessageDialog(null, "Very Good! The grade level for your mark " + mark + " is Level 3.");

				//ask if user wants to continue and save input
				ans = JOptionPane.showInputDialog(null, "Would you like to continue to enter and convert marks?" + 
						"\nEnter \"yes\" to continue" +
						"\nEnter anything else to exit");
			}

			else
			{
				//display grade level
				JOptionPane.showMessageDialog(null, "Excellent! The grade level for your mark " + mark + " is Level 4.");

				//ask if user wants to continue and save input
				ans = JOptionPane.showInputDialog(null, "Would you like to continue to enter and convert marks?" + 
						"\nEnter \"yes\" to continue" +
						"\nEnter anything else to exit");
			}	
		}
		
		//display a thank you message
		JOptionPane.showMessageDialog(null, "Thank you for using my program. Hope you liked it!");
	}
}

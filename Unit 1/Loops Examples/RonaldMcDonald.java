import javax.swing.ImageIcon;

/**
 * @author Ashiti
 *Date:14 December 2020
 *Description: A quiz program that asks who was the first Ronald McDonald. 
 *				It provides 3 chances to the user for the correct answer.abstract
 *				It requires the library IO.java
*/

public class RonaldMcDonald 
{

	public static void main(String[] args) 
	{
		String answer = "";		//declare and initialize variables for answer and tries
		final String correct = "Willard Scott";			
		int tries = 1;
		
		//prompt for user answer
		answer = IO.readString("Who was the first Ronald Mcdonald?", new ImageIcon("ronald.png"));
		
		//while answer is not equal to willard scott and tries < 3
		while (!answer.equalsIgnoreCase(correct) && (tries < 3))
		{
			//display 'incorrect' message
			IO.display("Incorrect! Try again", new ImageIcon("sad.png"));
			//prompt for user answer and increase counter by 1
			answer = IO.readString("Who was the first Ronald Mcdonald?", new ImageIcon("ronald.png"));
			tries = tries + 1;
		}
		
		//display message
		if (answer.equalsIgnoreCase(correct))
		{
			IO.display("Correct!", new ImageIcon("smiley.png"));
		}
		else 
		{
			IO.display("Nice try! The correct answer is " + correct, new ImageIcon("sad.png"));
		}
		
	}

}

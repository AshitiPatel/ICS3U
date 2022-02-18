import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ashiti
 *Date: 7 December 2020 
 *Description: The user plays a game against the computer by guessing a number from 1 to 10.
 */
public class GuessingGame {

	public static void main(String[] args) {
		
		//declare user and computer guesses
		int userGuess = 0, computerGuess;
		
		//variable to allow the user to play again
		String answer = "yes";
		
		//display a friendly message
		JOptionPane.showMessageDialog(null, "Hello! Welcome to the Guessing Game!"
										+ "You have to guess the computer's guess to win.");
		
		while(answer.equalsIgnoreCase("yes"))
		{
		//prompt the user for a number from 1 to 10
			userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number from 1 to 10:"));
		
			//get the computer guess as a random number from 1 to 10
			computerGuess = (int)(Math.random() * 10 + 1);
			
			//check if the user won or if they entered too high or too low
			if (userGuess == computerGuess)
			{
				JOptionPane.showMessageDialog(null, "You entered " + userGuess + 
													".\nThe computer guessed " + computerGuess 
													+ ".\nYou won!");
			}
			
			else if (userGuess < computerGuess)
			{
				JOptionPane.showMessageDialog(null, "You entered " + userGuess + 
													".\nThe computer guessed " + computerGuess 
													+ ".\nToo low!");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You entered " + userGuess + 
						".\nThe computer guessed " + computerGuess 
						+ ".\nToo high!");
			}
			
			//ask user if they want to play again
			answer = JOptionPane.showInputDialog("Do you want to play again? Enter yes to play again.");
		}
		
		JOptionPane.showMessageDialog(null, "Thank you for playing my game. Hope you liked it!");

	}//end main method

}//end GuessingGame class

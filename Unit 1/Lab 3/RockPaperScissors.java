import javax.swing.JOptionPane;

/**
 * @author Ashiti Patel
 * Date: 10 December 2020
 * Description: A game of Rock-Paper-Scissors against the computer
 *
 */
public class RockPaperScissors {

	public static void main(String[] args) 
	{
		//declare variables for user input and computer guess
		int userInputNum, computerChoiceNum;
		String userInput, computerChoice;

		//variable to allow the user to play again
		String answer = "yes";

		//display a friendly message
		JOptionPane.showMessageDialog(null, "Hello! Welcome to a friendly game of Rock-Paper-Scissors.");

		while(answer.equalsIgnoreCase("yes")) 
		{
			//prompt and get the user's input
			userInput = JOptionPane.showInputDialog(null, "Enter rock, paper or scissors");

			//check if valid input entered
			while (!userInput.equalsIgnoreCase("Rock") && !userInput.equalsIgnoreCase("Paper") && !userInput.equalsIgnoreCase("Scissors"))
			{
				userInput = JOptionPane.showInputDialog(null, "Error! Invalid input!" +
															  "\nPlease enter rock, paper or scissors.");
							
			}

			//assign values to userInputNum based on user's input
			if (userInput.equalsIgnoreCase("Rock"))
			{
				userInputNum = 1;
			}
			else if (userInput.equalsIgnoreCase("Paper"))
			{
				userInputNum = 2;
			}
			else
			{
				userInputNum = 3;
			}

			//get computer preference from 1 to 3
			computerChoiceNum = (int)(Math.random() * 3 + 1);

			//initialize computerPref based on computerPrefNum
			if (computerChoiceNum == 1)
			{
				computerChoice = "Rock";
			}
			else if (computerChoiceNum == 2)
			{
				computerChoice = "Paper";
			}
			else
			{
				computerChoice = "Scissors";
			}

			//check if there was a winner or a tie
			if (userInputNum == computerChoiceNum)
			{
				//display result
				JOptionPane.showMessageDialog(null, "It's a tie!" + 
													"\nYou entered " + userInput + 
													"\nThe computer also chose " + computerChoice);

				//ask user if user wants to play again
				answer = JOptionPane.showInputDialog(null, "Would you like to play again? Enter yes if you'd like to.");
			}

			else if (userInputNum > computerChoiceNum)
			{
				if (userInputNum == 3 && computerChoiceNum == 1) 
				{
					//display result
					JOptionPane.showMessageDialog(null, "You lost!" + 
														"\nYou entered " + userInput + 
														"\nThe computer chose " + computerChoice +
														"\nBetter luck next time!");

					//ask user if user wants to play again
					answer = JOptionPane.showInputDialog(null, "Would you like to play again? Enter yes if you'd like to.");
				}
				
				else
				{
					//display result
					JOptionPane.showMessageDialog(null, "Congratulations! You won!" +
														"\nYou entered " + userInput + 
														"\nThe computer chose " + computerChoice);

					//ask user if user wants to play again
					answer = JOptionPane.showInputDialog(null, "Would you like to play again? Enter yes if you'd like to.");
				}	
			}
			
			else
			{
				if (computerChoiceNum == 3 && userInputNum == 1) 
				{
					//display result
					JOptionPane.showMessageDialog(null, "Congratulations! You won!" +
														"\nYou entered " + userInput + 
														"\nThe computer chose " + computerChoice);

					//ask user if user wants to play again
					answer = JOptionPane.showInputDialog(null, "Would you like to play again? Enter yes if you'd like to.");
				}
				
				else
				{
					//display result
					JOptionPane.showMessageDialog(null, "You lost!" + 
														"\nYou entered " + userInput + 
														"\nThe computer chose " + computerChoice +
														"\nBetter luck next time!");

					//ask user if user wants to play again
					answer = JOptionPane.showInputDialog(null, "Would you like to play again? Enter yes if you'd like to.");
				}
			}
		}
		
		//display thank you message
		JOptionPane.showMessageDialog(null, "Thank you for playing my game. Hope you enjoyed!");
	}
}




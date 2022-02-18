import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ashiti
 *Date: January 2021
 *Description: A program that takes string input from the user, reverses it, checks whether it is a palindrome and displays the result.
 *			   (Part C attempted as well)
 */
public class Palindromes {

	public static void main(String[] args) {

		//declare and initialize variable for input
		String input = "", reverse = "", lowCasInput = "", lowCasReverse = "";
		int tryAgain = 0;

		//a friendly welcome message
		JOptionPane.showMessageDialog(null, "Hiiiiii!\nThis program is designed to help you reverse a word.\nIt also helps you check whether it is a palindrome or not.");

		//prompt and get input
		input = JOptionPane.showInputDialog("Enter word input: ");

		//prompt for valid input if input entered is invalid
		while(input.contains(" ") || input.contains(";") || input.contains(":") || input.contains("?") || input.contains(".") || input.contains(",") || input.contains("!") || input.contains("-")) {
			input = JOptionPane.showInputDialog("Invalid input entered!\nPlease enter valid input(just a word):");
		}

		//loop for when user wants to try again/continue
		while(tryAgain == 0) {

			//for loop for finding the reverse
			for (int i = 0; i < input.length(); i++) {
				reverse = reverse + input.charAt((input.length() - 1) - i);
			}

			//convert input and reversed input to lower case
			lowCasInput = input.toLowerCase();
			lowCasReverse = reverse.toLowerCase();

			//check if input is a palindrome 
			if(lowCasInput.equals(lowCasReverse)) {
				//display the result
				JOptionPane.showMessageDialog(null, "The reverse of your input \'" + input + "\' is \'" + reverse + "\'."
						+ "\nWhich means that your input is a palindrome because"
						+ "\nthe input \'" + lowCasInput + "\' is the same as \'" + lowCasReverse +"\'.");
			}
			else 
			{
				//display the result
				JOptionPane.showMessageDialog(null, "The reverse of your input \'" + input + "\' is \'" + reverse + "\'."
						+ "\nWhich means that your input is not a palindrome because"
						+ "\nthe input \'" + lowCasInput + "\' is not the same as \'" + lowCasReverse +"\'.");
			}

			//ask user whether they want to do the same with a phrase
			tryAgain = JOptionPane.showConfirmDialog(null, "Would you like to repeat this for a customized phrase?");

			//if user wants to do the same with a phrase
			if (tryAgain == 0) {

				//prompt and get input
				input = JOptionPane.showInputDialog("Enter a phrase or sentance:");

				//get rid of unwanted characters and spaces from input
				while (input.contains(" ")) {
					input = input.replace(" ", "");
				}
				while (input.contains(",")) {
					input = input.replace(",", "");
				}
				while (input.contains(".")) {
					input = input.replace(".", "");
				}
				while (input.contains(":")) {
					input = input.replace(":", "");
				}
				while (input.contains(";")) {
					input = input.replace(";", "");
				}
				while (input.contains("?")) {
					input = input.replace("?", "");
				}
				while (input.contains("!")) {
					input = input.replace("!", "");
				}
				while (input.contains("-")) {
					input = input.replace("-", "");
				}

				//empty the variables except for input
				reverse = lowCasInput = lowCasReverse = "";
			}
			else {
				//display a friendly thank you message
				JOptionPane.showMessageDialog(null, "Thank you for using my program!\nHope you liked it!");
			}
		}

	}

}

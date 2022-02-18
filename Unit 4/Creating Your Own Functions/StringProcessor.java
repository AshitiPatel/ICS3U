import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ashiti
 *Date: January 2021
 *Description: This program processes strings so that it keeps the letters of a string and reverses it.
 *				and finally decides whether the string is a palindrome or not.
 *Method List: 
 *				void main(String[] args)
 *				String reverseWord (String word)		method to reverse all letters of a string
 *				String keepLetters (String word) 		method to remove all unwanted characters and keep only letters
 *
 */

/*
 * Method to reverse the string
 */

public class StringProcessor {

	public static String reverseWord (String word) {
		String reversed = "";		//declare and initialize string for reversed word

		//loop from the end of the word to the beginning 
		for (int i = 0; i < word.length(); i++) {
			reversed = reversed + word.charAt((word.length() - 1) - i);		//add the character at i to reversed
		}
		return reversed;		//return reversed word
	}

	/*
	 * A method to keep just the letters of a string and remove all other unwanted characters
	 */

	public static String keepLetters (String word) {
		String lettersOnly = "";

		//a loop to go through a string and check if there is a letter at i
		for (int i = 0; i < word.length(); i++) {

			char letter = word.charAt(i);		//get the letter and its ascii code
			int ascii = (int)letter;

			if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
				lettersOnly = lettersOnly + letter;		//add the letter to output
			}

		}

		return lettersOnly;		//return the letters only
	}

	public static void main(String[] args) {

		String phraseIn;		//input phrase
		String phraseOut, letters;		//output phrase
		int tryAgain = 0;		//variable for taking input from user whether they want to continue or not

		//a friendly welcome and info message
		JOptionPane.showMessageDialog(null, "Hiiiiii!\nThis program is designed to help you reverse a phrase.\nIt also helps you check whether it is a palindrome or not.");

		//loop for when user wants to try again/continue
		while(tryAgain == 0) {

			//prompt for a phrase
			phraseIn = JOptionPane.showInputDialog("Enter a phrase:");

			//call the method to keep letters
			letters = keepLetters(phraseIn);

			//call the reverse function
			phraseOut = reverseWord(letters);

			//display the reversed phrase
			JOptionPane.showMessageDialog(null, "The reversed phrase is \'" + phraseOut + "\'");

			//check if the phrase is a palindrome
			if (letters.equalsIgnoreCase(phraseOut)) {
				JOptionPane.showMessageDialog(null, "The phrase \'" + phraseIn + "\' is a palindrome."
						+ "\nThis is because \'" + phraseIn + "\' is equal to its reversed phrase \'" + phraseOut + "\', ignoring spaces and characters.");
			} 
			else {
				JOptionPane.showMessageDialog(null, "The phrase \'" + phraseIn + "\' is not a palindrome."
						+ "\nThis is because \'" + phraseIn + "\' is not equal to its reversed phrase \'" + phraseOut + "\', ignoring spaces and characters.");
			}

			//ask user whether they want to do the same with a phrase
			tryAgain = JOptionPane.showConfirmDialog(null, "Would you like to repeat this with another phrase?");

			if (tryAgain == 0) {
				//empty the variables 
				phraseIn = phraseOut= letters = "";
			}
			else {
				JOptionPane.showMessageDialog(null, "Thank you for using my program!\nHope you enjoyed!!");
			}

		}

	}

}


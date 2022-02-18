import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ashii
 *Date: January 2021
 *Description: Asks the user for input and counts the vowels
 */
public class FindVowels {

	public static void main(String[] args) {
		//declare variables for input, vowels and counter
		String input = "", vowels = "";
		int counter = 0;
		
		//ask for a word
		input = JOptionPane.showInputDialog("Enter a word of your choice:");
		
		//change input to lowercase
		input = input.toLowerCase();
		
		for(int i = 0; i < input.length(); i++) {
			char letter = input.charAt(i);		//get the letter at location i
			int ascii = (int)letter;			//get the ascii code for the letter
			
			if(ascii == 97 || ascii == 101 || ascii == 105 || ascii == 111 || ascii ==117) {
				counter++;		//add 1 to counter
				vowels = vowels + letter + " ";
			}
			
		}
		//display output
		JOptionPane.showMessageDialog(null, input + " has " + counter + " vowels and they are " + vowels);

	}

}

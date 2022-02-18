import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ashiti
 * Date: January 2021
 * Description: A program that takes a phrase as input and does a bunch of cool stuff with it using the built in string functions
 *
 */
public class StringFun {

	public static void main(String[] args) {

		//declare initialize the required variables
		String input = "I\'m too cool for this stuff, Mr. Campos!";
		int posiTSecond = 0, posiTFirst, numF = 0, len = 0, quarterLen = 0, tryAgain = 0;

		//A friendly welcome and informative message
		JOptionPane.showMessageDialog(null, "Hiiiiiii!\nWelcome! This program is designed to do cool stuff with strings.");

		//loop for continuing to execute the program based on user's input
		while (tryAgain == 0) {

			//calculate first quarter of phrase and display result
			len = input.length();
			quarterLen = len/4;
			System.out.println("First quarter of the phrase: " + input.substring(0,quarterLen));

			//check whether the string contains at least 2 characters
			if (len >= 2) {

				//find last two characters of phrase and display result
				System.out.println("Last two characters of the phrase: " + input.substring(len - 2));

			}

			//check whether the string contains at least 7 characters
			if (len >= 7) {

				//find first seven characters of the string and display result
				System.out.println("First seven characters of the phrase: " + input.substring(0, 7));

			}

			//convert phrase into lower case and display result
			System.out.println("The phrase in lower case: " + input.toLowerCase());

			//check whether the string contains 'c'
			if(input.contains("c")) {
				//find and display the position of first 'c' in the phrase
				System.out.println("The position of the first \'c\': " + input.indexOf('c') + " from the left, counting from 0");
			}

			//find the position of the second 't' in the phrase
			posiTFirst = input.indexOf('t');
			posiTSecond = input.indexOf('t', (posiTFirst + 1));

			//this indirectly checks whether the string contains a second t
			if (posiTSecond>=0) {
				//display position of sceond t
				System.out.println("The position of second \'t\': " + posiTSecond + " from the left, counting from 0");
			}

			//check whether the string contains at least 1 'o'
			if (input.contains("o")) {

				//convert all 'o' with 'i' and display result
				System.out.println("The phrase with all the letters \'o\' replaced with \'i\': " + input.replaceAll("o", "i"));
			}

			//check whether the string contains at least 1 'f'
			if (input.contains("f")) {

				//calculating the num of letter 'f' in the phrase 
				for(int i = 0; i < input.length(); i++) {
					if (input.charAt(i) == 'f') {
						numF = numF + 1;
					}
				}

				//display result
				System.out.println("Number of letters \'f\' in the phrase: " + numF);
			}

			//ask user if they want to continue
			tryAgain = JOptionPane.showConfirmDialog(null, "Would you like to repeat the same for a customized phrase?");

			//if user wants to continue 
			if (tryAgain == 0) {
				//ask for string input
				input = JOptionPane.showInputDialog("Enter the phrase:");

				//initialize the variables to 0 again
				posiTSecond= posiTFirst = numF = len = quarterLen = tryAgain = 0;
			}
			else {
				//display a friendly gratitude message
				JOptionPane.showMessageDialog(null, "Thank you for using my program.\nHope it helped!!");
			}


		}

	}

}

/**
 * 
 */

/**
 * @author Ashii
 *Date: January 2021
 *Description: Examples for using the string class
 */
public class StringExamplles {

	
	public static void main(String[] args) {
		
		//declare the required variables
		String text = "Computer Science is a lot of fun!";
		String output;
		int len;
		
		//find and display length of text
		len = text.length();
		System.out.println(len);
		
		//convert text to upper and lower cases and display result
		output = text.toUpperCase();
		System.out.println(output);
		System.out.println(text.toLowerCase());
		
		//display character at a paticular position
		System.out.println(text.charAt(len - 1));
		
		//display character from a position to end
		System.out.println(text.substring(9));
		
		//display characters between particular positions
		System.out.println(text.substring(9,16));
		
		//replacing characters
		System.out.println(text.replaceAll("o", "i"));
		
		//displaying characters backwards(not completely)(only switching the two halves)
		String firstHalf = text.substring(0, len/2);
		String secondHalf = text.substring(len/2);
		System.out.println(secondHalf + " " + firstHalf);
		
		//counting the number of times a particular character has been repeated
		int counter = 1;
		
		for (int i = 0; i < len; i++) {
			char letter = text.charAt(i);
			
			if (letter == 'o') {
				counter++;
			}
		}
		System.out.println(counter);
	}

}

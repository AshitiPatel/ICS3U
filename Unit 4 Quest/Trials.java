import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ashii
 *
 */
public class Trials {
	
	/*long b = Math.abs(Math.round(-7.64)); 
	System.out.println(b);

	String d = "Spring";
	System.out.println(d.charAt(4));
	System.out.println(d.substring(1, 5));

	String a = "Computer Science is Awesome!";
	System.out.println(a.substring(10));
	 */

	public static void main(String[] args) {

		/*
		//declare variables for words
		String word1, word2;

		//declare variables for first characters in inputed words
		int firstCharWord1, firstCharWord2;

		//prompt user for first word
		word1 = JOptionPane.showInputDialog("Enter the first word:");

		//prompt user for second word
		word2 = JOptionPane.showInputDialog("Enter the second word:");

		//get ascii code of first letter from word 1 lowercase
		firstCharWord1 = (int) (word1.toLowerCase().charAt(0));

		//get ascii code of second letter from word 2 lowercase
		firstCharWord2 = (int) ( word2.toLowerCase().charAt(0));

		//compare the ascii codes of the first characters and display result accordingly
		if (firstCharWord1 == firstCharWord2) {
			JOptionPane.showMessageDialog(null, "Words start with the same letter");
		}
		else if (firstCharWord1 < firstCharWord2) {
			JOptionPane.showMessageDialog(null, word1 + " comes before " +  word2);
		}
		else {
			JOptionPane.showMessageDialog(null, word2 + " comes before " + word1);
		}
		*/
		
		long b = Math.abs(Math.round(-7.64)); 
		System.out.println(b);

		String d = "Spring";
		System.out.println(d.charAt(4));
		System.out.println(d.substring(1, 5));

		String a = "Computer Science is Awesome!";
		System.out.println(a.substring(10));
	}

}

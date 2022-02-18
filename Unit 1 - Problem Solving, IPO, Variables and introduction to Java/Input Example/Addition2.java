import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ashiti
 * Date: 1 December 2020
 * Description: Use dialog boxes for input
 *
 */
public class Addition2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declare and initialize variables for number and sum
		int num1 = 0, num2 = 0;
		int sum = 0;
		String name = ""; //declare and initialize variable for name
		
		//prompt and ask the user name 
		name = JOptionPane.showInputDialog(null, "Enter your name ");
		
		//prompt and get the first number
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number "));
		
		//prompt and get the second number
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number "));
		
		sum = num1 + num2; //add the numbers
		
		//Display the output in a friendly message
		JOptionPane.showMessageDialog(null, "Hello " + name + "!\n" + num1 + " + " + num2 + " = " + sum);
		
		
		
	}

}

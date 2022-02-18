import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ashii
 *Date: January 2021
 *Description: A program that displays a birthday jingle by creating a method and using it
 */
public class BirthdayJingle {

	//method to display happy birthday
	public static void sayHappy() {
		JOptionPane.showMessageDialog(null, "Happy Birthday to you!");

	}

	//method to display happy birthday with name
	public static void greeting(String name) {
		JOptionPane.showMessageDialog(null, "Happy Birthday dear " + name + "!");
	}

	//main method
	public static void main(String[] args) {

		//prompt for input
		String name = JOptionPane.showInputDialog("Enter your name:");

		//display song
		sayHappy();
		sayHappy();
		greeting(name);
		sayHappy();

	}

}

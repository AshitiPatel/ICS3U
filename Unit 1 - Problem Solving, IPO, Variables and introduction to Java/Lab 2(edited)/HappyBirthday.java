import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ashiti
 *Date: 3rd December 2020
 *Description: A program that displays the "Happy Birthday" song
 */
public class HappyBirthday {

	public static void main(String[] args) {
		
		//declare the variable for user name
		String userName;
		
		//setup keyboard for input for name
		Scanner input = new Scanner (System.in);
		
		//prompt the user and read input
		System.out.println("Enter you name ");
		userName = input.nextLine();
		
		//display the "Happy Birthday" song
		System.out.println("Happy Birthday dear " + userName + "!");
		System.out.println("Happy Birthday to you");
		System.out.println("From good friends and true "
							+ "\nFrom old ones and new "
							+ "\nHappy Birthday to you");
		System.out.println("May good luck go with you");
		System.out.println("And happiness too");
		System.out.print("Happy birthday to you!");

	}//end main method

}//end HappyBirthday class

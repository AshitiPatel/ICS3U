import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ashiti
 * Date: December 2020
 *Description: A program that displays the times table of a number(and its range) entered by the user
 */
public class FirstTimesTable 
{

	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		
		//introductory message for the user
		System.out.println("This program is designed to display the times table of the number you input.");
		
		//declare(variables), prompt and get the number and its range
		System.out.print("Enter the number: ");
		int num1 = in.nextInt();

		System.out.print("Enter the range: ");
		int num2 = in.nextInt();
		
		//check for valid input for range
		while(num2 <= 0)
		{
			System.out.print("Invalid input for range. Please enter a positive integer for range:");
			num2 = in.nextInt();
		}

		//display the result according to the input
		for (int i=0; i< num2; i++){
			System.out.println(num1 + " x " + (i+1) + " = " + 
					(num1 * (i+1)));
		
		}
	}
}


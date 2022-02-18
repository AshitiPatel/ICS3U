import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ashiti
 * Date: December 2020
 *Description: A program that displays the times table of a number(and its range) entered by the user
 *				USING ONLY ADDITION AND NOT MULTIPLICATION OPERATOR
 *
 */
public class SecondTimesTable 
{

	public static void main(String[] args) 
	{

		//declare scanner to accept values
		Scanner in = new Scanner(System.in);

		//declare variable for sum of no.
		int numAdded = 0;

		//declare variable for no. and range and prompt and take in value for number and range
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

		//display the result according to input
		for (int i=0; i< num2; i++){
			numAdded = (numAdded + num1);
			System.out.println(num1 + " x " + (i+1) + " = " + numAdded);

		}
	}
}


import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ashiti
 * Date : 30 November 2020
 * Description : Addition of two numbers entered by the user
 *
 */
public class AdditionExample 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//declare variables for name, num1, num2 and the sum
		String name = "";
				int num1 = 0, num2 = 0;
				int sum = 0;//declare and initialize sum
				
				/*
				 * setup input using the keyboard for
				 * the name
				 */
				Scanner input1 = new Scanner(System.in);
				
				//setup input for the numbers
				Scanner input2 = new Scanner(System.in);
				
				//prompt the user for their name
				System.out.println("Please enter your name:");
				name = input1.nextLine();
				
				//prompt for the two numbers and get two numbers
				System.out.println("Please enter the first number:");
				num1 = input2.nextInt();
				
				System.out.println("Please enter the second number:");
				num2 = input2.nextInt();
				
				//add the two numbers
				sum = num1 + num2;
				
				//display the output in a friendly message
				System.out.println("Hello " + name +"! The total is " + sum);
				
				//another message
				System.out.println("Hello " + name + "!\n" + num1 + " + " + num2 + " = " + sum);
				
				

	}

}

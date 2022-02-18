import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ashiti
 * Date: 5 December 2020
 * Description: Adding, Subtracting, Multiplying and Dividing two numbers
 *
 */
public class PartC_Q6 
{

	public static void main(String[] args)
	{
		//declare variables for input numbers
		int add1, add2, sub1, sub2, multi1, multi2, divide1, divide2;
		
		//declare variables for answers of addition, subtraction, multiplication and division
		int addition, subtraction, multiplication, division;
		
		//declare variable for choice
		int choice;
		
		//greet and inform the user
		JOptionPane.showMessageDialog(null, "Hi! This program is designed to help you with some basic math calculations.");
		
		//prompt and get choice
				choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter:\n1-To add two numbers"
						+ "\n2-To subtract two numbers"
						+ "\n3-To multiply two numbers"
						+ "\n4-To divide two numbers"
						+ "\nAny other number to do all of the above mentioned"));
		
		//decide on what choice is entered
		if (choice == 1)
		{
			//prompt and get numbers
			add1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number for addition:"));
			add2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number for addition:"));
			
			//add both numbers
			addition = add1 + add2;
			
			//display the result 
			JOptionPane.showMessageDialog(null, "The sum of " + add1 + " and  " + add2 + " is " + addition + ".");	
		}
		
		else if (choice == 2)
		{
			//prompt and get numbers 
			sub1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the minuend to be subtracted from:"));
			sub2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the subtrahend for subtraction:"));
			
			//subtract subtrahend from minuend
			subtraction = sub1 - sub2;
			
			//display the result
			JOptionPane.showMessageDialog(null, "The difference between " + sub1 + " and " + sub2 + " is " + subtraction + ".");
		}
		
		else if (choice == 3)
		{
			//prompt and get numbers
			multi1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number for multiplication:"));
			multi2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number for multiplication:"));
			
			//multiply both numbers
			multiplication = multi1 * multi2;
			
			//display the result 
			JOptionPane.showMessageDialog(null, "The product of " + multi1 + " and  " + multi2 + " is " + multiplication + ".");
		}
		
		else if (choice == 4)
		{
			//prompt and get numbers 
			divide1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the dividend to be divided:"));
			divide2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the divisor for division:"));
			
			//divide dividend by divisor
			division = divide1 / divide2;
			
			//display the result
			JOptionPane.showMessageDialog(null, "The rounded down quotient when " + divide1 + " is divided by " + divide2 + " is " + division + ".");
		}
		
		else
		{
			//**********ADDITION**********
			//prompt and get numbers
			add1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number for addition:"));
			add2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number for addition:"));
			
			//add both numbers
			addition = add1 + add2;
			
			//display the result 
			JOptionPane.showMessageDialog(null, "The sum of " + add1 + " and  " + add2 + " is " + addition + ".");	
			
			//**********SUBTRACTION**********
			//prompt and get numbers 
			sub1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the minuend to be subtracted from:"));
			sub2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the subtrahend for subtraction:"));
			
			//subtract subtrahend from minuend
			subtraction = sub1 - sub2;
			
			//display the result
			JOptionPane.showMessageDialog(null, "The difference between " + sub1 + " and " + sub2 + " is " + subtraction + ".");
			
			//**********MULTIPLICATION**********
			//prompt and get numbers
			multi1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number for multiplication:"));
			multi2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number for multiplication:"));
			
			//multiply both numbers
			multiplication = multi1 * multi2;
			
			//display the result 
			JOptionPane.showMessageDialog(null, "The product of " + multi1 + " and  " + multi2 + " is " + multiplication + ".");
			
			//**********DIVISION**********
			//prompt and get numbers 
			divide1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the dividend to be divided:"));
			divide2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the divisor for division:"));
			
			//divide the dividend by divisor
			division = divide1 / divide2; 
			
			//display the result
			JOptionPane.showMessageDialog(null, "The rounded down quotient when " + divide1 + " is divided by " + divide2 + " is " + division + ".");
		}
		
		//display a thank-you message
		JOptionPane.showMessageDialog(null, "Thank-you for using my program. Hope you liked it.");
	}//end main method
}//end class PartC_Q6













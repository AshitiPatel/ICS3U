import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ashiti
 *Date: 1 December 2020
 *Description: Calculate the area of a circle given the radius
 */
public class AreaOfCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String userName;
		// Area of circle = PI (3.14) * r squared
		double radius, area;
		final double PI = 3.1415; //declares a constant for PI
		
		//setup output for two decimal places
		DecimalFormat twoDigit = new DecimalFormat("#0.00"); //formats the output as 0.56 for example or 0.40 
		
		//Setup input for strings
		Scanner input1 = new Scanner (System.in);
		
		//prompt for the name
		System.out.println("Enter your name ");
		userName = input1.nextLine();
		
		//Setup input for radius
		Scanner input2 = new Scanner (System.in);
				
		//prompt for the radius
		System.out.println("Enter the radius ");
		radius = input2.nextDouble();
		
		area = PI * Math.pow(radius, 2); //calculate the area
		
		System.out.println("Hi " + userName + "\nThe area of the circle is " + twoDigit.format(area));
		
		
	}

}

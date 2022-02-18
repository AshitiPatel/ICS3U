import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * @author Ashiti
 * Date: 4 December 2020
 * Description: A program that calculates and displays the area and circumference of a circle and also the area and perimeter of a square and rectangle
 *
 */
public class PartB_Q5 {

	public static void main(String[] args) {

		//declare required variables
		double radius, areaC, circumC, sqSide, sqArea, sqPeri, recSide1, recSide2, recArea, recPeri;
		int choice;
		final double pi = 3.14;

		//setup output for two decimal places
		DecimalFormat twoDigit = new DecimalFormat("#0.00");

		//greet and inform the user
		JOptionPane.showMessageDialog(null, "Hi! This program is designed to help you with some math calculations. Hope you like it.");

		//prompt and get choice
		choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter: \n1-To calculate Area and Circumference of Circle"
				+ "\n2-To calculate Area and Perimeter of Square"
				+ "\n3-To calculate Area and Perimeter of rectangle"
				+ "\nAny other number to do all three"));

		//decide on what choice is entered
		if (choice ==1)
		{

			//prompt for and get radius of circle
			radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the radius of the circle in centimeter(cm):"));

			//calculate area and circumference of circle
			areaC = pi * Math.pow(radius, 2);
			circumC = 2 * pi * radius;

			//display area and circumference with formulas
			JOptionPane.showMessageDialog(null, "Then circumference and area of a circle with radius " + twoDigit.format(radius) + "cm are " + twoDigit.format(circumC) + "cm and " + twoDigit.format(areaC) + "cm^2 respectively"
					+ "\nThe formulas used for this calculation are:"
					+ "\ncircumference = 2 * pi * radius"
					+ "\narea = pi * r^2");
		}

		else if (choice == 2)
		{
			//prompt and get side of square
			sqSide = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the side of the square in centimeter(cm):"));

			//calculate the area and perimeter of square
			sqPeri = 4 * sqSide;
			sqArea = Math.pow(sqSide, 2);

			//display perimeter and area of square with formulas
			JOptionPane.showMessageDialog(null, "The perimeter and area of a square with side " + twoDigit.format(sqSide) + "cm are " + twoDigit.format(sqPeri) + "cm and " + twoDigit.format(sqArea) + "cm^2 respectively."
					+ "\nThe formulas used for this calculation are:"
					+ "\nperimeter = 4 * side"
					+ "\narea = side^2");
		}

		else if (choice == 3)
		{
			//prompt and get the sides of rectangle
			recSide1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the first side of the rectangle in centimeter(cm):"));
			recSide2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the second side of the rectangle in centimeter(cm):"));

			//calculate the area and perimeter of rectangle
			recPeri = (2 * recSide1) + (2 * recSide2);
			recArea = recSide1 * recSide2;

			//display the area and perimeter of rectangle with formulas
			JOptionPane.showMessageDialog(null, "The perimeter and area of a rectangle with sides " + twoDigit.format(recSide1) + "cm and " + twoDigit.format(recSide2) + "cm are " + twoDigit.format(recPeri) + "cm and " + twoDigit.format(recArea) + "cm^2 respectively."
					+ "\nThe formulas used for this calculation are:"
					+ "\nperimeter = (2 * Side1) + (2 * Side2)"
					+ "\narea = Side1 * Side2");
		}

		else 
		{
			//**********CIRCLE**********
			//prompt for and get radius of circle
			radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the radius of the circle in centimeter(cm):"));

			//calculate area and circumference of circle
			areaC = pi * Math.pow(radius, 2);
			circumC = 2 * pi * radius;

			//display area and circumference with formulas
			JOptionPane.showMessageDialog(null, "Then circumference and area of a circle with radius " + twoDigit.format(radius) + "cm are " + twoDigit.format(circumC) + "cm and " + twoDigit.format(areaC) + "cm^2 respectively"
					+ "\nThe formulas used for this calculation are:"
					+ "\ncircumference = 2 * pi * radius"
					+ "\narea = pi * r^2");


			//**********SQUARE**********
			//prompt and get side of square
			sqSide = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the side of the square in centimeter(cm):"));

			//calculate the area and perimeter of square
			sqPeri = 4 * sqSide;
			sqArea = Math.pow(sqSide, 2);

			//display perimeter and area of square with formulas
			JOptionPane.showMessageDialog(null, "The perimeter and area of a square with side " + twoDigit.format(sqSide) + "cm are " + twoDigit.format(sqPeri) + "cm and " + twoDigit.format(sqArea) + "cm^2 respectively."
					+ "\nThe formulas used for this calculation are:"
					+ "\nperimeter = 4 * side"
					+ "\narea = side^2");


			//**********RECTANGLE**********
			//prompt and get the sides of rectangle
			recSide1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the first side of the rectangle in centimeter(cm):"));
			recSide2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the second side of the rectangle in centimeter(cm):"));

			//calculate the area and perimeter of rectangle
			recPeri = (2 * recSide1) + (2 * recSide2);
			recArea = recSide1 * recSide2;

			//display the area and perimeter of rectangle with formulas
			JOptionPane.showMessageDialog(null, "The perimeter and area of a rectangle with sides " + twoDigit.format(recSide1) + "cm and " + twoDigit.format(recSide2) + "cm are " + twoDigit.format(recPeri) + "cm and " + twoDigit.format(recArea) + "cm^2 respectively."
					+ "\nThe formulas used for this calculation are:"
					+ "\nperimeter = (2 * Side1) + (2 * Side2)"
					+ "\narea = Side1 * Side2");
		}

		//display a friendly thank-you message	
		JOptionPane.showMessageDialog(null, "Thank-you for using my program. Hope you liked it.");
	
	}//end main method

}//end class Part_Q5



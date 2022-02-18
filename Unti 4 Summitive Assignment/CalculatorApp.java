import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author Ashiti
 * Date: January 2021
 * Description: This is a program that takes input from the user for two numbers and an operator and then does the calculations and displays result based on the input 
 *Methods List: void main(String[] arga)	-main method
 *				double calculate			-calculates the result of the math operation between two numbers given the input
 *				boolean checkInput			-checks whether the input entered is valid(a non zero character)
 */
public class CalculatorApp {

	/*
	 * Calculates the result of a math operation between two numbers based on the operator, number1 and number2 input parameters
	 */
	public static double calculate (double number1,double number2, String operator) {
		//declare and initialize variable for result
		double result = 0;
		//calculate result based on input
		if (operator.equals("+")) {
			result = number1 + number2;
		}
		else if (operator.equals("-")) {
			result = number1 - number2;
		}
		else if (operator.equals("x")) {
			result = number1 * number2;
		}
		else if (operator.equals("/")) {
			result = number1 / number2;
		}

		//return result
		return result;
	}

	/*
	 * Method that checks if the input is valid. Valid inputs have a non-zero value
	 */
	public static boolean checkInput (double input) {
		//declare variable for condition of correct/incorrect userInput
		boolean trueFalse;

		//check the input and reassign true or false to the respective variable
		if (input == 0) {
			trueFalse = true;
		}
		else {
			trueFalse = false;
		}

		//return true or false
		return trueFalse;
	}

	/**
	 * Main method: Ask user for input of two numbers and an operator. 
	 * 				then calculate the result using the methods created
	 * 
	 */
	public static void main(String[] args) {
		//declare and initialize the required variables
		double number1 = 0, number2 = 0, result = 0;
		String operator = "";
		int cont = 0;

		//display friendly welcome and informative message
		JOptionPane.showMessageDialog(null, "Hiiiii!"
				+ "\nThis app helps with basic math calculations between two numbers.");

		//loop till user decides to end
		while(cont == 0) {

			//create text fields for input
			JTextField inpNum2 = new JTextField();
			JTextField inpNum1 = new JTextField();
			JTextField inpOper = new JTextField();

			//create and initialize an array of objects
			Object[] fields = {
					"First number:", inpNum1,
					"Operator:", inpOper,
					"Second number:", inpNum2,
			};

			//display input dialog
			JOptionPane.showConfirmDialog(null, fields, "Input for calculation", JOptionPane.OK_CANCEL_OPTION);

			//store the input from user into respective variables
			number1 = Double.parseDouble(inpNum1.getText());
			number2 = Double.parseDouble(inpNum2.getText());
			operator = inpOper.getText();


			//check and prompt for valid operator input if invalid
			while(!(operator.equals("+")) && !(operator.equals("-")) && !(operator.equals("x")) && !(operator.equals("/"))) {
				JOptionPane.showConfirmDialog(null, fields, "*Enter a valid operator*", JOptionPane.OK_CANCEL_OPTION);

				//store the input from user into respective variables
				number1 = Double.parseDouble(inpNum1.getText());	//in case the user wants to change the first number too, we won't have problem
				number2 = Double.parseDouble(inpNum2.getText());	//in case the user wants to change the second number too, we won't have problem
				operator = inpOper.getText();	//stores changed operator

			}

			//check for valid input when operator is division
			while (operator.equals("/") && checkInput(number2)) {

				//prompt for valid input for second num
				JOptionPane.showConfirmDialog(null, fields, "*Denomintor can\'t be 0*", JOptionPane.OK_CANCEL_OPTION);

				//store the input from user into respective variables
				number1 = Double.parseDouble(inpNum1.getText());		//in case the user wants to change the first number too, we won't have problem 
				number2 = Double.parseDouble(inpNum2.getText());
				operator = inpOper.getText();						//in case the user wants to change the operator, we won't have problem

			}

			//warning message(only once) if num 1 < num 2 when operator is for sub or divide
			if (number1 < number2 && (operator.equals("-") || operator.equals("/"))) {
				//display warning message with a chance to change the input
				JOptionPane.showConfirmDialog(null, fields, "Warning! First number less than second", JOptionPane.OK_CANCEL_OPTION);

				//store the input from user into respective variables
				number1 = Double.parseDouble(inpNum1.getText());			//the user has an option of changing not just the second number 
				number2 = Double.parseDouble(inpNum2.getText());			//but also the first number and operator
				operator = inpOper.getText();	
			}

			//calculate result
			result = calculate(number1, number2, operator);

			//declare an object of arrays for custom button text
			Object[] options = {"Continue", "Exit",};

			//display the result and get user's input from the custom buttons
			cont = JOptionPane.showOptionDialog(null, number1 + " " + operator + " " + number2 + " = " + result ,"Calculation and Answer:",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,options,options[1]);


		}
		//a friendly ending message
		JOptionPane.showMessageDialog(null, "Hope this program could help you!!"
				+ "\nHave a great day!!");

	}

}

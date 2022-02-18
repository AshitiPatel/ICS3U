import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author Ashiti
 * Date: January 2021
 * Description: A program that calculates the salary increase of a few people
 * Methods List: 
 * 				void main(String[] args)
 * 				double calculatePercent (double salary, double inceaseRate)		 method to calculate the increase in salary which is inputed in the form of percentage
 *
 */
public class SalaryProgram {

	public static double calculatePercent (double salary, double increaseRate) {

		//declare and initialize variable for increase in salary
		double increase = (increaseRate * salary) / 100;

		return increase;		//returns increase value

	}

	/*
	 * Main Method
	 */
	public static void main(String[] args) {

		//declare and initialize the required variables
		String name = "", disp = "Congratulations!!";
		int numPeople = 0, again = 0;
		double salary = 0, percentIncrease = 0, increase = 0;

		//display friendly welcome and info message
		JOptionPane.showMessageDialog(null, "Hiiiii!"
				+ "\nThis program is designed to help you calculate the increase in people's salaries.");

		//check whether user want to enter again(doesn't matter for the first time)
		while(again == 0) {

			//ask for number of people 
			numPeople = Integer.parseInt(JOptionPane.showInputDialog("Number of people whose salary increase you would like to calculate:"));

			//check for valid input
			while(numPeople < 0) {
				//prompt for valid input
				numPeople = Integer.parseInt(JOptionPane.showInputDialog("Invalid Input!\nPlease enter a positive whole number:"));
			}

			//keep asking for input for the number of people entered by the user
			for(int i = 1; i <= numPeople; i++) {

				//create text fields for salary and percent increase input
				JTextField sal = new JTextField();
				JTextField pcInc = new JTextField();
				JTextField pNm = new JTextField();

				//create and initialize an array of objects for the display
				Object[] fields = {
						"Person name:", pNm,
						"Current salary:", sal,
						"Percent Increase:", pcInc
				};

				//prompt for input
				JOptionPane.showConfirmDialog(null, fields, "Input for person " + i, JOptionPane.OK_CANCEL_OPTION);

				//get input into respective variables
				name = pNm.getText();
				salary = Double.parseDouble(sal.getText());
				percentIncrease = Double.parseDouble(pcInc.getText());

				//check for valid input
				while (salary < 0 || percentIncrease < 0) {
					//prompt for valid input
					JOptionPane.showConfirmDialog(null, fields, "Change negative input to positive:", JOptionPane.OK_CANCEL_OPTION);

					//get input into respective variables
					name = pNm.getText();
					salary = Double.parseDouble(sal.getText());
					percentIncrease = Double.parseDouble(pcInc.getText());
				}

				//call the method for calculating the increase in the salary
				increase = calculatePercent(salary, percentIncrease);

				//putting inputed variables together for display
				disp = disp + "\n\n" + name + "\'s salary increased from $" + salary + " to $" + (increase + salary) + ".\nWhich means " + name + "\'s salary has increased by " + percentIncrease + "%, which is $" + increase + ".";

			}

			//display result
			JOptionPane.showMessageDialog(null, disp);

			//prompt and get user input whether they want to continue
			again = JOptionPane.showConfirmDialog(null, "Do you want to calculate for a different set of data?");

			//make changes to the variables accordingly if user wants to continue
			if(again == 0) {
				name = "";
				disp = "Congratulations!!";
				numPeople = 0; 
				salary = percentIncrease = increase = 0;
			}

		}

		JOptionPane.showMessageDialog(null, "Hope this program could help you!!\nHave a great day!!");

	}

}

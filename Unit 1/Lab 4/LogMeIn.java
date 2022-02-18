import javax.swing.JOptionPane;

/**
 * @author Ashiti
 * Date: December 2020
 * Description: A program that uses a dialog box to accept a password from the user, checks whether it is correct or not and displays result accordingly 
 *				Question 1(b)
 */
public class LogMeIn {

	public static void main(String[] args) 
	{
		//PART A

		//declare and initialize variables for input password and counter
		String pwInput = "";
		int counter = 1;
		String pw = "itSLIPPEDoutOFmyMIND";

		pwInput = JOptionPane.showInputDialog("Enter Password to access this Intranet:");

		//check for valid password
		while (!pwInput.equals(pw) && counter < 5)
		{
			pwInput = JOptionPane.showInputDialog("Incorrect Password! Try again:");
			counter = counter + 1;
		}

		//display result according to input received
		if (pwInput.equals(pw))
		{
			JOptionPane.showMessageDialog(null, "Password accepted.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect Password. Please contact your Network Administrator.");
		}

		//*********************************************

		//PART B

		//declare and initialize variables for actual userID and password, 
		//counter and userId and password entered by user
		String actualUserID = "p001234", actualPassword = "iAMforgetful";
		String inputUserID = "", inputPassword = "";
		int tries = 1;

		inputUserID = JOptionPane.showInputDialog("UserID:");
		inputPassword = JOptionPane.showInputDialog("Password:");

		//check for valid password and userID
		while ((!inputUserID.equalsIgnoreCase(actualUserID) || !inputPassword.equals(inputPassword)) && tries < 5)
		{
			JOptionPane.showMessageDialog(null, "Incorrect userID or password.");
			inputUserID = JOptionPane.showInputDialog("UserID:");
			inputPassword = JOptionPane.showInputDialog("Password:");
			tries = tries + 1;
		}

		//display 
		if (inputUserID.equalsIgnoreCase(actualUserID) && inputPassword.equals(inputPassword))
		{
			JOptionPane.showMessageDialog(null, "UserID and Password accepted.");
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Incorrect Password or UserID! Please contact your Network Administrator");
		}

	}
}

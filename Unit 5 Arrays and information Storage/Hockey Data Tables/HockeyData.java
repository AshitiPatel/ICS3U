import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * 
 */

/**
 * @author Ashii
 * Date: January 2021
 * Description: A program that loads the name and goals for a group of hockey players
 * Method List: static void main(String[] args)		//main method
 *
 */
public class HockeyData {

	public static void main(String[] args) {
		//declare the arrays for the data
		String playerNames[];
		int playerGoals[];

		//create the arrays with 5 elements each
		playerNames = new String [5];
		playerGoals = new int [5];

		//declare and initialize variables for the average and sum
		double average = 0, sum = 0;

		//loop for loading the information into the arrays
		for (int i = 0; i <= playerNames.length - 1; i++) {
			//prompt for the names and goals for each player
			playerNames [i] = JOptionPane.showInputDialog("Enter name for player " + (i + 1));
			playerGoals[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter name for player " + (i + 1)));

			//add goals to sum
			sum = sum + playerGoals[i];

		}
		//calculate average
		average = sum / playerNames.length;

		//create ouput list to display later
		String list = "Names\tGoals\n";
		list = list + "=====\t=====\n";

		//for loop to add the names and goals to my list above
		for (int i = 0; i <= playerNames.length - 1; i++) {
			list = list + playerNames[i] + "\t" + playerGoals[i] + "\n";
		}

		//adds the average to my list
		list = list + "The average goals are " + average;

		//create a text area for displaying
		JTextArea outputArea = new JTextArea();

		//add list to output area
		outputArea.setText(list);

		//make area not editable and tab size 15
		outputArea.setEditable(false);
		outputArea.setTabSize(15);

		//display the outputArea in the dialog box
		JOptionPane.showMessageDialog(null, outputArea);

	}

}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * 
 */

/**
 * @author Ashiti
 * Date: January 2021
 * Description: A program that loads the name and goals for a group of hockey players form a text file and then writes more information into another file
 * Method List: static void main(String[] args)		//main method
 *
 */
public class HockeyDataFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		//declare the arrays for the data
				String playerNames[];
				int playerGoals[];

				//create the arrays with 5 elements each
				playerNames = new String [5];
				playerGoals = new int [5];

				//declare and initialize variables for the average and sum
				double average = 0, sum = 0;
				
				//open the file to read
				FileReader fileR = new FileReader("hockey.txt"); 
				BufferedReader input = new BufferedReader(fileR);

				//loop for loading the information into the arrays
				for (int i = 0; i <= playerNames.length - 1; i++) {
					//read names and goals for each player from the file
					playerNames [i] = input.readLine();
					playerGoals[i] = Integer.parseInt(input.readLine());

					//add goals to sum
					sum = sum + playerGoals[i];

				}
				
				//closes the link to the file
				fileR.close();
				
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
				
				//open a new file to write to
				FileWriter fileW = new FileWriter("hockerFormatted.txt");
				PrintWriter output = new PrintWriter(fileW);
				
				//loop to write each item to the file
				for  (int i = 0; i < playerGoals.length; i++) {
					output.println("Names: " + playerNames[i] + " Goals: " + playerGoals[i]);
				}
				output.println("The average goals is " + average);
				
				//write to the file
				fileW.close();
				
				JOptionPane.showMessageDialog(null, "hockeyFormatted.txt has been saved");
				
	}

}

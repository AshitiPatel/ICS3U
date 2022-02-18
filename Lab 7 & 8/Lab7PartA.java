import java.text.DecimalFormat;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author Ashiti
 * Date: January 2021
 * Description:A program that calculates the overall percent of courses inputed by the user along with the marks
 * Method List: static void main(String[] args) 		//main method 
 *
 */
public class Lab7PartA {

	public static void main(String[] args) {

		//declare and initialize the required variables
		int numCourses = 0, result = 0;
		double totalMarks = 0, overallPercent = 0;
		String list = "Course\tMark\n======\t====\n";

		//declare arrays for course names and marks
		String courseCode[];
		Double courseMark[];

		//display a friendly welcome message
		JOptionPane.showMessageDialog(null, "Welcome!!\nThis program helps you calculate your overall percent.");

		//prompt and get number of courses
		numCourses = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of courses:","6"));

		//check input for number of courses and prompt if invalid
		while(numCourses <= 0) {
			numCourses = Integer.parseInt(JOptionPane.showInputDialog("Please enter positive number of courses:","6"));
		}

		//create arrays for course names and marks
		courseCode = new String [numCourses];
		courseMark = new Double [numCourses];

		//create text field for input
		JTextField txtCourseCode = new JTextField(10);
		JTextField txtCourseMark = new JTextField(3);

		//creating and formatting JPanel
		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel("Course Code:"));
		myPanel.add(txtCourseCode);
		myPanel.add(Box.createHorizontalStrut(15)); // a spacer
		myPanel.add(new JLabel("Course Mark:"));
		myPanel.add(txtCourseMark);

		//prompt and get course names and marks
		for(int i = 0; i < numCourses; i++) {

			result = JOptionPane.showConfirmDialog(null, myPanel, 
					"For course " + (i+1) +" please enter:", JOptionPane.OK_CANCEL_OPTION);

			if (result == JOptionPane.OK_OPTION) {

				courseCode[i] = txtCourseCode.getText();
				courseMark[i] = Double.parseDouble(txtCourseMark.getText());

				//check for valid input for course mark
				while (courseMark[i] < 0 || courseMark[i] > 100) {

					courseMark[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter mark from 0-100:"));
				}

				//create output list to display later
				list = list + courseCode[i] + "\t" + courseMark[i] + "\n"; 

				//calculate sum 
				totalMarks = totalMarks + courseMark[i];

				//clear text fields
				txtCourseCode.setText("");
				txtCourseMark.setText("");

			}
			else {
				i = i + numCourses;
			}

		}

		if (result == JOptionPane.OK_OPTION) {

			//calculate overall percent
			overallPercent = totalMarks / numCourses;

			//creating decimal format for displaying overall percent
			DecimalFormat twoDecimals = new DecimalFormat("0.00");

			//add in overall percent ad highest marks (with courses) for final display
			list = list + "The wait is over!! Your overall percentage is " + twoDecimals.format(overallPercent) + "%.";		

			//create a text area for displaying
			JTextArea outputArea = new JTextArea();

			//add list to output area
			outputArea.setText(list);

			//make area not editable and tab size 15
			outputArea.setEditable(false);
			outputArea.setTabSize(15);

			//display the outputArea in the dialog box
			JOptionPane.showMessageDialog(null, outputArea);

			//display a friendly message
			JOptionPane.showMessageDialog(null, "Thank you for using my program!\nHope it could help you.\nUntil next time!!");

		}

		else {
			JOptionPane.showMessageDialog(null, "Ending program....Sorry this program was unable to help you");
		}

	}

}

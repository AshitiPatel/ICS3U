import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
 * Description: A program that takes input from files for course codes and course marks and displays it and saves it in separate files(based on user choices)
 *Method List: static void display (String displayData)		//Method to display the information in a JTextArea
 *				static int findCourseCode(String arrayCourses[], String searchKey)		//Method to search for a course code within the string array
 *																						  a linear search method
 *				static void main(String[] args) throws IOException 		//main method
 */
public class Lab7PartB {

	/*
	 * Method to display the information in a JTextArea
	 */
	public static void display (String displayData) {
		//create a text area for displaying
		JTextArea outputArea = new JTextArea();

		//creating variable for color
		Color color = new Color(30, 225, 226); 

		//Set JTextArea background color to color that you choose  
		outputArea.setBackground(color);

		//add list to output area
		outputArea.setText(displayData);

		//make area not editable and tab size 15
		outputArea.setEditable(false);
		outputArea.setTabSize(9);

		//display the outputArea in the dialog box
		JOptionPane.showMessageDialog(null, outputArea);

	}

	/*
	 * Method to search for a course code within the string array
	 * A linear search method
	 */
	public static int findCourseCode(String arrayCourses[], String searchKey) {
		//loop through my array to find the search
		for (int i = 0; i < arrayCourses.length; i++) {
			//check if the searchKey is equal to the name at the  location i
			if(arrayCourses[i].equalsIgnoreCase(searchKey)) {
				//this returns the location index
				return i;
			}
		}
		//return invalid index because course code not found
		return -1;

	}


	/*
	 * Main method
	 */
	public static void main(String[] args) throws IOException {

		//declare the arrays for the data
		String courseCode[];
		double courseMark[], courseAimedMark[];

		//declare and initialize required variables
		double totalMarks = 0, overallPercent = 0, totalAimedMarks = 0;
		int wantTo = 0, numCourses = 0, saveFile = 0;
		String search = "", firstFileName = "", secondFileName = "";

		//try for errors
		try {

			//display a friendly welcome plus info message
			JOptionPane.showMessageDialog(null, "Hiiiiiii!!\nThis program is designed to help you calculate\nyour overall percentage from the files you input.", "Welcome!!!!", JOptionPane.INFORMATION_MESSAGE);

			//take input for files
			//create text field for input of file names
			JTextField txtFirstFile = new JTextField(13);
			JTextField txtSecondFile = new JTextField(13);

			//creating and formatting JPanel
			JPanel myPanel = new JPanel();
			myPanel.add(new JLabel("File with course code and marks:"));
			myPanel.add(txtFirstFile);
			myPanel.add(Box.createHorizontalStrut(15)); // a spacer
			myPanel.add(new JLabel("File containing aimed marks data:"));
			myPanel.add(txtSecondFile);

			//prompt and get files
			JOptionPane.showMessageDialog(null, myPanel, "Input File Names", JOptionPane.INFORMATION_MESSAGE);

			//store user input for file names from text fields to respective variables
			firstFileName = txtFirstFile.getText();
			secondFileName = txtSecondFile.getText();

			//open the files to read
			FileReader fileReadFirst = new FileReader(firstFileName); 
			BufferedReader inputFirst = new BufferedReader(fileReadFirst);

			FileReader fileReadAim = new FileReader(secondFileName); 
			BufferedReader inputAim = new BufferedReader(fileReadAim);

			//read and get the number of courses from first line of first file
			numCourses = Integer.parseInt(inputFirst.readLine());

			//create the arrays with numCourses elements each
			courseCode = new String [numCourses];
			courseMark = new double [numCourses];
			courseAimedMark = new double [numCourses];

			//loop for loading the information into the arrays
			for (int i = 0; i < courseCode.length; i++) {
				//read course code, marks and aimed marks from respective files
				courseCode[i] = inputFirst.readLine();
				courseMark[i] = Double.parseDouble(inputFirst.readLine());
				courseAimedMark[i] = Double.parseDouble(inputAim.readLine());

				//add scored marks 
				totalMarks = totalMarks + courseMark[i];
				totalAimedMarks = totalAimedMarks + courseAimedMark[i];

			}

			//closes the link to the files
			fileReadFirst.close();
			fileReadAim.close();

			//calculate the overall percent
			overallPercent = totalMarks / courseCode.length;

			//create output list to display later
			String list = "\tDATA TABLE\n\nCourse\tMark Achieved\tMark Aimed\n"
					+ "======\t===========\t=========\n";

			//for loop to add course codes and marks to my list above
			for(int i = 0; i < courseCode.length; i++) {
				list = list + courseCode[i] + "\t" + courseMark[i] + "\t" + courseAimedMark[i] + "\n";
			}

			//creating decimal format for displaying overall percent
			DecimalFormat twoDecimals = new DecimalFormat("0.00");

			//adding total marks to list
			list = list + "\t-------------------\t----------------\n";
			list = list + "\t" + totalMarks + "\t" + totalAimedMarks + "\n\n";

			//adds the overall mark to my average
			list = list + "The wait is over!! Your overall percentage is " + twoDecimals.format(overallPercent) + "%.";

			//display the list by calling the method display
			display(list);

			//open a new file to write to
			FileWriter fileW = new FileWriter("outputFile.txt");
			PrintWriter output = new PrintWriter(fileW);

			//loop to write each item to the file
			for  (int i = 0; i < courseCode.length; i++) {
				output.println("Course Code: " + courseCode[i] + " Mark Achieved: " + courseMark[i] + " Mark Aimed: " + courseAimedMark[i]);
			}
			output.println("Wait is over!!The overall percentage is " + twoDecimals.format(overallPercent) + "%");

			//write to the file
			fileW.close();

			//display a message to the user informing the info has been saved
			JOptionPane.showMessageDialog(null, "The information has been saved in outputFile.txt");

			//**************************************************

			//ask user if they want to search
			wantTo = JOptionPane.showConfirmDialog(null, "Would you like to search for the information\nabout a specific course?", "Course Specific Data Search", JOptionPane.YES_NO_OPTION);

			//if condition if user wants to search
			if (wantTo == JOptionPane.YES_OPTION) {
				//prompt and get course code
				search = JOptionPane.showInputDialog(null, "Please enter the Course Code:");

				//declare a variable for location where the course code is found
				int location = findCourseCode(courseCode, search);

				//check if name to find is found
				if(location < 0) {
					JOptionPane.showMessageDialog(null, "Sorry! The course code \'" + search + "\' is not found.", "Course Specific Data Search", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null,"Data availabe for " + search + ":\nAchieved Mark: " + courseMark[location] +"\nAimed Mark: " + courseAimedMark[location], "Course Specific Data Search", JOptionPane.INFORMATION_MESSAGE);
				}

			}

			//***************************************************

			//ask user if they want to sort data in ascending order of marks achieved
			wantTo = JOptionPane.showConfirmDialog(null, "Would you like to organize the data in ascending order of Marks Achieved?", "Ascending Order Data Sort", JOptionPane.YES_NO_OPTION);

			if(wantTo == JOptionPane.YES_OPTION) {

				//sorting in ascending order according to marks achieved
				for (int i = 0; i < courseCode.length; i++) {
					for(int j = 0; j < courseCode.length - 1; j++) {

						if (courseMark[j] > courseMark[j + 1]) {
							//swap the elements of achieved marks
							double tempMarks = courseMark[j];
							courseMark[j] = courseMark[j + 1];
							courseMark[j+1] = tempMarks;

							//swap elements of aimed marks
							double tempAimedMarks = courseAimedMark[j];
							courseAimedMark[j] = courseAimedMark[j + 1];
							courseAimedMark[j + 1] = tempAimedMarks;

							//swap elements of course code
							String tempCourseCode = courseCode[j];
							courseCode[j] = courseCode[j + 1];
							courseCode[j + 1] = tempCourseCode;
						}
					}
				}

				//reinitialize output list to display again
				list = "MARKS ACHIEVED SORTED IN ASCENDING ORDER\n\nCourse\tMark Achieved\tMark Aimed\n"
						+ "======\t===========\t=========\n";

				//for loop to add course codes and marks to my list above
				for(int i = 0; i < courseCode.length; i++) {
					list = list + courseCode[i] + "\t" + courseMark[i] + "\t" + courseAimedMark[i] + "\n";
				}

				//adding total marks to list
				list = list + "\t-------------------\t----------------\n";
				list = list + "\t" + totalMarks + "\t" + totalAimedMarks + "\n\n";

				//adds the overall mark to my average
				list = list + "The wait is over!! Your overall percentage is " + twoDecimals.format(overallPercent) + "%.";

				//display the list by calling the method display
				display(list);

				//ask user if they want to save sorted data
				saveFile = JOptionPane.showConfirmDialog(null, "Would you like to save the newly organized data in a seperate file?", "File for Data Sorted in Ascending Order", JOptionPane.YES_NO_OPTION);

				if (saveFile == JOptionPane.YES_OPTION) {

					//displaying the sorted information into a new file
					//open a new file to write to
					FileWriter fileWriteAscending = new FileWriter("outputSortedAscendingOrder.txt");
					PrintWriter outputAscendFile = new PrintWriter(fileWriteAscending);

					//loop to write each item to the file
					for  (int i = 0; i < courseCode.length; i++) {
						outputAscendFile.println("Course Code: " + courseCode[i] + " Mark Achieved: " + courseMark[i] + " Mark Aimed: " + courseAimedMark[i]);
					}
					outputAscendFile.println("Wait is over!!The overall percentage is " + twoDecimals.format(overallPercent) + "%");

					//write to the file
					fileWriteAscending.close();

					//display a message to the user informing the info has been saved
					JOptionPane.showMessageDialog(null, "The information has been saved in outputSortedAscendingOrder.txt", "Information Saved", JOptionPane.INFORMATION_MESSAGE);

				}
			}

			//**************************************************

			//ask user if they want to sort data in alphabetical order
			wantTo = JOptionPane.showConfirmDialog(null, "Would you like to organize the data in alphabetical order of Course Code?", "Alphabetical Order Data Sort", JOptionPane.YES_NO_OPTION);

			if (wantTo == JOptionPane.YES_OPTION) {

				//sorting in alphabetical order
				for (int i = 0; i < courseCode.length; i++) {
					for(int j = 0; j < courseCode.length - 1; j++) {
						if(0 < (courseCode[j].compareToIgnoreCase(courseCode[j + 1]))) {

							//swap the elements in courseCodes
							String tempCourseCode = courseCode[j];
							courseCode[j] = courseCode[j + 1];
							courseCode[j + 1] = tempCourseCode;

							//swap elements in courseMark
							double tempMarks = courseMark[j];
							courseMark[j] = courseMark[j + 1];
							courseMark[j+1] = tempMarks;

							//swap elements of aimed marks
							double tempAimedMarks = courseAimedMark[j];
							courseAimedMark[j] = courseAimedMark[j + 1];
							courseAimedMark[j + 1] = tempAimedMarks;

						}
					}
				}

				//reinitialize output list to display again
				list = "       DATA SORTED IN ALPHABETICAL ORDER\n\nCourse\tMark Achieved\tMark Aimed\n"
						+ "======\t===========\t=========\n";

				//for loop to add course codes and marks to my list above
				for(int i = 0; i < courseCode.length; i++) {
					list = list + courseCode[i] + "\t" + courseMark[i] + "\t" + courseAimedMark[i] + "\n";
				}

				//adding total marks to list
				list = list + "\t-------------------\t----------------\n";
				list = list + "\t" + totalMarks + "\t" + totalAimedMarks + "\n\n";

				//adds the overall mark to my average
				list = list + "The wait is over!! Your overall percentage is " + twoDecimals.format(overallPercent) + "%.";

				//display the list by calling the method display
				display(list);

				//ask user if they want to save sorted data
				saveFile = JOptionPane.showConfirmDialog(null, "Would you like to save the newly organized data in a seperate file?", "File for Data Sorted in Alphabetical Order", JOptionPane.YES_NO_OPTION);

				if (saveFile == JOptionPane.YES_OPTION) {

					//displaying the sorted information into a new file
					//open a new file to write to
					FileWriter fileWriteAlphabetical = new FileWriter("outputSortedAlphabeticalOrder.txt");
					PrintWriter outputAlphabeticalFile = new PrintWriter(fileWriteAlphabetical);

					//loop to write each item to the file
					for  (int i = 0; i < courseCode.length; i++) {
						outputAlphabeticalFile.println("Course Code: " + courseCode[i] + " Mark Achieved: " + courseMark[i] + " Mark Aimed: " + courseAimedMark[i]);
					}
					outputAlphabeticalFile.println("Wait is over!!The overall percentage is " + twoDecimals.format(overallPercent) + "%");

					//write to the file
					fileWriteAlphabetical.close();

					//display a message to the user informing the info has been saved
					JOptionPane.showMessageDialog(null, "The information has been saved in outputSortedAlphabeticalOrder.txt", "Information Saved", JOptionPane.INFORMATION_MESSAGE);

				}

			}

			//a friendly message
			JOptionPane.showMessageDialog(null, "Thank you for using my program!\nHope it was helpful!!\nHave a great day ahead!!", "Until next time!", JOptionPane.INFORMATION_MESSAGE);

		}
		//catching for invalid numeric characters
		catch (NumberFormatException error) {
			JOptionPane.showMessageDialog(null, "The file is corrupted. Please check its contents.", "Corrupted File", JOptionPane.INFORMATION_MESSAGE);
		}
		//catch for invalid file name
		catch (FileNotFoundException error ) {
			JOptionPane.showMessageDialog(null, "Invalid file name entered.", "File not found", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * 
 */

/**
 * @author Ashiti
 *Date: February 2021
 *Description: An application that is designed to assist the Provincial Ministers of Environment
 *in data analysis of lake water available(per land area) for provinces/territories(read from file name entered by the user).
 *Method List: static void alphabeticalSortingAndDisplay(String provinceTerritoryNames[], double waterArea[], double totalArea[], double percentWater[]) 	//Method that sorts the elements in province/territory names array in alphabetical order and swaps the elements of other arrays accordingly
 *  			static void fileLowWater(String provinceTerritoryNames[], double waterArea[], double totalArea[], double percentWater[]) throws IOException		//Method to create and save data in a file for provinces/territories with water percent < 10
 *  			static void fileHighWater(String provinceTerritoryNames[], double waterArea[], double totalArea[], double percentWater[]) throws IOException	// Method to create and save data in a file for provinces/territories with water percent > 10
 *  			static void formatAndDisplayData(String provinceTerritoryNames[], double waterArea[], double totalArea[], double percentWater[])	//Method to organize data and display it
 *  			static int findProvinceOrTerritoryName(String provinceOrTerritoryNames[] , String searchKey)	// Method to search for the name of province/territory within the string array
 *  																											//A linear search method
 *  			static double percentWaterCalculation(double waterArea, double totalArea)	// Method to calculate the percentage of water
 *  			static void main(String[] args) throws IOException		//Main Method
 */
public class ProvincialLakeWaterEnvironmentalStudy {

	/*
	 * Method to sorts and displays data according to alphabetical order of province/territory names
	 */
	public static void alphabeticalSortingAndDisplay(String provinceTerritoryNames[], double waterArea[], double totalArea[], double percentWater[]) {

		//loop for sorting
		for (int i = 0; i < provinceTerritoryNames.length; i++) {
			for(int j = 0; j < provinceTerritoryNames.length - 1; j++) {
				if(0 < (provinceTerritoryNames[j].compareToIgnoreCase(provinceTerritoryNames[j + 1]))) {

					//swap the elements for province/territory names
					String tempName = provinceTerritoryNames[j];
					provinceTerritoryNames[j] = provinceTerritoryNames[j + 1];
					provinceTerritoryNames[j + 1] = tempName;

					//swap the elements for total area
					double tempTotalArea = totalArea[j];
					totalArea[j] = totalArea[j + 1];
					totalArea[j + 1] = tempTotalArea;

					//swap the elements for water area
					double tempWaterArea = waterArea[j];
					waterArea[j] = waterArea[j + 1];
					waterArea[j + 1] = tempWaterArea;

					//swap elements for percent water
					double tempWaterPercent = percentWater[j];
					percentWater[j] = percentWater[j + 1];
					percentWater[j + 1] = tempWaterPercent;
				}	
			}
		}

		//display the sorted data by calling method formatAndDisplayData
		formatAndDisplayData(provinceTerritoryNames, waterArea, totalArea, percentWater);
	}

	/*
	 * Method to create and save data in a file for provinces/territories with water percent < 10
	 */
	public static void fileLowWater(String provinceTerritoryNames[], double waterArea[], double totalArea[], double percentWater[]) throws IOException {

		//open a new file to write to
		FileWriter fileWriteLowWater = new FileWriter("LOWWATER.txt");
		PrintWriter outputLowWaterFile = new PrintWriter(fileWriteLowWater);

		//creating decimal format for displaying percentage of water
		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		//loop to write the eligible elements in the file
		for(int i = 0; i < percentWater.length - 1; i++) {
			if(percentWater[i] < 10) {
				outputLowWaterFile.println("Province/Territory: " + provinceTerritoryNames[i] + "  Total Area(sq. km): " + totalArea[i] + "  Water Area(sq. km): " + waterArea[i] + "  Water Percent: " + oneDecimal.format(percentWater[i]) + "%");
			}
		}

		//write to the file
		fileWriteLowWater.close();
	}

	/*
	 * Method to create and save data in a file for provinces/territories with water percent > 10
	 */
	public static void fileHighWater(String provinceTerritoryNames[], double waterArea[], double totalArea[], double percentWater[]) throws IOException {

		//open a new file to write to
		FileWriter fileWriteHighWater = new FileWriter("HIGHWATER.txt");
		PrintWriter outputHighWaterFile = new PrintWriter(fileWriteHighWater);

		//creating decimal format for displaying percentage of water
		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		//loop to write the eligible elements in the file
		for(int i = 0; i < percentWater.length - 1; i++) {
			if(percentWater[i] >= 10) {
				outputHighWaterFile.println("Province/Territory: " + provinceTerritoryNames[i] + "  Total Area(sq. km): " + totalArea[i] + "  Water Area(sq. km): " + waterArea[i] + "  Water Percent: " + oneDecimal.format(percentWater[i]) + "%");
			}
		}

		//write to the file
		fileWriteHighWater.close();
	}

	/*
	 * Method to organize data and display it
	 */
	public static void formatAndDisplayData(String provinceTerritoryNames[], double waterArea[], double totalArea[], double percentWater[]) {

		//creating decimal format for displaying percentage of water
		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		//declare and initialize string that needs to be formatted to display
		String displayData = "\t\t\t\tDATA TABLE\n\n Province/Territory Name \t\t Total Area(sq.km) \t Water Area(sq.km) \t Water Percentage \n"
				+ " ======================= \t ================= \t ================= \t ================ \n";

		//loop to add data from arrays to the format above
		for (int i = 0; i < provinceTerritoryNames.length; i++) {

			//checking length of name of province or territory and adding to displayData accordingly
			if(provinceTerritoryNames[i].length() <= 12) {
				displayData = displayData + " " + provinceTerritoryNames[i] + " \t\t\t " + totalArea[i] + " \t\t " + waterArea[i] + " \t\t " + oneDecimal.format(percentWater[i]) + "%" + "\n";
			}
			else {
				displayData = displayData + " " +  provinceTerritoryNames[i] + " \t\t " + totalArea[i] + " \t\t " + waterArea[i] + " \t\t " + oneDecimal.format(percentWater[i]) + "%" + "\n";
			}
		}

		//create a text area for displaying
		JTextArea outputArea = new JTextArea();

		//creating variable for color
		Color color = new Color(30, 225, 226); 

		//Set JTextArea background color to color that you choose  
		outputArea.setBackground(color);

		//set font
		Font font = new Font("Agency FB", Font.BOLD, 14);
		outputArea.setFont(font);

		//add list to output area
		outputArea.setText(displayData);

		//make area not editable and tab size 15
		outputArea.setEditable(false);
		outputArea.setTabSize(9);

		//display the outputArea in the dialog box
		JOptionPane.showMessageDialog(null, outputArea);
	}

	/*
	 * Method to search for the name of province/territory within the string array
	 * A linear search method
	 */
	public static int findProvinceOrTerritoryName(String provinceOrTerritoryNames[] , String searchKey) {
		//loop through the array to find the searchKey
		for (int i = 0; i < provinceOrTerritoryNames.length; i++) {
			//check if the searchKey is equal to the name at the  location i
			if(provinceOrTerritoryNames[i].equalsIgnoreCase(searchKey)) {
				//this returns the location index
				return i;
			}
		}

		//return invalid index because province/territory name not found not found
		return -1;
	}

	/*
	 * Method to calculate the percentage of water
	 */
	public static double percentWaterCalculation(double waterArea, double totalArea)
	{
		//calculate water percentage
		double percentage = (waterArea / totalArea) * 100;

		//return percentage calculated
		return percentage;
	}

	/*
	 * Main method
	 */
	public static void main(String[] args) throws IOException {

		//declare the required arrays
		String nameOfProvinceOrTerritory[];
		double totalArea[], waterArea[], percentWater[];

		//declare and initialize the required variables
		String fileName = "landwater.txt", searchProvinceName = "";
		int numProvincesAndTerritories = 0, wantTo = 0, location = 0;

		//creating decimal format for displaying percentage of water
		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		//trying for errors
		try {

			//display friendly welcome message
			JOptionPane.showMessageDialog(null, "Welcome!!\nThis application is designed to assist you with data analysis during your meeting.", "Greetings", JOptionPane.DEFAULT_OPTION);

			//prompt for file name
			fileName = JOptionPane.showInputDialog("Please enter the name of the file containing the data:", fileName);

			//open the file to read
			FileReader file = new FileReader(fileName); 
			BufferedReader inputFile = new BufferedReader(file);

			//read and get the number of provinces and territories from first line of first file
			numProvincesAndTerritories = Integer.parseInt(inputFile.readLine());

			//create the arrays with the number of provinces and territories each
			nameOfProvinceOrTerritory = new String [numProvincesAndTerritories];
			totalArea = new double [numProvincesAndTerritories];
			waterArea = new double [numProvincesAndTerritories];
			percentWater = new double [numProvincesAndTerritories];

			//loop for loading the information into the arrays
			for (int i = 0; i < numProvincesAndTerritories; i++) {
				//reading data in file
				nameOfProvinceOrTerritory[i] = inputFile.readLine();
				totalArea[i] = Double.parseDouble(inputFile.readLine());
				waterArea[i] = Double.parseDouble(inputFile.readLine());

				//calculating percentage of water by using method
				percentWater[i] = percentWaterCalculation(waterArea[i] , totalArea[i]);
			}

			//close the link to the file
			file.close();

			//format and display data using method formatAndDisplayData
			formatAndDisplayData(nameOfProvinceOrTerritory, waterArea, totalArea, percentWater);

			//**************************************************SEARCH

			//ask user if they want to search
			wantTo = JOptionPane.showConfirmDialog(null, "Would you like to search for the information\nabout a specific Province/Territory?", "Province/Territory Specific Data Search", JOptionPane.YES_NO_OPTION);

			//condition if user wants to search
			if (wantTo == JOptionPane.YES_OPTION) {

				//prompt and get course code
				searchProvinceName = JOptionPane.showInputDialog(null, "Please enter the Name of the Province/Territory:", "Ontario");

				//find location of province/territory name entered by user
				location = findProvinceOrTerritoryName(nameOfProvinceOrTerritory, searchProvinceName);

				//check if name of province/territory to find is found
				if(location < 0) {
					JOptionPane.showMessageDialog(null, "Sorry! The information for \'" + searchProvinceName + "\' cannot be found.", "Province/Territory Specific Data Search", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null,"Data availabe for " + searchProvinceName + ":\nTotal Area (sq. km): " + totalArea[location] +"\nWater Area (sq. km): " + waterArea[location] + "\nWater Percentage: " + oneDecimal.format(percentWater[location]) + "%", "Province/Territory Specific Data Search", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			//**************************************************ALPHABETICAL ORDER SORT

			//ask user if they want to sort data in alphabetical order of province/territory names
			wantTo = JOptionPane.showConfirmDialog(null, "Would you like to organize the data in alphabetical order of Province/Territory names?", "Alphabetical Order Data Sort", JOptionPane.YES_NO_OPTION);

			//if user wants to sort
			if(wantTo == JOptionPane.YES_OPTION) {
				//call the method alphabeticalSortingAndDisplay that sorts and displays the data
				alphabeticalSortingAndDisplay(nameOfProvinceOrTerritory, waterArea, totalArea, percentWater);
			}

			//**************************************************DESCENDING ORDER SORT

			//ask user if they want to sort the data in descending order of water percentage
			wantTo = JOptionPane.showConfirmDialog(null, "Would you like to organize the data in descending order of percentage water?", "Descending Order Data Sort", JOptionPane.YES_NO_OPTION);

			//if user wants to sort
			if(wantTo == JOptionPane.YES_OPTION) {

				//a user friendly message
				JOptionPane.showMessageDialog(null, "This might take a while.");

				//sorting in descending order according to water percentage
				for (int i = 0; numProvincesAndTerritories > i; i--) {
					for (int j = 0; j < numProvincesAndTerritories - 1; j++) {
						if(percentWater[j] < percentWater[j+1]) {
							//swap elements for water percent
							double tempWaterPercent = percentWater[j];
							percentWater[j] = percentWater[j+1];
							percentWater[j+1] = tempWaterPercent;

							//swap the elements for province/territory names array
							String tempName = nameOfProvinceOrTerritory[j];
							nameOfProvinceOrTerritory[j] = nameOfProvinceOrTerritory[j + 1];
							nameOfProvinceOrTerritory[j + 1] = tempName;

							//swap elements for total area
							double tempTotalArea = totalArea[j];
							totalArea[j] = totalArea[j+1];
							totalArea[j+1] = tempTotalArea;

							//swap elements for water area
							double tempWaterArea = waterArea[j];
							waterArea[j] = waterArea[j+1];
							waterArea[j+1] = tempWaterArea;
						}
					}
				}

				//format and display the data by using the method formatAndDisplayData
				formatAndDisplayData(nameOfProvinceOrTerritory, waterArea, totalArea, percentWater);
			}

			//**************************************************SAVING DATA IN RESPECTIVE FILES

			//ask user if they want to save data in output files based on water percent
			wantTo = JOptionPane.showConfirmDialog(null, "Would you like to save the data into files based\non the water percentage of each province?", "Data Files", JOptionPane.YES_NO_OPTION);

			//if user selects yes option
			if(wantTo == JOptionPane.YES_OPTION) {

				//create an array of options for buttons
				String options[] = {"Low Water Availability", "High Water Availability", "Both"};

				//take user input using buttons 
				int optionChoosen = JOptionPane.showOptionDialog(null, "Based on water percentage, data can be saved in two files."
						+ "\nNote:"
						+ "\n\'Low Water Availability\' contains data of provinces/territories with less than 10% of water"
						+ "\n'High Water Availability\' contains data of provinces/territories with 10% or more of water"
						+ "\nWhich would you like to save?","Data Files", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

				//use methods to save files based on user's choice
				if(optionChoosen == 0) {
					//call method to create and save data in file
					fileLowWater(nameOfProvinceOrTerritory, waterArea, totalArea, percentWater);
					//inform the user
					JOptionPane.showMessageDialog(null, "Data for \'Low Water Availability\' has been saved in file \'LOWWATER.txt\'.", "Data Files", JOptionPane.INFORMATION_MESSAGE);
				}

				else if(optionChoosen == 1) {
					//call method to create and save data in file
					fileHighWater(nameOfProvinceOrTerritory, waterArea, totalArea, percentWater);
					//inform the user
					JOptionPane.showMessageDialog(null, "Data for \'High Water Availability\' has been saved in file \'HIGHWATER.txt\'.", "Data Files", JOptionPane.INFORMATION_MESSAGE);
				}

				else {
					//call method to create and save data for low water percent in file 
					fileLowWater(nameOfProvinceOrTerritory, waterArea, totalArea, percentWater);
					//call method to create and save data for high water percent in file
					fileHighWater(nameOfProvinceOrTerritory, waterArea, totalArea, percentWater);
					//inform the user
					JOptionPane.showMessageDialog(null,"Data for \'Low Water Availability\' has been saved in file \'LOWWATER.txt\'.\n"
							+ "Data for \'High Water Availability\' has been saved in file \'HIGHWATER.txt\'.","Data Files", JOptionPane.INFORMATION_MESSAGE);
				}
			}

			//**************************************************MAKING CHANGES TO DATA
			//ask user if they want to save data in output files based on water percent
			wantTo = JOptionPane.showConfirmDialog(null, "Would you like to update Water Area of a specific Province/Territory?", "Update Information", JOptionPane.YES_NO_OPTION);

			//if user wants to update information
			if(wantTo == JOptionPane.YES_OPTION) {
				//prompt and get course code
				searchProvinceName = JOptionPane.showInputDialog(null, "Please enter the Name of the Province/Territory:", "Ontario");

				//find location of province/territory name entered by user
				location = findProvinceOrTerritoryName(nameOfProvinceOrTerritory, searchProvinceName);

				//check if name of province/territory to find is found
				if(location < 0) {
					JOptionPane.showMessageDialog(null, "Sorry! The information for \'" + searchProvinceName + "\' cannot be found.", "Province/Territory Specific Water Area Data Modification", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					//prompt for new water area information
					waterArea[location] = Double.parseDouble(JOptionPane.showInputDialog("Please enter the new Water Area(sq. km) information for " + nameOfProvinceOrTerritory[location] + ":", waterArea[location]));

					//calculate percent water
					percentWater[location] = percentWaterCalculation(waterArea[location] , totalArea[location]);

					//display information for the user to confirm
					JOptionPane.showMessageDialog(null, "Data for " + nameOfProvinceOrTerritory[location] + ":\n"
							+"Total Area(sq. km): " + totalArea[location] + 
							"\nWater Area(sq, km): " + waterArea[location] + 
							"\nWater Percent: " + oneDecimal.format(percentWater[location]) + "%", "Province/Territory Specific Water Area Data Modification", JOptionPane.INFORMATION_MESSAGE);

					//ask user if they want to save the updated data along with other data in a file 
					int saveAgainAsFile = JOptionPane.showConfirmDialog(null, "Would you like to save the updated information along with the other data in a seperate file?", "Updated Information in File", JOptionPane.YES_NO_OPTION);

					//if user chooses yes button
					if(saveAgainAsFile == JOptionPane.YES_OPTION) {
						//prompt for file name
						String changedDataFileName = JOptionPane.showInputDialog("What would you like to name the file?");

						//open a new file to write to
						FileWriter fileWriteUpdatedData = new FileWriter(changedDataFileName);
						PrintWriter updatedDataFile = new PrintWriter(fileWriteUpdatedData);

						//loop to write the elements in the file
						for(int i = 0; i < percentWater.length - 1; i++) {
							updatedDataFile.println("Province/Territory: " + nameOfProvinceOrTerritory[i] + "  Total Area(sq. km): " + totalArea[i] + "  Water Area(sq. km): " + waterArea[i] + "  Water Percent: " + oneDecimal.format(percentWater[i]) + "%");
						}

						//close the file
						fileWriteUpdatedData.close();
					}

				}

			}

			//a friendly message
			JOptionPane.showMessageDialog(null, "Thank you for using my program!\nHope it was helpful!!\nHave a great day ahead!!", "Greetings!", JOptionPane.INFORMATION_MESSAGE);

		}
		//catch for invalid file name
		catch (FileNotFoundException error ) {
			JOptionPane.showMessageDialog(null, "Invalid file name entered.", "File not found", JOptionPane.INFORMATION_MESSAGE);
		}
		//catching for invalid numeric characters
		catch (NumberFormatException error) {
			JOptionPane.showMessageDialog(null, "The file is corrupted. Please check its contents.", "Corrupted File", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}

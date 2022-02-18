import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author Ashiti
 * Date: 4 January 2021
 * Description: A program where the user is able to enter a set of club names 
 * 				of their favourite sport, after which the program compares the clubs and 
 * 				displays the input, total points, average points and the club with highest points. 
 *
 */
public class ScoreKeeper {

	public static void main(String[] args) {
		//declare and initialize the required variables
		String clubName = "", cityName = "", userYesNo = "yes", disp = "", highestPointClubName = "", highestPointCityName = "", highestPointDisplay = "";
		int wins = 0, ties = 0, losses = 0, totalPoints = 0, numClubs = 0, sumOfTotalPoints = 0, avg = 0, highestPointWins = 0, highestPointLosses = 0, highestPointTies = 0, highestPointTotal = 0;

		//display a friendly welcome message
		JOptionPane.showMessageDialog(null, "Hi! Welcome to the Score Keeper Program.");  

		//when userYesNo is yes
		while(userYesNo.equalsIgnoreCase("yes")) {

			//getting input for the number of clubs
			numClubs = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of clubs:"));

			//check for valid input for number of clubs
			while(numClubs <= 0) {

				numClubs = Integer.parseInt(JOptionPane.showInputDialog("Invalid input!\nPlease enter a positive number of clubs:"));
			}

			//for loop for each individual set of data entry 
			for(int i = 1; i <= numClubs; i++) {
				
				//research was done from a few google searches and youtube video for taking multiple inputs in one dialog box
				
				//create text fields for club names and city names
				JTextField clNm = new JTextField();
				JTextField ctNm = new JTextField();
				JTextField win = new JTextField();
				JTextField tie = new JTextField();
				JTextField lost = new JTextField();

				//create and initialize an array of objects
				Object[] fields = {
						"Enter the name of the club:", clNm,	//label for text fields
						"Enter its home city:", ctNm,
						"Enter the number of matches won:", win,
						"Enter the number of tied matches:", tie,
						"Enter the number of matches lost:", lost

				};

				//display input dialog
				JOptionPane.showConfirmDialog(null, fields, "Input for club " + i, JOptionPane.OK_CANCEL_OPTION);

				//store input from user into respective variables
				clubName = clNm.getText();
				cityName = ctNm.getText();
				wins = Integer.parseInt(win.getText());
				ties = Integer.parseInt(tie.getText());
				losses = Integer.parseInt(lost.getText());

				//check for valid input for wins, ties and losses
				while((wins < 0) || (ties < 0) || (losses < 0)) {

					//prompt for valid input
					JOptionPane.showConfirmDialog(null, fields, "Change negative number to positive", JOptionPane.OK_CANCEL_OPTION);

					//store input from user into respective variables
					clubName = clNm.getText();
					cityName = ctNm.getText();
					wins = Integer.parseInt(win.getText());
					ties = Integer.parseInt(tie.getText());
					losses = Integer.parseInt(lost.getText());

				}//while loop end
				
				//finding the club with highest points
				if(((3*wins) + (ties*2) + (losses*0)) > totalPoints) {
					
					//reassign values to the required variables 
					highestPointClubName = clubName;
					highestPointCityName = cityName;
					highestPointWins = wins;
					highestPointTies = ties;
					highestPointLosses = losses;
					highestPointTotal = ((3*wins) + (ties*2) + (losses*0));
					
					//complete the variable for the display of highest-point-line
					highestPointDisplay = "The club " + highestPointClubName + " from " + highestPointCityName + " is the club with highest points with " + highestPointTotal + " total points, " + highestPointWins + " wins, " + highestPointTies + " ties and " + highestPointLosses + " losses.";
				}
				else
				{
					//empty
				}
				
				//calculate total points
				totalPoints = ((3*wins) + (ties*2) + (losses*0));

				//calculate the sum of all total points
				sumOfTotalPoints = sumOfTotalPoints + totalPoints;
				
				//putting inputed variables together for display 
				disp = disp + "\n" + clubName + "  " + cityName + "  " + wins + "  " + ties + "  " + losses + "  " + totalPoints;   
				avg = sumOfTotalPoints/numClubs;

			}//for loop closed

			//display result
			JOptionPane.showMessageDialog(null, "Club Name  City  Wins  Ties  Losses  Total Points" + disp + "\nAverage Point = " + avg + "\n" + highestPointDisplay);

			//***************new set of data entry??
			userYesNo = JOptionPane.showInputDialog("Do you want to use this program again?\nEnter \'yes\' if you would like to enter a new set of data:");
			
			//empty some variables and initialize some variables to 0 (helpful if user enters yes)
				wins = ties = losses = totalPoints = sumOfTotalPoints = avg = sumOfTotalPoints = highestPointWins = highestPointTies = highestPointLosses = highestPointTotal = numClubs = 0;
				clubName = cityName = highestPointClubName = highestPointCityName = disp = highestPointDisplay = "";
			
		}//largest while loop closed

		//display a user friendly gratitude message
		JOptionPane.showConfirmDialog(null,"Thank-you for using my program!\nHope you liked it!" ,"Greetings", JOptionPane.PLAIN_MESSAGE);

	}//main method closed

}//class ScoreKeeper closed

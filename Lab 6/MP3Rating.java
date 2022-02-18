/**
 * 
 */

/**
 * @author Ashiti
 * Date: January 2021
 * Description: A program that rates the quality of an mp3 file
 * Methods List: 
 * 				void main(String[] args)
 * 				void displaySignature() 	displays a formatted message
 * 				double computeMP3Rating(int song, int encoding)		function that returns a rating based on the formula in the function
 * 				int checkInteger(int userInput, int minimum, int maximum)		method to check if rating is within the limit of minimum and maximum
 *
 */
public class MP3Rating {

	//displays a formatted message
	public static void displaySignature() {
		// display a signature
		IO.display ("*******************************************\n"
				+"ANOTHER WONDERFUL APPLICATION   \n"
				+"                                \n"
				+"               By: Ashiti Patel         \n"
				+"*******************************************");
	}

	//function that returns a rating based on the formula in the function
	public static double computeMP3Rating(int song, int encoding) {

		//declare a variable for rating
		double rating;

		// calculate the mp3 rating
		rating = (song + encoding) / 2.0;

		//return rating
		return rating;
	}

	//check for valid user input. if not valid, keeps asking for new input till valid input entered. if valid, returns the input entered by the user.
	public static int checkInteger(int userInput, int minimum, int maximum) {

		//check whether input entered is valid. if invalid, prompt for valid input till valid input entered.
		while ((userInput < minimum) || (userInput > maximum)) {
			userInput = IO.readInt("\t*** Error. Number must be in range 1..10. Please try again.");
		}

		//return valid input
		return userInput;
	}

	public static void main(String[] args) {

		// variables
		int ratingOfSong = 0, ratingOfEncoding = 0; // hold user input
		double overallRating; // holds the rating of the mp3 file
		String fileName; // holds the name of the mp3 file

		// call displaySignature method to display a signature
		displaySignature();

		// display a description        
		IO.display ("This program will compute a rating for an mp3 file.");

		//prompt and get the file name
		fileName = IO.readString("Please enter the name of the mp3 file: ");

		// get the song rating
		ratingOfSong = IO.readInt("Enter a rating for the song in " + fileName + " (1-10): ");

		//call method to check if rating is within limit of 1-10
		ratingOfSong = checkInteger(ratingOfSong, 1, 10);


		// get the MP3 quality rating
		ratingOfEncoding = IO.readInt("Enter a rating for mp3 quality of " + fileName + " (1-10): ");

		//call method to check if rating is within limit of 1-10
		ratingOfEncoding = checkInteger(ratingOfSong, 1, 10);

		//call method to calculate overall rating 
		overallRating = computeMP3Rating(ratingOfSong, ratingOfEncoding);

		//display overall rating
		IO.display(fileName + " has an overall rating of: " + overallRating);

		// call displaySignature method to display a signature
		displaySignature();

	} // main method

} // MP3_Rating_Not_Modular




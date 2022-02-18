import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ashiti
 * Date: December 2020
 * Description: A program helps the user count the number of students in a class
 *
 */
public class CountingItems 
{

	public static void main(String[] args) 
	{
		//declare and initialize variable for student name and counter
		String name = "";
		int counter = 0;

		//declare scanner
		Scanner scan = new Scanner(System.in);

		//display a friendly intro message for user
		System.out.println("Helloooooo there!!");
		System.out.println("This program helps you calculate the number of students in a class.");
		System.out.println("All you have to do is keep entering the name of the students in the class.");
		System.out.println("And to get the number of students, input \'THAT'S ALL\'(lower case also accepted)");

		//prompt and get student names while name is not equal to 'THAT'S ALL'
		while (counter >= 0 && !name.equalsIgnoreCase("THAT'S ALL"))
		{
			System.out.println("Enter student name: ");
			name = scan.nextLine();

			if (!name.equalsIgnoreCase("THAT'S ALL"))
			{
				counter = counter + 1;
			}
			else 
			{
				//display number of students according to input
				System.out.println("The number of students in the class is " + counter + ".");
			}
		}
	}

}

import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ashiti
 * Date: December 2020
 * Description: A program that displays the lyrics of a song using loops
 *
 */
public class SongLyrics 
{

	public static void main(String[] args) 
	{
		
		//declare scanner to accept values
		Scanner scan = new Scanner(System.in);
		
		//declare variable for keyword, prompt and get keyword
		System.out.println("Enter the keyword for the song: ");
		String keyword = scan.nextLine();
		
		//display the song according to input
		System.out.println("Because you know,");
		
		for (int i = 1 ; i <= 6 ; i++)	//displays lyrics 5 times
		{
			System.out.print("I'm all ");	//displays once in each line
			
			for (int j = 1 ; j <= 4 ; j++)
			{
				System.out.print("about that " + keyword +", ");	//displays 4 times in same line
			}
			
			System.out.println("no trouble,");
		}
		System.out.print("Yeah it’s pretty clear, I can do all that " + keyword + "ing now...");	
	}

}

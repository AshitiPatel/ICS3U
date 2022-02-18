import javax.swing.JOptionPane;

/**
 * @author Ashiti
 * Date: December 2020
 * Description: Display stars pattern
 *
 */
public class DisplayStars 
{
	public static void main(String[] args) 
	{
		
		JOptionPane.showMessageDialog(null, "This is the basic stars display program");
		String stars = ""; 
		
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 10; j++)
			{
				stars = stars + "*";
			}
			stars = stars + "\n";
		}
		IO.display(stars);
		
		//Modified version of the above nested loop
		JOptionPane.showMessageDialog(null, "This is the modified stars display program");
		
		//declare and initialize variables
		int modiStars = IO.readInt("How many stars do you want to display in a line?");
		int modiLines = IO.readInt("How many lines do you want?");
		
		for ( int x = 1; x <= modiLines; x++)
		{
			for (int y = 1; y <= modiStars; y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

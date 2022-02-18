import javax.swing.JOptionPane;

/**
 * @author Ashiti
 *Date: December 2020
 *Description: Examples for 'for loops'
 */
public class ForLoopExamples 
{

	public static void main(String[] args) 
	{
		//while loop
		int i = 1;
		
		while (i <= 10) 
		{
			System.out.println(i);
			i = i + 1;
		}
		
		System.out.println("While loop ends");
		
		//for loop that is equivalent to the above while loop 
		
		//declare and initialize variables
		 int start = IO.readInt("Enter the start number:");
		 int stop = IO.readInt("Enter the stop number");
		 for(int j = start ; j < stop; j++)
		 {
			 System.out.println(j);
		 }
		 
		 //another for loop example
		 System.out.println("\nAnother for loop example");
		 
		//declare and initialize variables
		 int begin = IO.readInt("Enter the start number for 2nd for loop:");
		 int end = IO.readInt("Enter the stop number for 2nd for loop");
		 for(int x = begin ; x < end + 2; x = x + 2)
		 {
			 System.out.println(x);
		 }
		 
		 
		 //decrement for loop example
		 System.out.println("\nDecrement for loop example");
		 
		//declare and initialize variables
		 int decreBegin = IO.readInt("Enter the start number for 3rd for loop:");
		 int decreEnd = IO.readInt("Enter the stop number for 3rd for loop");
		 
		 for(int y = decreBegin; y >= decreEnd; y = y - 1 )
		 {
			 System.out.println(y);
		 }
		 
	}

}

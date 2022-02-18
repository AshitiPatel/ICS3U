import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ashii
 * Date: January 2021
 * Description: Another example program for arrays that displays the marks
 *
 */
public class StudentMarks {

	
	public static void main(String[] args) {
		
		//declare and create an array of 6 elements
		double marks[] = new double[6];

		marks[0] = 67;
		marks[1] = 87;
		marks[2] = 86.5;
		marks[3] = 45.6;
		marks[4] = 98;
		marks[5] = 100;
		
		//declare and initialize string for displaying output
		String output = "";
		
		//loop for adding marks to output 
		for(int i = 0; i < marks.length; i++) {
			output = output + marks[i] + "\n";
		}
		
		//display output
		JOptionPane.showMessageDialog(null, "output");

	}

}
 
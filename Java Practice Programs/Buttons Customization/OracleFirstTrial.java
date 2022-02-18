import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Tathya
 *
 */
public class OracleFirstTrial {

	public static void main(String[] args) {
		//Custom button text
		Object[] options = {"Yes, please",
				"No, thanks",
		"No eggs, no ham!"};
		int n = JOptionPane.showOptionDialog(null,
				"Would you like some green eggs to go "
						+ "with that ham?",
						"A Silly Question",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						options,
						options[2]);
		
		System.out.println(n);
		
		//i found that 0 is for first option,
		//			   1 is for second option;
		//			   2 is for third option;
		
	}

}

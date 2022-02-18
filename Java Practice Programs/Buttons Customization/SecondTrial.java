import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource; 

/**
 * 
 */

/**
 * @author Tathya
 *
 */
public class SecondTrial {

	public static void main(String[] args) {
		
		//(by me)the number in the end is for changing the size of the font
		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("ARIAL",Font.PLAIN,15))); 
		
		JOptionPane.showMessageDialog(null, "Hello! Hope this has worked");

	}

}

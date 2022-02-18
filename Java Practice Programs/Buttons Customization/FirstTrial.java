import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author Tathya
 *
 */
public class FirstTrial {

	public static void main(String[] args) {
		
		//added by me
		final String strTitle = "", strMessage = "";
		
		
		 //Redone for larger OK button
        JOptionPane theOptionPane = new JOptionPane(strMessage,JOptionPane.INFORMATION_MESSAGE);
        JPanel buttonPanel = (JPanel)theOptionPane.getComponent(1);
       // get the handle to the ok button
       JButton buttonOk = (JButton)buttonPanel.getComponent(0);
       // set the text
       buttonOk.setText(" OK ");
       buttonOk.setPreferredSize(new Dimension(100,50));  //Set Button size here
       buttonOk.validate();
       JDialog theDialog = theOptionPane.createDialog(null,strTitle);
       theDialog.setVisible(true);  //present your new optionpane to the world.

	}

}

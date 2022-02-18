import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author Ashii
 *
 */
public class GUIExamples extends JFrame implements ActionListener {

	JLabel lblMessage, lblPic; 	//declaring the labels, buttons and text fields
	JTextField txtInput;
	JButton btnReverse;
	JButton btnClear;
	
	/*
	 * This is to constructor to build the window
	 */
	public GUIExamples() {
		
		super("Palindrome GUI");
		
		//creates(initializes) the label
		lblMessage = new JLabel("Enter a phrase");
		lblPic = new JLabel(new ImageIcon("smile.jpg"));
		
		//create the text fields
		txtInput = new JTextField("Default you want to put");
		
		//create buttons
		btnReverse = new JButton("Reverse the String");
		btnClear = new JButton("Clear");
		
		//set the layout of the window
		setLayout(null);
		setSize(350, 250);
		
		//place the components
		lblMessage.setBounds(10, 10, 100, 15);
		add(lblMessage);
		
		lblPic.setBounds(135, 125, 60, 60);
		add(lblPic);
		
		txtInput.setBounds(110, 10, 200, 25);
		add(txtInput);
		
		btnReverse.setBounds(10, 95, 120, 25);
		add(btnReverse);
		
		btnClear.setBounds(145, 95, 80, 25);
		add(btnClear);
		
		//add the listeners for our GUI
		btnReverse.addActionListener(this);
		btnClear.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}//ends constructor
	
	public void actionPerformed (ActionEvent evt) {
		
		if (evt.getSource() == btnReverse) {
			String phraseIn = "", phraseOut = "";
			
			//get text from text field
			phraseIn = txtInput.getText();
			phraseOut = StringProcessorDuplicate.reverseWord(phraseIn);
			
			JOptionPane.showMessageDialog(null, phraseOut);
		}
		else if (evt.getSource() == btnClear) {
			txtInput.setText("");
		}
	}
	
	

	public static void main(String[] args) {
		
		new GUIExamples();
		
		

	}

}

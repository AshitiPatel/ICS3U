
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
 
public class JTextAreaFontandColour extends JFrame {
 
    JTextArea txt = new JTextArea();
 
    public JTextArea txtColour(String text) {
 
        setLayout(null);
 
        txt.setBounds(3, 3, 300, 200);
        add(txt);
 
        Font font = new Font("Verdana", Font.BOLD, 12);
        txt.setFont(font);
        txt.setForeground(Color.BLUE);
 
        txt.setText(text);
        
        JOptionPane.showMessageDialog(null, txt);
		return txt;
        
        
    }
 
 
    public static void main(String[] args) {
 
    	String inpText = JOptionPane.showInputDialog("Input String:");
    	
    	
    	JTextAreaFontandColour jtxt = new JTextAreaFontandColour();
        jtxt.setSize(313,233);
        jtxt.setTitle("JTextArea font & color settings");
        jtxt.show();
 
    }
} 


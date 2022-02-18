    import javax.swing.JTextArea;  
    import javax.swing.JFrame;  
      
    import java.awt.Color;
import java.awt.Font;  
      
    public class SetJTextAreaBackgroundColour  
    {  
    public static void main(String[]args)  
    {  
     //Create text area using JTextArea  
     JTextArea textArea=new JTextArea();  
      
     //Create JFrame with title ( Set JTextArea background color )  
     JFrame frame=new JFrame("Set JTextArea background color");  
      
     //Set color base on RGB  
     //You can get RGB value for your color at "Color picker" at above  
     //R=255  
     //G=0  
     //B=0  
     Color color=new Color(255,0,0);  
      
     //Set JTextArea background color to color that you choose  
     textArea.setBackground(color);  
      
     //Add JTextArea into JFrame  
     frame.add(textArea);  
      
     //Set default close operation for JFrame  
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
      
     //Set JFrame size  
     frame.setSize(500,300); 
       
     //Make JFrame visible  
     frame.setVisible(true);  
    }  
    }  

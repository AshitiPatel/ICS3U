import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Ashii
 * Date: January 2021
 * Description: This calculates the area of a circle given the radius
 */
public class AreaOfCircle {

	public static double calcCircleArea (double radius) {

		//declares a local variable area
		double area;

		//calculates area
		area = Math.PI * Math.pow(radius, 2);

		//returns area
		return area;

	}

	public static void main(String[] args) {

		double rad, area;

		//prompt for radius
		rad = Double.parseDouble(JOptionPane.showInputDialog("Enter the first radius:"));
		area = calcCircleArea(rad);		//calculates area
		JOptionPane.showMessageDialog(null, "The area of the first circle is " + area);		//display result

		//prompt for the second radius
		rad = Double.parseDouble(JOptionPane.showInputDialog("Enter the second radius:"));
		area = calcCircleArea(rad);		//calculates area
		JOptionPane.showMessageDialog(null, "The area of the first circle is " + area);		//display result

		//prompt for third radius
		rad = Double.parseDouble(JOptionPane.showInputDialog("Enter the third radius:"));
		area = calcCircleArea(rad);		//calculates area
		JOptionPane.showMessageDialog(null, "The area of the first circle is " + area);		//display result

	}

}

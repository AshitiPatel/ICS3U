/**
 * 
 */

/**
 * @author Ashii
 * Date: January 2021
 * Description: Examples for using different math functions
 *
 */
public class MathFunctionsExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, y, angleDeg, angleRad, sine, cos;
		
		x= 4;
		
		//using math abstract function
		y = Math.abs(x);
		System.out.println(y);
		
		// rounding a number to nearest whole number
		y = Math.round(x);
		System.out.println(y);
		
		//finding square root of a number
		y = Math.sqrt(x);
		System.out.println(y);
		
		//number to the power of another number
		y = Math.pow(x, 3);
		System.out.println(y);
		
		angleDeg = 45;
		
		//calculating the radian
		angleRad = Math.toRadians(angleDeg);
		System.out.println(angleRad);
		
		//calculating sin of an angle from its radian
		sine = Math.sin(angleRad);
		System.out.println(sine);
		
		//calculating cos of a angle from its radian
		cos = Math.cos(angleRad);
		System.out.println(cos);
		
	}

}

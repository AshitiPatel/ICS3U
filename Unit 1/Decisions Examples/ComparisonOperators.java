/**
 * 
 */

/**
 * @author Ashiti
 * Date: 7 December 2020
 * Description: A small example of comparison operator
 *
 */
public class ComparisonOperators {

	public static void main(String[] args) {
		
		int a, b, c;
		boolean result, result2, result3, result4;
		
		//section 1
		a = 5;
		b = 10;
		c = 12;
		result = a>=b;
		System.out.println(a>=b);
		System.out.println("a>=b is " + result);
		
		//section 2
		if (a>=b)
		{
			result2 = true;
		}
		else 
		{
			result2 = false;
		}
		System.out.println("With if statement a>=b is " + result2);
		
		//section 3
		if (a>=b || c>=b)
		{
			result3= true;
		}
		else 
		{
			result3 = false;
		}
		System.out.println("With if statement a>=b or c>=b is " + result3);
		
		if (a>=b && c>=b)
		{
			result4= true;
		}
		else 
		{
			result4 = false;
		}
		System.out.println("With if statement a>=b and  c>=b is " + result4);
	}

}

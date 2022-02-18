/**
 * 
 */

/**
 * @author Ashii
 * Date: January 2021
 * Description: A program for introduction to arrays
 *
 */
public class ArrayExample1 {

	public static void main(String[] args) {

		int age;		//declare a single variable
		age = 18;		//assigns a value to the variable

		System.out.println(age); 		//displays it

		//ARRAYS are lists of variables of the same type

		int ages[];		//declares the array

		ages = new int [5]; 	//creates the array with 5 elements inside

		System.out.println(ages);

		ages[0] = 0;
		ages[1] = 0;
		ages[2] = 0;

		//initializes the array to 0
		for (int i = 0; i <= (ages.length)-1; i++) {
			ages[i] = 0;
		}

		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[2]);
		System.out.println(ages[3]);
		System.out.println(ages[4]);

		//creating arrays n a different ways
		int newAges[]  = {35, 17, 29, 16, 50};

		//create an array with the people's names
		String names[] = {"Campos", "Sania", "Meheet", "Joshua", "Samir"};

		for(int i = 0; i <= newAges.length-1; i++) {
			System.out.println(names[i] + " " + newAges[i]);
		}

	}

}

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Ashiti 
 * Date: December 2020
 * Description: A program that calculates and displays a 
 * 				customer's bill(including tax) of a pizza deal at a local school cafeteria
 *
 */
public class PizzaDeal 
{

	public static void main(String[] args) 
	{
		//declare variables for no. of pizza slices, pop, total, sub-total and tax
		int slices, pop;
		double tSlices, tPops, tax, sub, total;
		String userName, dateAndTime;

		//setup keyboard for input of numbers
		Scanner input = new Scanner (System.in);

		//setup keyboard for input of name and date
		Scanner input1 = new Scanner (System.in);

		//setup keyboard for displaying values till two decimal places
		DecimalFormat twoDecimals = new DecimalFormat ("#0.00");

		//display a friendly message for the user
		System.out.println("Hello! Welcome to DSSS Cafeteria.");
		System.out.println("We are having a pizza deal exclusively for our students and staff members.");
		System.out.println("Hurry up! Get your pizzas before the deal ends.");

		//prompt for date and time
		System.out.println("Enter the date and time of purchase:");
		dateAndTime = input.nextLine();

		//prompt and get the number of slices and pop
		System.out.println("Enter the number of pizza slices you would like to purchase:");
		slices = input1.nextInt();
		while (slices < 0)
		{
			System.out.println("Error! The number of pizza slices can't be negative.\nPlease enter valid number of pizza slices:");
			slices = input1.nextInt();
		}

		System.out.println("Enter the number of pops you would like to purchase:");
		pop = input1.nextInt();
		while (slices < 0)
		{
			System.out.println("Error! The number of pops can't be negative.\nPlease enter valid number of pops:");
			pop = input1.nextInt();
		}

		//CALCULATION
		if (slices < 3)
		{
			tSlices = 2 * slices;
			tPops = pop * 0.5;
			sub = tSlices + tPops;
			tax = (13 * sub) / 100;
			total = sub + tax;

		}

		else 
		{
			tSlices = 1 * slices;
			tPops = pop * 0.5;
			sub = tSlices + tPops;
			tax = (13 * sub) / 100;
			total = sub + tax;
		}

		//display bill
		System.out.println("\t\tDSSS CAFETERIA\n" + dateAndTime + "\n");

		if (slices == 1)
		{
			System.out.println(slices + " pizza slice:" + "\t\t$" + twoDecimals.format(tSlices));
		}
		else 
		{
			System.out.println(slices + " pizza slices:" + "\t\t$" + twoDecimals.format(tSlices));
		}

		if (pop == 1)
		{
			System.out.println(pop + " pop:" + "\t\t\t$" + twoDecimals.format(tPops));
		}
		else 
		{
			System.out.println(pop + " pops:" + "\t\t\t$" + twoDecimals.format(tPops));
		}

		System.out.println("\t\t\t---------");
		System.out.println("Sub-total:\t\t$" + twoDecimals.format(sub));
		System.out.println("HST(13%):\t\t$" + twoDecimals.format(tax));
		System.out.println("\t\t\t---------");
		System.out.println("Total:\t\t\t$" + twoDecimals.format(total));

		System.out.println("\nThank you for using this program! Enjoy your meal!");
	}

}

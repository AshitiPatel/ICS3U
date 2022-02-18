import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ashiti
 * Date: 3 December 2020
 * Description: A program that displays the receipt of a company of user's choice
 *
 */
public class Receipt {

	public static void main(String[] args) {
		
		//declare variables
		String userName, companyName, dateAndTime;
		String item1, item2, item3, item4;
		Double price1, price2, price3, price4;
		Double sub, tax, total;
		
		//setup output for two decimal places
		DecimalFormat twoDigit = new DecimalFormat("#0.00");
		
		//setup keyboard for input for the userName, companyName, dateAndTime, item1, item2, item3 and item4
		Scanner input = new Scanner (System.in);
		
		//setup keyboard for input for price1, price2, price3 and price4
		Scanner input1 = new Scanner (System.in);
		
		//prompt and read userName and greet the user
		System.out.println("Enter your name");
		userName = input.nextLine();
		System.out.println("Hi " + userName + "!");
		
		//prompt and read companyName
		System.out.println("Enter the name of the company you would like to purchase from ");
		companyName = input.nextLine();
		
		//prompt and read date
		System.out.println("Enter the date and time of purchase");
		dateAndTime = input.nextLine();
		
		//***************************
		
		//prompt and read items and their prices
		
		//item1
		System.out.println("Enter the first item ");
		item1 = input.nextLine();
		
		System.out.println("Enter its price");
		price1 = input1.nextDouble();
		
		//item2
		System.out.println("Enter the second item ");
		item2 = input.nextLine();
		
		System.out.println("Enter its price");
		price2 = input1.nextDouble();
		
		//item3
		System.out.println("Enter the third item ");
		item3 = input.nextLine();
		
		System.out.println("Enter its price");
		price3 = input1.nextDouble();
		
		//item4
		System.out.println("Enter the fourth item ");
		item4 = input.nextLine();
		
		System.out.println("Enter its price");
		price4 = input1.nextDouble();
		
		//*****************************
		
		//calculate sub-total 
		sub = price1 + price2 + price3 + price4;
		
		//calculate tax
		tax = (sub*13)/100;
		
		//calculate the total cost 
		total = sub + tax;
		
		//******************************
		
		//print receipt
		System.out.println("\t" + companyName + "\n");
		System.out.println(dateAndTime);
		System.out.println("\n" + item1 + ":\t\t" + "$" + twoDigit.format(price1));
		System.out.println(item2 + ":\t\t" + "$" + twoDigit.format(price2));
		System.out.println(item3 + ":\t\t" + "$" + twoDigit.format(price3));
		System.out.println(item4 + ":\t\t" + "$" + twoDigit.format(price4));
		System.out.println("\t\t-------------");
		System.out.println("Sub-total:\t$" + twoDigit.format(sub));
		System.out.println("HST(13%):\t$" + twoDigit.format(tax));
		System.out.println("\t\t-------------");
		System.out.println("Total:\t\t$" + twoDigit.format(total));
	
		
		
	}//end main method

}//end Receipt class

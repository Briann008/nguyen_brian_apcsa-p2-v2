//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Brian Nguyen
//Date - 2/11/2019

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		Discount d = new Discount();
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		out.print("Bill after discount :: " + Discount.getDiscountedBill(amt));
		

	}
}
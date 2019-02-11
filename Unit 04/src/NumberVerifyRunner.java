//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Brian Nguyen
//Date - 2/11/2019

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
	
		Scanner keyboard = new Scanner(System.in);
		
		String userInput; 
		boolean trueNess = true;
		int numb;
		
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5) + "\n");
		
		System.out.println("6 is odd :: " + NumberVerify.isOdd(6));
		System.out.println("6 is even :: " + NumberVerify.isEven(6) + "\n");
		
		System.out.println("312 is odd :: " + NumberVerify.isOdd(312));
		System.out.println("312 is even :: " + NumberVerify.isEven(312) + "\n");
		
		System.out.println("232 is odd :: " + NumberVerify.isOdd(232));
		System.out.println("232 is even :: " + NumberVerify.isEven(232) + "\n");
		
		while (trueNess == true)
		{
			System.out.print("Input the number you want to verify if they're even or odd ");
			numb = keyboard.nextInt();
			System.out.println(numb + " is odd :: " + NumberVerify.isOdd(numb));
			System.out.println(numb + " is even :: " + NumberVerify.isEven(numb) + "\n");
			System.out.print("Do you want to continue? Yes or No :: ");			
			userInput = keyboard.next();
			if (userInput.toLowerCase().equals("yes"))
			{
				trueNess = true;
			}
			else
			{
				trueNess = false;
			}
		}
		
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		StringOddOrEven wordCheck = new StringOddOrEven();
		Scanner keyboard = new Scanner(System.in);
		String word;
		System.out.print("Enter a word :: ");
		word = keyboard.next();
		wordCheck.setString(word);
		if(wordCheck.isEven() == true)
		{
			System.out.println(word + " is even");
		}
		else
		{
			System.out.println(word + " is odd");
		}
		
	}
}
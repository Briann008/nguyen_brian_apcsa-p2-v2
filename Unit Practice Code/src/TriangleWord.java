//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		int counter = word.length();
		for(int a = 0; a <= word.length(); a++)
		{
			for(int b = counter; b < word.length(); b++)
			{
				System.out.print(word.substring(0, a));
			}
			System.out.println("");
			counter -= 1;
		}
	}
}
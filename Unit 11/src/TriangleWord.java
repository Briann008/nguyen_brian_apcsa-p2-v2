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
		for(int i = 0; i <= word.length(); i++)
		{
			for(int a = counter; a < word.length(); a++)
			{
				System.out.print(word.substring(0, i));
			}
			counter -=1;
			System.out.println("");
		}
	}
}
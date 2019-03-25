//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		String choice = "y";
		do 
		{
			System.out.print("Input a size you want for the Random List :: ");
			int size = keyboard.nextInt();
			int[] randArray = NumberShifter.makeLucky7Array(size);
			
			System.out.println(Arrays.toString(randArray));
			NumberShifter.shiftEm(randArray);
			
			System.out.print("Do you want to do it again, y or n ? :: ");
			choice = keyboard.next();
			System.out.println("");
		} while (choice.equals("y") || choice.equals("Y")); 
	}
}




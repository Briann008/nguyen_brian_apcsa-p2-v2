//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Distance distance = new Distance();
		int x1, x2, y1, y2;
		String wholeString;
		System.out.println("Enter x1, y1, x2, y2");
		System.out.print("x1: ");
		x1 = keyboard.nextInt();
		System.out.print("y1: ");
		y1 = keyboard.nextInt();
		System.out.print("x2: ");
		y2 = keyboard.nextInt();
		System.out.print("y2: ");
		x2 = keyboard.nextInt();
		distance.setCoordinates(x1, y1, x2, y2);
		distance.calcDistance();
		
		System.out.println("The Results are");
		distance.print();
		wholeString = distance.toString();
		System.out.println(wholeString);
	}
}
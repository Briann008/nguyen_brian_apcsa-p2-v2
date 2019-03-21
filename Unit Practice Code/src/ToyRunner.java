//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;
public class ToyRunner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a toy and the amount that exist in there :: ");
		String toyName = keyboard.nextLine();
		Toy toys = new Toy(toyName);
		System.out.println(toys);
	}
}
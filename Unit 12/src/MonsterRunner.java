//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter 1st monster's name : ");
		String name1 = keyboard.next();
		System.out.print("Enter 1st monster's size : ");
		int size1 = keyboard.nextInt();
		
		Monster mon1 = new Skeleton(size1,name1);
		
		System.out.print("Enter 2nd monster's name : ");
		String name2 = keyboard.next();
		System.out.print("Enter 2nd monster's size : ");
		int size2 = keyboard.nextInt();		
		
		Monster mon2 = new Skeleton(size2,name2);
		
		System.out.println("\nMonster 1 : " + mon1 + "Monster 2 : " + mon2);
		if(mon1.isBigger(mon2))
			System.out.println("Monster one is bigger than Monter two" );
		else
			System.out.println("Monster two is bigger than Monster one");
		if(mon1.isSmaller(mon2))
			System.out.println("Monster one is smaller than Monster two");
		else
			System.out.println("Monster two is smaller than Monster one");
		
	}
}
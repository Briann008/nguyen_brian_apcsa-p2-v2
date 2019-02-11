//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Brian Nguyen
//Date - 2/11/2019
//Class - APCSPA

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	   public static void main( String args[] )
	   {
		   StringEquality se = new StringEquality();
		   Scanner keyboard = new Scanner(System.in);
		   String word1, word2, yesOrNo;
		   boolean truthness = true;
		   while(truthness ==  true)
		   {
			   System.out.println("I made it so that my words can equal to each other if they're upperCase or lowerCase");
			   System.out.println("Input two word to check see if the words are the same");
			   System.out.print("First Word :: ");
			   word1 = keyboard.next();
			   System.out.print("Second Word :: ");
			   word2 = keyboard.next();
			   se.setWords(word1, word2);
			   if(se.checkEquality())
			   {
				   System.out.println(se);
			   }
			   else
			   {
				   System.out.println(se);
			   }
			   System.out.print("______________________________________\nDo you want to continue (yes or no) :: ");
			   yesOrNo = keyboard.next();
			   if(yesOrNo.toLowerCase().equals("yes"))
			   {
				   truthness = true;
			   }
			   else
			   {
				   System.out.println("Okay have a good day");
				   truthness = false;
			   }
		   }
	   }
}

//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Brian Nguyen
//Date - 2/11/2019
//Class - APCSPA

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   
	   WordsCompare wordCompare = new WordsCompare();
	   Scanner keyboard = new Scanner(System.in);
	   String word1, word2, yesOrNo;
	   boolean truthness = true;
	   while(truthness ==  true)
	   {
		   System.out.println("Input two word for the dictionary word Comparison ");
		   word1 = keyboard.next();
		   word2 = keyboard.next();
		   wordCompare.setWords(word1, word2);
		   wordCompare.compare();
		   System.out.println(wordCompare.toString());
		   System.out.print("Do you want to continue (yes or no) :: ");
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
//abe should be placed before ape

//giraffe should be placed before gorilla

//one should be placed before two

//fun should be placed before funny

//123 should be placed before 19

//193 should be placed after 1910

//goofy should be placed after godfather

//funnel should be placed after fun

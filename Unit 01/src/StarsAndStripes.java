//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   for(int i = 0; i <=20; i++)
	   {
		   out.print('*');
	   }
	   System.out.println("");
   }

   public void printTwentyDashes()
   {
	   for(int i = 0; i <=20; i++)
	   {
		   out.print('-');
	   }
	   System.out.println("");
   }
   public void printTwoBlankLines()
   {
	   out.println("");
	   out.println("");
   }
   
   public void printASmallBox()
   {	
	   for(int i = 0; i < 3; i++)
	   {
		   printTwentyDashes();
		   printTwentyStars();
	   }
	   printTwentyDashes();

   }
 
   public void printABigBox()
   { 	
	   for (int i = 0; i <= 1; i++)
	   {
		   printASmallBox();
	   }
   }   
}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive triangle = new TriangleFive('C', 4);
	   System.out.println(triangle);
	   
	   triangle.setAmount(5);
	   triangle.setLetter('A');
	   System.out.println(triangle);
	   
	   triangle.setAmount(7);
	   triangle.setLetter('B');
	   System.out.println(triangle);
	   
	   triangle.setAmount(6);
	   triangle.setLetter('X');
	   System.out.println(triangle);
	   
	   triangle.setAmount(8);
	   triangle.setLetter('Z');
	   System.out.println(triangle);
   }
}
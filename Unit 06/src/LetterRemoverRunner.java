//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover lm = new LetterRemover();
		lm.setRemover("I am Sam I am", 'a');
		System.out.println(lm);
		
		lm.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(lm);
		
		lm.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(lm);
		
		lm.setRemover("abababababa", 'b');
		System.out.println(lm);
		
		lm.setRemover("abaababababa", 'x');
		System.out.println(lm);

	}
}
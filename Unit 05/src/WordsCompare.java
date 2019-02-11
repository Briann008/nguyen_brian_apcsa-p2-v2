//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Brian Nguyen
//Date - 2/11/2019
//Class - APCSPA

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
	private int compare;

	public WordsCompare()
	{
		wordOne = "";
		wordTwo = "";
		compare = 0;
	}

	public WordsCompare(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void compare()
	{
		compare = wordOne.compareTo(wordTwo);
	}

	public String toString()
	{
		if(compare < 0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}
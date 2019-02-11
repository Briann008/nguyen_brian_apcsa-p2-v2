//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Brian Nguyen
//Date - 2/11/2019
//Class - APCSPA

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
		wordOne = "";
		wordTwo = "";
	}

	public StringEquality(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality()
	{
		if(wordOne.toLowerCase().equals(wordTwo.toLowerCase()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String toString()
	{
		if(checkEquality())
		{
			return wordOne + " has the same letters as " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}
	}
}
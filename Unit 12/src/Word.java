//(c) A+ Computer Scienc
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;
	private int length;
	public Word( String s )
	{
		word = s;
		length = s.length();
	}
	public int compareTo( Word rhs )
	{	
		if(length > rhs.toString().length())
		{
			return 1;
		}
		else if(length < rhs.toString().length())
		{
			return -1;
		}
		else {
			return toString().compareTo(rhs.toString());
		}
	}

	public String toString()
	{
		return word;
	}
}
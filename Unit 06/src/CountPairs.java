//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int pairs = 0;
		char[] strArray = str.toCharArray();
		for(int i = 0; i < strArray.length-1 ; i++)
		{
			if(strArray[i] == strArray[i+1])
			{
				pairs = pairs + 1;
			}
		}
		return pairs;
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Brian Nguyen
//Date - 2/7/2019

public class FirstLastVowel
{
	private int x;
	public FirstLastVowel()
	{
		x = 0;
	}
   public static String go( String a )
	{
		String vowels = "AEIOUaeiou";
		
		String pos1, pos2;
		pos1 = a.substring(0, 1);
		pos2 = a.substring(a.length() - 1 );
		//I need to make it so that if the numbers first letter or last letter is in the list of index for the vowels it will return yes 
		//In the end i just made it so that if any of the values equals to pos1 return true same thing for pos2. Works the same for pos2 which is the last substring
		if(vowels.contains(pos1) || vowels.contains(pos2))
		{
			return "yes";
		}
		else
		{
			return "no";
		}
	}
}
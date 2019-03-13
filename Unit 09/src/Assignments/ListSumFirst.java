package Assignments;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int sum = 0;
		boolean theresNumbers = false;
		for(int integars: ray)
		{
			if(ray.get(0) < integars)
			{
			sum = sum + integars;
			theresNumbers = true;
			}
		}
		if(theresNumbers == true)
		{
		return sum;
		}
		else 
		{
			return -1;
		}
	}
}
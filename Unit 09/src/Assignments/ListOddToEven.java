package Assignments;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		boolean odd = false;
		boolean even = false;
		int oddsPlace = 0;
		int evensPlace = 0;
		for(int a = 0; a < ray.size(); a++)
		{
			if(ray.get(a) % 2 == 0)
			{
				evensPlace = a;
			}
		}
		for(int i = 0; i < ray.size(); i++)
		{
			
			if(ray.get(i) % 2 == 1 && odd == false)
 			{
				odd = true;
				oddsPlace = i;
			}
		}
		return evensPlace - oddsPlace;
	}
}
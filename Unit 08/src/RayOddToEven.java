//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		boolean odd = false;
		boolean even = false;
		int oddDistance = 0;
		int evenDistance = 0;
		for(int i = 0; i < ray.length;i++)
		{
			if(ray[i] % 2 == 1 && odd == false)
			{
				odd = true;
				oddDistance = i;
			}
			if(ray[i] % 2 == 0 && odd && even == false)
			{
				even = true;
				evenDistance = i;
			}
		}
		if(even && odd)
		{
			return evenDistance - oddDistance;
		}
		else 
		{
			return -1;
		}
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		if(spot < pups.length)
		{
			pups[spot] = (new Dog(age,name));
		}
		
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		String oldest = pups[0].getName();
		int min = pups[0].getAge();
		for(Dog puppy: pups)
		{
			if(puppy.getAge() > min )
			{
				min = puppy.getAge();
				oldest = puppy.getName();
			}
		}
		return oldest;
	}

	public String getNameOfYoungest()
	{
		String youngest = pups[0].getName();
		int min = pups[0].getAge();
		for(Dog puppy: pups)
		{
			if(puppy.getAge() < min)
			{
				min = puppy.getAge();
				youngest = puppy.getName();
			}
		}
		return youngest;
	}

	public String toString()
	{
		return "" + Arrays.toString(pups);
	}
}
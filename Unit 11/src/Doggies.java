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
		if(pups.length > spot)
			pups[spot] = new Dog(age, name);
		
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		String oldestName = "";
		int oldest = 0;
		for(Dog age: pups)
		{
			if(age.getAge () > oldest)
			{
				oldest = age.getAge();
				oldestName = age.getName();
			}
		}
		return oldestName;
	}

	public String getNameOfYoungest()
	{
		String youngName = "";
		int youngest = 0;
		for(Dog age: pups)
		{
			if(age.getAge () < youngest)
			{
				youngest = age.getAge();
				youngName = age.getName();
			}
		}
		return youngName;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}
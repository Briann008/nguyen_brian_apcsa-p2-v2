//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;
	
	
	public ToyStore(String toys)
	{
		loadToys(toys);
	}
	
	public void loadToys( String toys )
	{
		toyList = new ArrayList<Toy>();
		Scanner toyNames = new Scanner(toys);
		while(toyNames.hasNext())
		{
			String names = toyNames.next();
			Toy toy = getThatToy(names);
			if(toy == null)
			{
				Toy newToy = new Toy(names);
				toyList.add(newToy);
			}
			else
			{
				toy.setCount(toy.getCount()+1);				
			}
		}
		
		//Makes the toyList into a new one which makes a blank
		
		//From this Scanner it takes the sting from the loadToys
		
		//While String of the toys in the scanner still exist run the while loop

		//Make the string with the names in it, into a new String variable with String name toys into it

		//Now make a new Toy variable and set that toy variable to getThatToy. Which checks toys inside toyList to see if they are the same

		//Now if they're aren't the same, make a newToy (toy variable) with the name of the toy that wasn't there in the first place. Then add it to the toyList array

		//Now if the toy already exist in the index add a count. From adding a count now

		
		
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy toys :toyList)
  		{
  			if(toys.getName().equals(nm))
  			{
  				return toys;
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int max = toyList.get(0).getCount();
  		String maxName = toyList.get(0).getName();
  		for(int i = 0; i < toyList.size(); i++)
  		{
  			if(max > toyList.get(i).getCount())
  			{
  				max = toyList.get(i).getCount();
  				maxName = toyList.get(i).getName();
  			}
  		}
  		return maxName;
  		//Pretty easy to understand. It scans through the entire ArrayList 
  		//After Scanning all of it it get the toysLis with the greatest count and set that toy to a string a return that name 
  	}  
  
  	public void sortToysByCount()
  	{
  		ArrayList<Toy> sorted = new ArrayList<>();
  		int size = toyList.size();
  		while(sorted.size() < size)
  		{

  			Toy max = toyList.get(0);
  	  		for(int i = 0; i < toyList.size(); i++)
  	  		{
  	  			if(max.getCount() >= toyList.get(i).getCount())
  	  			{
  	  				max = toyList.get(i);
  	  			}
  	  		}
  	  		sorted.add(max);
  	  		toyList.remove(max);
  		}
  		toyList = sorted;
  	}  
  	  
	public String toString()
	{
		String output = toyList + "\n";
		sortToysByCount();
		output = output + "\n" + toyList;
		return output;
	}
}
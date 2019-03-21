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
			Toy toysList = getThatToy(names);
			if(toysList == null)
			{
				Toy finalToysList = new Toy(names);
				toyList.add(finalToysList);
			}
			else
			{
				toysList.setCount(toysList.getCount()+1);
			}
		}
		
		
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy toys :)
  		return ;
  	}
  
  	public String getMostFrequentToy()
  	{
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}
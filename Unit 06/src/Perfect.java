//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	public Perfect()
	{
		setNumber(0);
	}
	public Perfect(int numb)
	{
		setNumber(numb);
	}
	public void setNumber(int numb)
	{
		number = numb;
	}

	public boolean isPerfect()
	{
		double sum = 0;
		double counter = number;
		while(counter != 1.0) {
			counter = Math.ceil(counter / 2);
			sum = sum + counter; 
		}
		
		if(sum == (double)number){
			return true;
		}
		
		else{
			return false;
		}
	}
	
	public String toString()
	{
		if (isPerfect())
		{
			return number + " is perfect.";
		}
		else
		{
			return number + " is not a perfect.";
		}
	}
	
}
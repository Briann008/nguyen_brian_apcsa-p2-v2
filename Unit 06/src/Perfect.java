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
		//Original Code I wanted to use
		//double sum = 0;
		//double counter = number;
		//while(counter != 1.0) {
			//counter = Math.ceil(counter / 2);
			//sum = sum + counter; 
		//}
		
		//if(sum == (double)number){
			//return true;
		//}
		
		//else{
			//return false;
		//}
		int sum = 0;
		for(int i = 1; i < number; i++)
		{
			if(number % i == 0)
			{
				sum = sum + i;
			}
		}
		if(sum == number)
		{
			return true;
		}
		else
		{
			return false;
		}
		//So in the end I had to use the Internet to help me and by doing that I learned what this truly means
		//Another way to say % is divisible
		//If this number % (whatever number) == 0 then that number is used in the multiplication of it 
		//If u add up all number that you used to % the number going up to the actual number
		//If sums of those numbers == the number you used it's perfect!!
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
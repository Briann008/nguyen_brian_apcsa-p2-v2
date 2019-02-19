//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double biggest = one, doubleArray[] = new double[] {one,two,three,four};
		for(int i = 0; i < doubleArray.length; i++)
		{
			//There I technically used not with an !
			if(!(biggest > doubleArray[i]))
			{
				biggest = doubleArray[i];
			}
		}
		
		return biggest;
	}

	public String toString()
	{
	   return one + " " + two + " " + three + " " + four + "\n" + "biggest = " + getBiggest() + "\n";
	}
}
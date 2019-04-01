//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int num;
	private int den;
	
	
	public Rational()
	{
		setRational(1,1);
	}
	public Rational(int numbOne, int numbTwo)
	{
		setRational(numbOne,numbTwo);
	}

	public void setRational(int numberOne, int numberTwo)
	{
		num = numberOne;
		den = numberTwo;
		reduce();
	}
	
	public void add(Rational  other)
	{
		other.reduce(); 
		num = (num * other.getDen()) + (other.getNum() * den);
		den = other.getDen() * den;
		reduce();
	}

	private void reduce()
	{
		
		if(den < 0)
		{
			num = num * -1;
			den = den * -1;
		}
		if(num > den) 
		{
			for(int i = 1; i < num;i++)
			{
				if(num % i == 0 && den % i == 0 )
				{
					num = num/i;
					den = den/i;
				}
			}
		}
		else 
		{
			for(int i = 1; i < den;i++)
			{
				if(num % i == 0 && den % i == 0 )
				{
					num = num/i;
					den = den/i;
				}
			}
		}
	}

	private int gcd(int numOne, int numTwo)
	{
		return numOne*numTwo;
	}

	public Object clone ()
	{
		return new Rational(num,den);
	}

	public int getNum() 
	{
		return num;
	}
	public int getDen()
	{
		return den;
	}	
	
	public boolean equals( Object obj)
	{
		if(obj.getClass() != this.getClass())
		{
			return false;
		}
		else
		{
			Rational rat = (Rational)obj;
			if(rat.getDen() == this.getDen() && rat.getNum() == this.getNum())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}

	public int compareTo(Rational other)
	{
		double firstDecimal = (double)num/den;
		double secondDecimal = (double)other.getNum()/other.getDen();
		return Double.compare(firstDecimal, secondDecimal);
	}



	
	//write  toString() method
	public String toString()
	{
		if(num == den)
		{
			num = 1;
			den = 1;
		}
		String output = num + "/" + den;
		return output;
	}
	
	
}
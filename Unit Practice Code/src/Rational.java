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
		setRational(0,0);
	}
	public Rational(int numbOne, int numbTwo)
	{
		setRational(numbOne,numbTwo);
	}


	public void setRational(int numberOne, int numberTwo)
	{
		num = numberOne;
		den = numberTwo;
	}
	

	//write  a set method for numerator and denominator

	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		


		reduce();
	}

	private void reduce()
	{



	}

	private int gcd(int numOne, int numTwo)
	{


		return 1;
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	
	
}
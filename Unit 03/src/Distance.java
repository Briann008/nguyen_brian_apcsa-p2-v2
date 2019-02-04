//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	//Constructor 
	public Distance()
	{
		setCoordinates(0, 0, 0, 0);
		distance = 0.0;
	}
	
	//If coder wants to change it
	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}
	
	//User Setters
	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}
	
	//Calculations
	public void calcDistance()
	{
		double yUnit, xUnit;
		//Could have done Math.pow
		yUnit = (double)(yTwo-yOne)*(yTwo-yOne);
		xUnit = (double)(xTwo-xOne)*(xTwo-xOne);
		distance = sqrt(yUnit + xUnit);
		
	}
	
	//Getters
	public double getDistance()
	{
		return distance;
	}
	
	//Execute Print
	public void print()
	{
		out.println("Enter X1 :: " + xOne);
		out.println("Enter Y1 :: " + yOne);
		out.println("Enter X2 :: " + xTwo);
		out.println("Enter Y1 :: " + yTwo);
		out.println("distance == " + String.format("%.3f",distance));
		
	}
	
	//complete print or the toString

	//Execute String
	public String toString()
	{
		return "X1: " + xOne + "   Y1: " + yOne + "   X2: " + xTwo + "   Y2: " + yTwo + "   Distance == " + String.format("%.3f", distance);
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}
	//Constructor

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist,hrs,mins);
		calcMPH();
	}
	//If Coder wants to changes

	//Setter for the users
	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	//Constructors
	public void calcMPH()
	{
		double minuteCalc = minutes/60.0;
		if (hours >= 1 && minutes >= 0)
		{
			mph = (distance / hours)/minuteCalc;
		}
		else if (hours == 0)
		{
			mph = distance/minuteCalc;
		}
		else if (minutes == 0)
		{
			mph = distance/hours;
		}
	}

	public void print()
	{
		out.println(distance + " miles " + hours + " hour " + minutes + " minutes = " + String.format("%.1f", mph) +  " MPH.");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}
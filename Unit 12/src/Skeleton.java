//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	private int size;
	private String name;
	private int counter = 0;
	
	public Skeleton()
	{
		setSkeleton(0, "");
	}
	public Skeleton(int skeletonSize, String skeletonName)
	{
		setSkeleton(skeletonSize, skeletonName);
	}
	public void setSkeleton(int skeletonSize, String skeletonName)
	{
		size = skeletonSize;
		name = skeletonName;
	}
	
	@Override
	public int getHowBig()
	{
		return size;
	}
	@Override
	public String getName()
	{
		return name;
	}
	@Override
	public boolean isBigger(Monster other) 
	{
		if(other.getHowBig() > getHowBig())
			return true;
		else
			return false;
	}
	@Override
	public boolean isSmaller(Monster other)
	{
		if(other.getHowBig() < getHowBig())
			return true;
		else
			return false;
	}
	public boolean namesTheSame(Monster other)
	{
		if(other.getName().equals(getName()))
			return true;
		else
			return false;
	}
	
	//add code to implement the Monster interface

	public String toString()
	{
		String output = getName() + " " + getHowBig() + "\n";
		if(isBigger)
		
		return output;
	}
}
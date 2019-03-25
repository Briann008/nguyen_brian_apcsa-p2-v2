//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;


public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		Random rand = new Random();
		int[] numbArray = new int[size];
		int randNumber = rand.nextInt(10) + 1;
		for(int i = 0; i < size; i++)
		{
			numbArray[i] = randNumber;
			randNumber = rand.nextInt(10) + 1;
		}
		return numbArray;
	}
	public static void shiftEm(int[] array)
	{
		int[] shiftedArray = new int[array.length];
		int counter = 0;
		for(int i = 0; i < shiftedArray.length; i++)
		{
			if(array[i] == 7)
			{
				shiftedArray[counter] = 7;
				counter += 1;
			}
		}
		for(int i = 0; i <shiftedArray.length; i++)
		{
			if(array[i] != 7)
			{
				shiftedArray[counter] = array[i];
				counter += 1;
			}
		}
		System.out.println(Arrays.toString(shiftedArray));
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));
		ArrayList<Word> words = new ArrayList<Word>();
		int size = file.nextInt();
		file.nextLine();
		
		while (file.hasNextLine())
		{
			String filesWords = file.nextLine(); 
			words.add(new Word(filesWords));
		}
		
		ArrayList<Word> sorted = new ArrayList<>();
		Word min = words.get(0);
		while(words.size() > 0) {
			min = words.get(0);
			for(Word i : words) {
				if (min.compareTo(i) > 0) {
					min = i;
				}
			}
			sorted.add(min);
			words.remove(min);
		}
		
		for(Word theWords: sorted)
		{
			System.out.println(theWords);
		}
	}
}
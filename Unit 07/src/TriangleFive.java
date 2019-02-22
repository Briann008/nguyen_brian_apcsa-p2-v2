//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}
	public String triFiveOutput()
	{
		int outputAmount = 0; //Determine the number in the series
		int amountofLetters = 0;
		char upLetters = letter;
		char resetLetters = 'A';
		String sentence = "";
		
		for(int a = 1; a <= amount; a++)	//Controls How Many times it would run
		{
			for(int b = 0; b < amount; b++) //Controls The Letters
			{	
				upLetters = (char)(letter + b);
				for(int c = amountofLetters; c < amount; c++) //Controls the number of times the letter shows up
				{
					if(outputAmount < amount) 
					{
						if(upLetters >= 'Z' + 1)
						{
							sentence = sentence + (char)(resetLetters - 1);
						}
						else
						{
							sentence = sentence + upLetters;
						}
					}
				}
				sentence = sentence + " ";
				outputAmount += 1; //Modify the number in the series 
				amountofLetters += 1;//Raises Letters
				if(upLetters >= 'Z')
					resetLetters += 1; //Raises Letters
			}
			sentence = sentence + "\n";
			resetLetters = 'A';
			outputAmount = 0 + a;
			amountofLetters = 0;
		}
		return sentence;
	}
	public String toString()
	{
		return triFiveOutput();
	}
}
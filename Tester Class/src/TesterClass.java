public class TesterClass
{
	public static void main ( String[] args )
	{	
		char letter = 'X';
		int amount = 6; //Amount of letters
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
		System.out.println(sentence);
	}
}
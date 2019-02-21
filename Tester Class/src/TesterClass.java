public class TesterClass
{
	public static void main ( String[] args )
	{	
		char letter = 'C';
		int amount = 4;
		int outputAmount = 0;
		int amountofLetters = 0;
		char upLetters = letter;
		
		for(int a = 1; a <= amount; a++)	//Controls How Many times it would run
		{
			for(int b = 0; b < amount; b++) //Controls The Letters
			{	
				
				upLetters = (char)(letter + b);
				for(int c = amountofLetters; c < amount; c++) //Controls the number of times the letter shows up
				{
					if(outputAmount < amount) 
					{
						System.out.print(upLetters);
					}
				}
				System.out.print(" ");
				outputAmount += 1;
				amountofLetters += 1;
			}
			outputAmount = 0 + a;
			amountofLetters = 0;
			System.out.println("");
		}
	}	
}
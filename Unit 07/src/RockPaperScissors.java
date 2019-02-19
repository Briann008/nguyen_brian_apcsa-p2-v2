//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Random;

public class RockPaperScissors
{
	Random rand = new Random();
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		//Since it said in the instruction to use Math.random() i couldnt make it completly random because of how 0 - 0.5 is the range of the rounding.  
		//While the other two has .5-1.5 and 1.5-2.49. So i used Random rand = new Random(); instead

		playChoice = player;
		int randomNumb = rand.nextInt(3);
		if(randomNumb == 0)
		{
			compChoice = "R";
		}
		else if(randomNumb == 1)
		{
			compChoice = "P";
		}
		else
		{
			compChoice = "S";
		}
		
	}

	public String determineWinner()
	{
		String winner;
		if(compChoice.equals(playChoice))
		{
			winner = "!Draw Game!";
		}
		else if(compChoice.equals("R") && playChoice.equals("S") || compChoice.equals("P") && playChoice.equals("R") || compChoice.equals("S") && playChoice.equals("P"))
		{
			winner = "!Computer Wins!";
		}
		else 
		{
			winner = "!Player Wins!";
		}
		return winner;
	}

	public String toString()
	{
		String output = determineWinner() + "\nPlayer had " + playChoice + "\nComputer had " + compChoice + "\n";
		String descision;
		if (compChoice.equals("R") && playChoice.equals("S") || playChoice.equals("R") && compChoice.equals("S"))
		{
			descision = "<<Rock Breaks Scissors>>\n";
		}
		else if(compChoice.equals("P") && playChoice.equals("R") || playChoice.equals("P") && compChoice.equals("R"))
		{
			descision = "<<Paper Covers Rock>>\n";
		}
		else if(compChoice.equals("S") && playChoice.equals("P") ||  playChoice.equals("S") && compChoice.equals("P"))
		{
			descision = "<<Scissors Cut Paper>>\n";
		}
		else
		{
			descision = "";
		}
		return output + descision;
	}
}
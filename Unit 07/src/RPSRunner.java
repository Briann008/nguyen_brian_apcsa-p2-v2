//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response = 'y'; 
		String player = "";	
		RockPaperScissors game = new RockPaperScissors();

		while(response == 'y')
		{
			System.out.print("Rock-Paper-Scissors - pick your weapon[R,P,S] :: ");
			player = keyboard.next();
			game.setPlayers(player.toUpperCase());
			System.out.println(game);
			System.out.print("Do you want to play again? (y or n) :: ");
			response = keyboard.next().toLowerCase().charAt(0);
		}
		if(response == 'n')
		{
			System.out.println("Okay have a nice day.");
		}
	}
}




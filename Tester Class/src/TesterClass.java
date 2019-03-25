import java.util.ArrayList;
import java.util.Random;

public class TesterClass
{
	public static void main ( String[] args )
	{	
		Random rand = new Random();
		int randNumber = rand.nextInt(10-1+1) + 1;
		for(int i = 0; i <10 ; i++){
			System.out.println(randNumber);
			randNumber = rand.nextInt(10)+1;
		}
	}
}

import java.lang.Math;
import java.util.Random;


public class TesterClass
{
	public static void main ( String[] args )
	{
		Random rand = new Random();
		for(int i = 0; i < 20; i++)
		{
		System.out.println(rand.nextInt(3));
		}
	}
}
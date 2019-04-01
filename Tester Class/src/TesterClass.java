import java.util.ArrayList;
import java.util.Random;

public class TesterClass
{
	public static void main ( String[] args )
	{	
		int num = 20;
		int den = 5;
		for(int i = 1; i < num/2;i++)
		{
			if(num % i == 0 && den % i == 0 )
			{
				num = num/i;
				den = den/i;
			}
		}
		System.out.println(num + " " + den);
	}
}
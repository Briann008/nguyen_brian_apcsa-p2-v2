import java.util.ArrayList;
import java.util.Random;



public class TesterClass
{
		public static void main ( String[] args )
		{	
			Tester t = new Test();
			System.out.println(t.Cuck());
		}
}

abstract class Tester
{
	public abstract String Cuck();
	
}

class Test extends Tester
{
	@Override
	public String Cuck()
	{
		return "U Cucked me.";
	}

}



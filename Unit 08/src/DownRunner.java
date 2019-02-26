//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{				
		RayDown s = new RayDown();
		
		System.out.println( s.go( new int[]{-99,1,2,3,4,5,6,7,8,9,10,12345} ) );
		System.out.println( s.go( new int[]{10,9,8,7,6,5,4,3,2,1,-99} ) );
		System.out.println( s.go( new int[]{10,20,30,40,50,-11818,40,30,20,10} ) );
		System.out.println( s.go( new int[]{32767} ) );
		System.out.println( s.go( new int[]{2,7,11,21,5,7} ) );
		System.out.println( s.go( new int[]{7,255,11,255,100,3,2} ) );
		System.out.println( s.go( new int[]{9,11,11,11,7,1000,3} ) );
		System.out.println( s.go( new int[]{7,7,7,11,2,7,7,11,11,2} ) );
		System.out.println( s.go( new int[]{2,4,6,8,8} ) );
	}
}
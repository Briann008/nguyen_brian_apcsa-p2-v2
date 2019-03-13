package ElevensActivity;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		Card card = new Card("Jack", "Clubs", 10);
		System.out.println(card);
		card.cardSetter("King", "Hearts", 10);
		System.out.println(card);
		card.cardSetter("8", "Diamonds", 8);
		System.out.println(card);
	}
}

package blackjack;
	
public enum Suit {
	Spade(0),
	Diamond(1),
	Heart(2),
	Club(3);

	private int value;

	private Suit(int v) {
		value = v;
	}

	public static Suit getSuit(int n) {
		switch (n) {
			case 0:
				return Suit.Spade;
			case 1:
				return Suit.Diamond;
			case 2:
				return Suit.Heart;
			case 3:
				return Suit.Club;
			default:
				return null;
		}
	}
}

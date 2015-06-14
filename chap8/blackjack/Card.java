package blackjack;

public class Card {
	Suit suit;
	int value;

	public Card(Suit s, int v) {
		suit = s;
		value = v;
	}

	public Suit getSuit(){
		return suit;
	}

	public int getValue(){
		return value;
	}
}

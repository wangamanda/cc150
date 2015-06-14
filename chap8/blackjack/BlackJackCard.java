package blackjack;

public class BlackJackCard extends Card{
	public BlackJackCard(Suit s, int v) {
		super(s,v);	
	}

	public int value() {
		if (value == 1) {
			return 1;
		} else if (value >= 11 && value <= 13) {
			return 10;
		} else {
			return value;
		}
	}

	public int maxValue() {
		if (value == 1) {
			return 11;
		} else {
			return value;
		}
	}

	public int minValue() {
		if (value == 1) {
			return 1;
		} else {
			return value;
		}
	}
}

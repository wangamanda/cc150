package blackjack;

import java.util.ArrayList;

public class Hand<T extends Card> {
	ArrayList<T> cards;
	public Hand() {
		cards = new ArrayList<T>();
	}

	public Hand(ArrayList<T> c) {
		cards = c;
	}

	public int score() {
		int n = 0;
		for (int i = 0 ; i < cards.size() ; i ++ ) {
			n += cards.get(i).getValue();
		}
		return n;
	}
	
	public void addCard(T c) {
		cards.add(c);
	}
}

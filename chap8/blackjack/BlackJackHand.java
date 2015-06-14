package blackjack;
import java.util.ArrayList;

public class BlackJackHand extends Hand<BlackJackCard> {
	public int score() {
		//To Do
		return -1;
	}

	public ArrayList<Integer> possibleScores(){
		//To Do
		return null;
	}

	public boolean isBusted(){
		return false;
	}

	public boolean isBlackJack(){
		return false;
	}

	public boolean is21(){
		return true;
	}
}

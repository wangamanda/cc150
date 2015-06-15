package othello;

public class Player{
	private Color color;
	private int score;
	public Player(Color c) {
		color = c;
	}

	public int getScore(){
		return score;
	}

	public boolean playPeice(int r, int c){
		return Game.getInstance().getBoard().placeColor(r, c, color);
	}

	public Color getColor(){
		return color;
	}
}

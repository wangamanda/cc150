package othello;

public class Piece{
	Color color;
	public Piece(Color c) {
		color = c;
	}

	public void flip(){
		if (color == Color.White) {
			color = Color.Black;
		} else {
			color = Color.White;
		}
	}

	public Color getColor(){
		return color;
	}
}

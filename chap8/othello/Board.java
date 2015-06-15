package othello;

public class Board{
	private int blackCount = 0;
	private int whiteCount = 0;
	private Piece[][] board;

	public Board(int rows, int cols) {
		board = new Piece[rows][cols];
	}

	public void initialize(){
	
	}

	public boolean placeColor(int row, int col, Color c) {
		return true;
	}

	public int flipSection(int row, int column, Color color, Direction d) {
		return 0;
	}

	public int getScoreForColor(Color c) {
		if (c == Color.Black) {
			return blackCount;
		} else {
			return whiteCount;
		}
	}

	public void updateScore(Color c, int cnt){
	
	}
}

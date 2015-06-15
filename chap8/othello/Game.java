package othello;

public class Game{
	private Player[] players;
	private Board board;
	private final int ROWS = 10;
	private final int COLS = 10;
	private static Game instance;

	private Game(){
		board = new Board(ROWS, COLS);
		players = new Player[2];
		players[0] = new Player(Color.Black);
		players[1] = new Player(Color.White);
	}

	public static Game getInstance(){
		if (instance == null) {
			instance = new Game();
		}
		return instance;
	}

	public Board getBoard(){
		return board;
	}
}

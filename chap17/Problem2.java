public class Problem2 {
	public static void main(String[] args) {
		char[][] board = {
			{' ', 'o', 'o'},
			{'o', ' ', ' '},
			{'o', 'o', 'o'}
		};
		char c = 'o';
		if (hasWin(c, board)){
			System.out.println("Win");
		} else {
			System.out.println("No");
		}
	}

	public static boolean hasWin(char c, char[][] board) {
		int m = board.length;
		for (int i = 0 ; i < m ; i ++ ) {
			int j = 0;
			for (j = 0 ; j < m ; j ++ ) {
				if(board[i][j] != c) {
					break;
				}
			}
			if (j == m) {
				return true;	
			}
		}

		for (int j = 0 ; j < m ; j ++ ) {
			int i = 0;
			for (i = 0 ; i < m ; i ++ ) {
				if (board[i][j] != c) {
					break;
				}
			}
			if(i == m) {
				return true;
			}
		}

		int i = 1;
		for (i = 0 ; i < m ; i ++ ) {
			if(board[i][i] != c) {
				break;
			}
		}
		if(i == m) {
			return true;
		}

		i = m-1;
		for (i = m-1 ; i >= 0 ; i -- ) {
			if(board[i][m-1-i] != c){
				break;
			}
		}
		if(i == -1) {
			return true;
		}
		
		return false;
	}
}

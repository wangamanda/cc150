import java.util.ArrayList;

public class Problem9 {
	public static void getBoard(ArrayList<char[][]> array, char[][] board, int j) {
		if (j > 8) {
			return;
		}

		if (j == 8) {
			array.add(board);
			return;
		}

		for (int i = 0 ; i <= 7 ; i ++ ) {
			if (legal(board, i, j)){
				board[i][j] = 'x';
				getBoard(array, board, j+1);
				board[i][j] = ' ';
			}
		}
	}

	public static char[][] copyBoard(char[][] board) {
		char[][] res = new char[8][8];
		for (int i = 0 ; i < 8 ; i ++ ) {
			for (int j = 0 ; j < 8 ; j ++ ) {
				res[i][j] = board[i][j];
			}
		}
		return res;
	}

	public static boolean legal(char[][] board, int m, int n) {
		for (int i = 0 ; i < m ; i ++ ) {
			if (board[i][n] == 'x') {
				return false;
			}
		}

		for (int j = 0 ; j < n ; j ++ ) {
			if (board[m][j] == 'x') {
				return false;
			}
		}

		for (int i = 0 ; i <= 7 ; i ++ ) {
			for (int j = 0 ; j <= 7 ; j ++ ) {
				if (i == m || j == n) {
					continue;
				}
				if (Math.abs(m-i) == Math.abs(n-j) && board[i][j] == 'x'){
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		ArrayList<char[][]> matrix = new ArrayList<char[][]>();
		char[][] board = new char[8][8];
		getBoard(matrix, board, 0);
		System.out.println(matrix.size()+"");
	}
}

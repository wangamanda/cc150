public class Problem7 {
	public static void paint(char[][] matrix, char c, int x, int y) {
		if (x < 0 || x >= matrix[0].length || y < 0 || y >= matrix.length) {
			return;
		}

		if (matrix[y][x] != c) {
			matrix[y][x] = c;
			paint(matrix, c, x+1, y);
			paint(matrix, c, x-1, y);
			paint(matrix, c, x, y+1);
			paint(matrix, c, x, y-1);
		}
	}

	public static void main(String[] args) {
		char[][] matrix = new char[10][8];
		for (int i = 0 ; i < matrix.length ; i ++ ) {
			for (int j = 0 ; j < matrix[0].length ; j ++ ) {
				matrix[i][j] = 'w';
				System.out.print(String.valueOf(matrix[i][j]));
			}	
			System.out.println();
		}
		paint(matrix, 'b', 3, 5);
		for (int i = 0 ; i < matrix.length ; i ++ ) {
			for (int j = 0 ; j < matrix[0].length ; j ++ ) {
				System.out.print(String.valueOf(matrix[i][j]));
			}	
			System.out.println();
		}
	}
}

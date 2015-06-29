public class Problem11 {
	private static int max = Integer.MIN_VALUE;
	public static void main(String[] args) {
		int[][] matrix = {
			{0, 0, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 0},
			{1, 0, 0, 0, 0, 0},
			{1, 1, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0},
			{1, 1, 1, 1, 1, 1}
		};

		findMax(matrix, 0, 0);
		System.out.println(max+"");
	}

	public static void findMax(int[][] matrix, int row, int col) {
		if(row >= matrix.length || col >= matrix[0].length) {
			return;
		}

		if(matrix[row][col] == 1) {
			findMax(matrix, row+1, col);
			findMax(matrix, row, col+1);
			return;
		}

		int n = 0;
		boolean flag = true;
		while(row+n < matrix.length && col+n < matrix[0].length) {
			for(int i = 0; i <= n ; i ++ ) {
				if(matrix[row+i][col] == 1) {
					flag = false;
					break;
				}
				if(matrix[row+i][col+n] == 1) {
					flag = false;
					break;
				}
			}
			for(int i = 0; i <= n ; i ++ ) {
				if(matrix[row][col+i] == 1) {
					flag = false;
					break;
				}
				if(matrix[row+n][col+i] == 1) {
					flag = false;
					break;
				}
			}
			if (flag) {
				if ((n+1)*(n+1) > max) {
					max = (n+1)*(n+1);
				}
				n++;
			} else {
				findMax(matrix, row+1, col);
				findMax(matrix, row, col+1);
				return;
			}
		}
	}
}

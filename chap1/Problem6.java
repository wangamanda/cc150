import java.util.Arrays;

public class Problem6 {
	public static void main (String[] args) {
		int[][] matrix = {
			{11,21,31,41},
			{12,22,32,42},
			{13,23,33,43},
			{14,24,34,44},
		};
		if (matrix.length < 1) {
			return;
		}

		for (int i = 0 ; i < matrix.length ; i ++ ) {
			for (int j = 0 ; j < matrix.length ; j ++ ) {
				System.out.print(String.valueOf(matrix[i][j])+" ");
			}
			System.out.println();
		}
		rotate(matrix);
		System.out.println("Matrix after rotation:");
		for (int i = 0 ; i < matrix.length ; i ++ ) {
			for (int j = 0 ; j < matrix.length ; j ++ ) {
				System.out.print(String.valueOf(matrix[i][j])+" ");
			}
			System.out.println();
		}
	}

	public static void rotate(int[][] matrix) {
		int m = matrix.length;
		for (int i = 0 ; i < m ; i ++ ) {
			for (int j = 0 ; j < m-1-i ; j ++ ) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[m-1-j][m-1-i];
				matrix[m-1-j][m-1-i] = tmp;
			}
		}

		for (int i = 0 ; i < m/2 ; i ++ ) {
			for (int j = 0 ; j < m ; j ++ ) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[m-1-i][j];
				matrix[m-1-i][j] = tmp;
			}
		}
	}
}

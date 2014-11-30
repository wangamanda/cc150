import java.util.Arrays;

public class Problem6 {
	public static void main(String[] args) {
		int[][] matrix = {
		{11,12,13,14,15},
		{21,22,23,24,25},
		{31,32,33,34,35},
		{41,42,43,44,45},
		{51,52,53,54,55}
		};
		int n = matrix.length;
		System.out.println("*******************************");
		for(int i = 0 ; i < n ; i ++ ) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		rotate(matrix, n);
		System.out.println("*******************************");
		for(int i = 0 ; i < n ; i ++ ) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

	public static void rotate(int[][] matrix, int n){
		if(n <= 1) {
			return;
		}
		for(int i = 0 ; i < n ; i ++ ) {
			for(int j = 0 ; j < n-1-i ; j ++ ) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][n-1-i];
				matrix[n-1-j][n-1-i] = tmp;
			}
		}

		for(int i = 0 ; i < n/2 ; i ++ ) {
			for(int j = 0 ; j < n ; j ++ ) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[n-1-i][j];
				matrix[n-1-i][j] = tmp;
			}
		}
	}
}

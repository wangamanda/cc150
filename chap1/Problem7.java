import java.util.Arrays;

public class Problem7 {
	public static void main(String[] args) {
		int[][] matrix = {
			{0,2,3,4,5},
			{1,2,3,4,5},
			{1,2,0,4,5},
			{1,2,3,4,5},
			{1,2,3,4,0}
		};

		int m = matrix.length;
		for(int i = 0 ; i < m ; i ++ ) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		System.out.println("**********************");
		setZero(matrix);
		for(int i = 0 ; i < m ; i ++ ) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

	public static void setZero(int[][] matrix) {
		if(matrix == null || matrix.length < 1 || matrix[0].length < 1) {
			return;
		}
		int m = matrix.length;
		int n = matrix[0].length;
		boolean row = false;
		boolean col = false;
		for(int i = 0 ; i < m ; i ++ ) {
			if(matrix[i][0] == 0) {
				col = true;
			}
		}
		for(int j = 0 ; j < n ; j ++ ) {
			if(matrix[0][j] == 0){
				row = true;
			}
		}
		for(int i = 1 ; i < m ; i ++ ) {
			for(int j = 1 ; j < n ; j ++ ) {
				if(matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}

		for(int i = 1 ; i < m ; i ++ ) {
			if(matrix[i][0] == 0) {
				for(int j = 1 ; j < n ; j ++ ) {
					matrix[i][j] = 0;
				}
			}
		}

		for(int j = 1 ; j < n ; j ++ ) {
			if(matrix[0][j] == 0) {
				for(int i = 1 ; i < m ; i ++ ) {
					matrix[i][j] = 0;
				}
			}
		}

		if(row) {
			for(int j = 0 ;j < n ; j ++ ) {
				matrix[0][j] = 0;
			}
		}

		if(col) {
			for(int i = 0 ; i < m ; i ++ ) {
				matrix[i][0] = 0;
			}
		}
	}
}

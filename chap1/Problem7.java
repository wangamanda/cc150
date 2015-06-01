public class Problem7 {
	public static void main(String[] args) {
		int[][] matrix = {
			{1,0,1,1,1},
			{1,1,1,1,1},
			{1,0,1,0,1},
			{1,1,0,1,1},
			{1,1,1,1,1}
		};
		if (matrix.length < 1 || matrix[0].length < 1) {
			return;
		}

		for (int i = 0 ; i < matrix.length ; i ++ ) {
			for (int j = 0 ; j < matrix[0].length ; j ++ ) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		setZero(matrix);
		System.out.println("Matrix after setting zero:");
		for (int i = 0 ; i < matrix.length ; i ++ ) {
			for (int j = 0 ; j < matrix[0].length ; j ++ ) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void setZero(int[][] matrix) {
		boolean head_row_zero = false;
		boolean head_col_zero = false;
		int row_num = matrix.length;
		int col_num = matrix[0].length;
		for (int j = 0 ; j < col_num ; j ++ ) {
			if (matrix[0][j] == 0) {
				head_row_zero = true;
			}
		}
		for (int i = 0 ; i < row_num ; i ++ ) {
			if (matrix[i][0] == 0) {
				head_col_zero = true;
			}
		}
		for (int i = 1 ; i < row_num ; i ++ ) {
			for (int j = 1 ; j < col_num ; j ++ ) {
				if (matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		for (int i = 0 ; i < row_num ; i ++ ) {
			if (matrix[i][0] == 0) {
				for (int j = 1 ; j < col_num ; j ++ ) {
					matrix[i][j] = 0;
				}
			}
		}
		for (int j = 0 ; j < col_num ; j ++ ) {
			if (matrix[0][j] == 0) {
				for (int i = 1 ; i < row_num ; i ++ ) {
					matrix[i][j] = 0;
				}
			}
		}
		if (head_row_zero) {
			for (int j = 0 ; j < col_num ; j ++ ) {
				matrix[0][j] = 0;
			}
		}
		if (head_col_zero) {
			for (int i = 0 ; i < row_num ; i ++ ) {
				matrix[i][0] = 0;
			}
		}
	}

}

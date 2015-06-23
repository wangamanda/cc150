public class Problem6 {
	public static boolean exist(int[][] matrix, int n) {
		int row = matrix.length;
		int col = matrix[0].length;
		int i = 0;
		int j = col-1;
		while (i < row && j >= 0) {
			if (matrix[i][j] == n) {
				return true;
			} else if (matrix[i][j] > n) {
				j--;
			} else {
				i++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] matrix = {
			{1, 4, 9, 18, 27},
			{5, 10, 15, 20, 30},
			{12, 16, 22, 28, 40},
			{21, 30, 45, 50, 70}
		};
		int n = Integer.parseInt(args[0]);
		boolean res = exist(matrix, n);
		if(res) {
			System.out.println(n+" exists");
		} else {
			System.out.println(n+" doesn't exist");
		}
	}
}

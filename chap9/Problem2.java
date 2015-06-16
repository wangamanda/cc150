import java.util.ArrayList;

public class Problem2 {
	public static int countSetps(int x, int y, ArrayList<Pair> array) {
		int[][] matrix = new int[x+1][y+1];
		matrix[0][0] = 1;
		for (int i = 0 ; i <= x ; i ++ ) {
			Pair p = new Pair(i, 0);
			for (Pair pair : array) {
				if (p.equal(pair)){
					matrix[i][0] = 0;
					break;
				}
			}
			matrix[i][0] = 1;
		}
		for (int j = 0 ; j <= y ; j ++ ) {
			Pair p = new Pair(0, j);
			for (Pair pair : array) {
				if (p.equal(pair)){
					matrix[0][j] = 0;
					break;
				}
			}
			matrix[0][j] = 1;
		}
		for (int i = 1 ; i <= x ; i ++ ) {
			for (int j = 1 ; j <= y ; j ++ ) {
				Pair p = new Pair(i, j);
				for (Pair pair : array) {
					if (p.equal(pair)){
						matrix[i][j] = 0;
						break;
					}
				}
				matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
			}
		}
		return matrix[x][y];
	}

	public static void main(String[] args){
		ArrayList<Pair> array = new ArrayList<Pair>();
		int res = countSetps(Integer.parseInt(args[0]), Integer.parseInt(args[1]), array);
		System.out.println(Integer.toString(res));
	}
}

class Pair {
	int key;
	int value;

	protected Pair(int i, int j) {
		key = i;
		value = j;
	}

	public int getKey(){
		return key;
	}

	public int getValue(){
		return value;
	}
	public boolean equal(Pair pair) {
		return pair.getKey() == key && pair.getValue() == value;		
	}
}

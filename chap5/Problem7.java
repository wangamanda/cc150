import java.util.ArrayList;

public class Problem7 {
	public static int findMissing(ArrayList<Integer> arr, int n) {
		if (arr.size() == 0) {
			return 0;
		}
		ArrayList<Integer> ones = new ArrayList<Integer>();
		ArrayList<Integer> zeros = new ArrayList<Integer>();
		for (int i = 0 ; i < arr.size() ; i ++ ) {
			if (getAt(arr.get(i), n) == 1) {
				ones.add(arr.get(i));
			} else {
				zeros.add(arr.get(i));
			}
		}

		if (ones.size() < zeros.size()) {
			int v = findMissing(ones, n+1);
			return (v << 1) | 1;
		} else {
			int v = findMissing(zeros, n+1);
			return (v << 1) | 0;
		}
	}

	public static int getAt(int m, int n) {
		return (m >> n) & 1 ;
	}

	public static int findMissing(ArrayList<Integer> arr) {
		return findMissing(arr, 0);
	}

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println(Integer.toBinaryString(a));
		for (int i = 0 ; i <= a ; i ++ ) {
			if (i != a/2) {
				arr.add(i);
			}
		}
		System.out.println(Integer.toString(findMissing(arr)));
	}
}

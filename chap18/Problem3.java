import java.util.Random;

public class Problem3{
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for (int i = 0 ; i < args.length ; i ++ ) {
			arr[i] = Integer.parseInt(args[i]);
		}
		int m = 3;
		int[] subset = subSet(arr, m);
		for (int i = 0 ; i < m ; i ++ ) {
			System.out.print(subset[i]+" ");
		}
		System.out.println();
	}

	public static int[] subSet(int[] arr, int m) {
		int[] res = new int[m];
		for (int i = 0 ; i < m ; i ++ ) {
			res[i] = arr[i];
		}
		Random rand = new Random();
		for (int i = m ; i < arr.length ; i ++ ) {
			int r = rand.nextInt(arr[i]);
			if (r < m) {
				res[r] = arr[i];
			}
		}
		return res;
	}
}

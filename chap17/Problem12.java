import java.util.Arrays;

public class Problem12 {
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for (int i = 0 ; i < args.length ; i ++ ) {
			arr[i] = Integer.parseInt(args[i]);
		}
		int m = 100;
		findPairs(arr, m);
	}

	public static void findPairs(int[] arr, int m) {
		if(arr.length <= 1) {
			return;
		}

		Arrays.sort(arr);
		int s = 0;
		int e = arr.length-1;
		while(s < e) {
			if (arr[s] + arr[e] == m) {
				System.out.println(arr[s]+" "+arr[e]);
				s++;
				e--;
			} else if (arr[s] + arr[e] < m) {
				s++;
			} else {
				e--;
			}
		}
	}
}

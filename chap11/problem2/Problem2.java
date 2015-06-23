package problem2;

import java.util.Arrays;

public class Problem2 {
	public static void main(String[] args) {
		Arrays.sort(args, new AnagramComparator());
		for (int i = 0 ; i < args.length ; i ++ ) {
			System.out.print(args[i]+" ");
		}
		System.out.println();
	}
}

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Arrays;

public class Problem6 {
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for (int i = 0 ; i < arr.length ; i ++ ) {
			arr[i] = Integer.parseInt(args[i]);
		}
		int n = 10;
		int[] sub = getSub(arr, n);
		Arrays.sort(arr);
		for(int i = 0 ; i < arr.length ; i ++ ) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Arrays.sort(sub);
		for(int i = 0 ; i < sub.length ; i ++ ) {
			System.out.print(sub[i]+" ");
		}
		System.out.println();
	}

	public static int[] getSub(int[] arr, int n) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(n, Collections.reverseOrder());
		for (int i = 0 ; i < arr.length ; i ++ ) {
			if (queue.size() < n) {
				queue.add(arr[i]);
			} else {
				if(queue.peek() <= arr[i]) {
					continue;
				} else {
					queue.remove(queue.peek());
					queue.add(arr[i]);
				}
			}
		}

		int[] res = new int[n];
		int i = 0;
		for (Integer m : queue) {
			res[i++] = m;
		}
		return res;
	}
}

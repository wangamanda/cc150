import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Arrays;

public class Problem9 {
	private static PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

	private static PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for (int i = 0 ; i < args.length ; i ++ ) {
			int n = Integer.parseInt(args[i]);
			arr[i] = n;
			insert(n);
		}
		for (int i : maxHeap) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : minHeap) {
			System.out.print(i + " ");
		}
		System.out.println();
		int res = getMid();
		System.out.println(res+"");
	}

	public static void insert(int n) {
		if (maxHeap.size() == minHeap.size()) {
			if (minHeap.size() == 0) {
				minHeap.offer(n);
			} else if (maxHeap.peek() > n) {
				minHeap.offer(maxHeap.poll());
				maxHeap.offer(n);
			} else {
				minHeap.offer(n);
			}
		} else {
			if(minHeap.peek() < n) {
				maxHeap.offer(minHeap.poll());
				minHeap.offer(n);
			} else {
				maxHeap.offer(n);
			}
		}
	}

	public static int getMid() {
		if (minHeap.size() == 0) {
			return -1;
		} else if (minHeap.size() - maxHeap.size() == 1) {
			return minHeap.peek();
		} else {
			return (minHeap.peek()+maxHeap.peek())/2;
		}
	}
}

import java.util.LinkedList;
import java.util.Queue;

public class Problem7 {
	public static int findKth(int k) {
		Queue<Integer> queue3 = new LinkedList<Integer>();
		Queue<Integer> queue5 = new LinkedList<Integer>();
		Queue<Integer> queue7 = new LinkedList<Integer>();
		queue3.add(1);
		int val = 1;
		for (int i = 0 ; i <= k ; i ++ ) {
			int val3 = queue3.size() > 0 ? queue3.peek() : Integer.MAX_VALUE;
			int val5 = queue5.size() > 0 ? queue5.peek() : Integer.MAX_VALUE;
			int val7 = queue7.size() > 0 ? queue7.peek() : Integer.MAX_VALUE;
			val = Math.min(val3, Math.min(val5, val7));
			if (val == val3) {
				queue3.remove();
				queue3.add(val*3);
				queue5.add(val*5);
				queue7.add(val*7);
			} else if (val == val5) {
				queue5.remove();
				queue5.add(val*5);
				queue7.add(val*7);
			} else if (val == val7){
				queue7.remove();
				queue7.add(val*7);
			} else {
				return -1;
			}
		}
		return val;
	}

	public static void main(String[] args) {
		int k = Integer.parseInt(args[0]);
		int res = findKth(k);
		System.out.println(k + "th number is: " + res);
	}
}

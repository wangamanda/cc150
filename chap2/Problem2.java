package chap2;

public class Problem2 {
	public static void main(String[] args) {
		Node start = null;
		for (int i = 0 ; i < args.length ; i ++ ) {
			int n = Integer.parseInt(args[i]);
			if (start == null) {
				start = new Node(n);
			} else {
				start.appendToTail(n);
			}
		}
		int k = findKthToLast(3, start);
		System.out.println(String.valueOf(k));
	}

	public static int findKthToLast(int n, Node node) {
		Node former = node;
		while (n > 1) {
			former = former.next;
			n--;
		}
		Node cur = node;
		while (former.next != null) {
			former = former.next;
			cur = cur.next;
		}
		return cur.val;
	} 
}

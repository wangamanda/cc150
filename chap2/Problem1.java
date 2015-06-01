package chap2;

public class Problem1 {
	public static void main(String[] args) {
		Node start = new Node(0);
		for (int i = 0 ; i < args.length ; i ++ ) {
			int n = Integer.parseInt(args[i]);
			start.appendToTail(n);
		}
		removeDuplicate(start);
		while (start.next != null) {
			System.out.print(start.val+" ");
			start = start.next;
		}
		System.out.print(start.val + " ");
	}

	public static void removeDuplicate (Node node) {
		if (node == null || node.next == null) {
			return;
		}

		Node former = node;
		Node cur = node;
		while (cur != null && cur.next != null) {
			while (former.next != null) {
				if (former.next.val == cur.val) {
					former.next = former.next.next;
				} else {
					former = former.next;
				}
			}
			cur = cur.next;
			former = cur;
		}
	}
}

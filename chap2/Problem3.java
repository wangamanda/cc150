package chap2;

public class Problem3 {
	public static void main(String[] args) {
		Node start = null;
		Node toDelete = null;
		for (int i = 0 ; i < args.length ; i ++ ) {
			int n = Integer.parseInt(args[i]);
			if (start == null) {
				start = new Node(n);
			} else {
				start.appendToTail(n);
			}
		}
		delete(start.next.next);
		Node cur = start;
		while(cur != null) {
			System.out.print(cur.val+" ");
			cur = cur.next;
		}
		System.out.println();
	}

	public static void delete(Node node) {
		if (node == null) {
			return;
		}
		if (node.next == null) {//This doesn't work
			node = null;
			return;
		}
		node.val = node.next.val;
		node.next = node.next.next;
	}
}

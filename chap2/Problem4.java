package chap2;

public class Problem4 {
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
		Node cur = partition(start, 5);
		while(cur != null) {
			System.out.print(cur.val+" ");
			cur = cur.next;
		}
		System.out.println();
	}

	public static Node partition(Node node, int n) {
		if (node == null || node.next == null) {
			return node;
		}
		Node fakeNode = new Node(0);
		fakeNode.next = node;
		Node cur = fakeNode;
		while(cur.next != null) {
			if (cur.next.val < n) {
				cur = cur.next;
			} else {
				break;
			}
		}
		if (cur.next == null) {
			return fakeNode.next;
		}
		Node former = cur;
		while(former.next != null) {
			if(former.next.val < n) {
				Node tmp = former.next;
				former.next = former.next.next;
				tmp.next = cur.next;
				cur.next = tmp;
				cur = cur.next;
			} else {
				former = former.next;
			}
		}
		return fakeNode.next;
	}
}

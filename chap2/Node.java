package chap2;

public class Node {
	int val;
	Node next;

	public Node (int n) {
		val = n;
		next = null;
	}

	public void appendToTail(int n) {
		Node d = new Node(n);
		Node cur = this;
		while (cur.next != null) {
			cur = cur.next;
		}

		cur.next = d;
	}
}

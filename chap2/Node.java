package chap2;

public class Node {
	public int val;
	public Node next;

	public Node (int n) {
		val = n;
		next = null;
	}

	public String toString() {
		return val+" ";
	}
}

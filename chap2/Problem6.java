package chap2;

import java.util.Stack;

public class Problem6 {
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
		Node node = start;
		while (node.next != null) {
			node = node.next;
		}
		node.next = start.next.next;
		System.out.println("Starting node of the circle is: " + findCircleStart(start));
	}

	public static int findCircleStart (Node head) {
		Node runner = head;
		Node cur = head;
		while (runner != null && runner.next != null) {
			runner = runner.next.next;
			cur = cur.next;
			if (cur == runner) {
				break;
			}
		}
		if (runner == null || runner.next == null) {
			return -1;
		}
		cur = head;
		while (cur != runner) {
			cur = cur.next;
			runner = runner.next;
		}
		return cur.val;
	}
}

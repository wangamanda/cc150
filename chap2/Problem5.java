package chap2;

import java.util.Stack;

public class Problem5 {
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
		Node start2 = new Node(8);
		start2.appendToTail(6);
		start2.appendToTail(4);
		start2.appendToTail(2);
		int res = sum(start, start2);
		System.out.println("Sum is: " + res);
	}

	public static int sum (Node node1, Node node2) {
		Node fakeNode1 = new Node(0);
		fakeNode1.next = node1;
		Node fakeNode2 = new Node(0);
		fakeNode2.next = node2;
		Node cur1 = fakeNode1;
		Node pre1 = fakeNode1.next;
		while (pre1 != null && pre1.next != null) {
			Node tmp = pre1.next;
			pre1.next = pre1.next.next;
			tmp.next = cur1.next;
			cur1.next = tmp;
		}
		Node cur2 = fakeNode2;
		Node pre2 = fakeNode2.next;
		while (pre2 != null && pre2.next != null) {
			Node tmp = pre2.next;
			pre2.next = pre2.next.next;
			tmp.next = cur2.next;
			cur2.next = tmp;
		}
		int res = 0;
		int carry = 0;
		int val = 1;
		while (cur1.next != null && cur2.next != null) {
			int num = cur1.next.val + cur2.next.val + carry;
			carry = num / 10;
			res += val * (num % 10);
			val *= 10;
			cur1 = cur1.next;
			cur2 = cur2.next;
		}
		while (cur1.next != null) {
			int num = cur1.next.val + carry;
			carry = num / 10;
			res += val * (num % 10);
			val *= 10;
			cur1 = cur1.next;
		}
		while (cur2.next != null) {
			int num = cur2.next.val + carry;
			carry = num / 10;
			res += val * (num % 10);
			val *= 10;
			cur2 = cur2.next;
		}
		if (carry != 0) {
			res += val * carry;
		}
		return res;
	}
}

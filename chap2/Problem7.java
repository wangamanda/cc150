package chap2;

import java.util.Stack;

public class Problem7 {
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		n1.next = n2;
		Node n3 = new Node(3);
		n2.next = n3;
		Node n4 = new Node(5);
		n3.next = n4;
		Node n8 = new Node(4);
		n4.next = n8;
		Node n5 = new Node(3);
		n8.next = n5;
		Node n6 = new Node(2);
		n5.next = n6;
		Node n7 = new Node(1);
		n6.next = n7;
		if(isPalindrome(n1)) {
			System.out.println("Is palindrome");
		} else {
			System.out.println("Is NOT palindrome");
		}
	}

	public static boolean isPalindrome(Node n) {
		if(n == null || n.next == null) {
			return true;
		}
		Stack<Integer> stack = new Stack<Integer>();
		Node cur = n;
		int i = 0;
		while(cur != null) {
			stack.push(cur.val);
			cur = cur.next;
			i++;
		}
		cur = n;
		for(int j = 0 ; j < i/2 ; j++) {
			int tmp = stack.pop();
			if(tmp != cur.val) {
				return false;
			}
			cur = cur.next;
		}
		return true;
	}
}

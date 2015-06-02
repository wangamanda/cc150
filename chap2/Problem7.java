package chap2;

import java.util.Stack;

public class Problem7 {
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
		if (isPalindrome(start)) {
			System.out.println("The linked list is palindrome");
		} else {
			System.out.println("The linked list is NOT palindrome");
		}
	}

	public static boolean isPalindrome(Node node) {
		Stack<Integer> stack = new Stack<Integer>();
		int count = 0;
		Node cur = node;
		while(cur != null) {
			stack.push(cur.val);
			cur = cur.next;
			count ++ ;
		}
		cur = node;
		for (int i = 0 ; i < count/2 ; i ++ ) {
			int s = stack.pop();
			if (s != cur.val) {
				return false;
			}
			cur = cur.next;
		}
		return true;		
	}
}

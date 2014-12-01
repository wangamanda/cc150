package chap2;

public class Problem1 {
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		n1.next = n2;
		Node n3 = new Node(3);
		n2.next = n3;
		Node n4 = new Node(1);
		n3.next = n4;
		Node n5 = new Node(2);
		n4.next = n5;
		Node n6 = new Node(3);
		n5.next = n6;
		Print(n1);
		removeDuplicate(n1);
		Print(n1);
	}

	public static void removeDuplicate(Node n) {
		if(n == null || n.next == null) {
			return;
		}

		Node cur = n;
		while(cur != null) {
			Node runner = cur;
			while(runner.next != null) {
				if(runner.next.val == cur.val) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			cur = cur.next;
		}
	}

	public static void Print(Node n) {
		Node cur = n;
		while(cur != null) {
			System.out.print(cur.val+" ");
			cur = cur.next;
		}
		System.out.println();
	}
}

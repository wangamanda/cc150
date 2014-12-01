package chap2;

public class Problem2 {
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		n1.next = n2;
		Node n3 = new Node(3);
		n2.next = n3;
		Node n4 = new Node(4);
		n3.next = n4;
		Node n5 = new Node(5);
		n4.next = n5;
		Node n6 = new Node(6);
		n5.next = n6;
		Node res = findKth(n1, 4);
		System.out.println("4th to last element is "+res.val+".");
	}

	public static Node findKth(Node n, int k) {
		boolean found = true;
		Node cur = n;
		for(int i = 1 ; i < k ; i ++ ) {
			if(cur == null) {
				found = false;
				break;
			}
			cur = cur.next;
		}
		Node res = n;
		if(found && cur != null) {
			while(cur.next != null) {
				cur = cur.next;
				res = res.next;
			}
			return res;
		} else {
			return null;
		}
	}
}

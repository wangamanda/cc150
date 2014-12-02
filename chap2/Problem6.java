package chap2;

public class Problem6 {
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
		n6.next = n3;
		Node n = circleStart(n1);
		System.out.println(n.val);
	}

	public static Node circleStart(Node n) {
		if(n == null || n.next == null) {
			return null;
		}

		Node current = n.next;
		Node runner = n.next.next;
		while(runner != null && runner.next != null && runner != current) {
			current = current.next;
			runner = runner.next.next;
		}

		if(runner == null || runner.next == null) {
			return null;
		}

		current = n;
		while(current != runner) {
			current = current.next;
			runner = runner.next;
		}
		return current;
	}


}

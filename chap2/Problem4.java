package chap2;

public class Problem4 {
	public static void main(String[] args) {
		Node n1 = new Node(6);
		Node n2 = new Node(3);
		n1.next = n2;
		Node n3 = new Node(8);
		n2.next = n3;
		Node n4 = new Node(4);
		n3.next = n4;
		Node n5 = new Node(6);
		n4.next = n5;
		Node n6 = new Node(7);
		n5.next = n6;
		Node n7 = new Node(5);
		n6.next = n7;
		Print(n1);
		Node n = convert(n1, 6);
		Print(n);
	}

	public static Node convert(Node n, int k) {
		Node fakeHead = new Node(0);
		fakeHead.next = n;
		Node cur = fakeHead;
		Node flag = fakeHead.next;
		while(flag != null) {
			if(flag.val < k) {
				flag = flag.next;
			} else {
				break;
			}
		}
		if(flag == null) {
			return fakeHead.next;
		}

		Node runner = flag;
		while(runner.next != null) {
			if(runner.next.val >= k) {
				runner = runner.next;
			} else {
				Node tmp = runner.next;
				runner.next = runner.next.next;
				tmp.next = fakeHead.next;
				fakeHead.next = tmp;
			}
		}
		return fakeHead.next;
	}

	public static void Print(Node n) {
		if(n == null) {
			return;
		}
		Node cur = n;
		while(cur != null) {
			System.out.print(cur.val+"");
			cur = cur.next;
		}
		System.out.println();
	}
}

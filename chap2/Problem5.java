package chap2;

public class Problem5 {
	public static void main(String[] args) {
		Node n1 = new Node(6);
		Node n2 = new Node(1);
		n1.next = n2;
		Node n3 = new Node(7);
		n2.next = n3;
		Node n4 = new Node(3);
		Node n5 = new Node(9);
		n4.next = n5;
		Node n6 = new Node(5);
		n5.next = n6;
		Print(n1);
		System.out.println("+");
		Print(n4);
		System.out.println("---------------");
		Node n = sum(n1, n4);
		Print(n);
	}

	public static Node sum(Node n1, Node n2) {
		Node fake1 = new Node(0);
		if(n1 != null && n1.next != null) {
			fake1.next = n1;
			Node runner1 = fake1.next;
			while(runner1.next != null) {
				Node tmp = runner1.next;
				runner1.next = runner1.next.next;
				tmp.next = fake1.next;
				fake1.next = tmp;
			}
			n1 = fake1.next;
		}

		Node fake2 = new Node(0);
		if(n2 != null && n2.next != null) {
			fake2.next = n2;
			Node runner2 = fake2.next;
			while(runner2.next != null) {
				Node tmp = runner2.next;
				runner2.next = runner2.next.next;
				tmp.next = fake2.next;
				fake2.next = tmp;
			}
			n2 = fake2.next;
		}
		
		
		Node fake = new Node(0);
		int sum = 0;
		n1 = fake1.next;
		n2 = fake2.next;
		while(n1 != null && n2 != null) {
			int tmp = (n1.val+n2.val+sum)%10;
			sum = (n1.val+n2.val+sum)/10;
			Node newNode = new Node(tmp);
			newNode.next = fake.next;
			fake.next = newNode;
			n1 = n1.next;
			n2 = n2.next;
		}

		while(n1 != null) {
			int tmp = (n1.val+sum)%10;
			sum = (n1.val+sum)/10;
			Node newNode = new Node(tmp);
			newNode.next = fake.next;
			fake.next = newNode;
			n1 = n1.next;
		}

		while(n2 != null) {
			int tmp = (n2.val+sum)%10;
			sum = (n2.val+sum)/10;
			Node newNode = new Node(tmp);
			newNode.next = fake.next;
			fake.next = newNode;
			n2 = n2.next;
		}

		if(sum != 0) {
			Node newNode = new Node(sum);
			newNode.next = fake.next;
			fake.next = newNode;
		}

		return fake.next;
	}

	public static void Print(Node n) {
		Node cur = n;
		while(cur != null) {
			System.out.print(cur.val);
			cur = cur.next;
		}
		System.out.println();
	}
}

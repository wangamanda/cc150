package problem13;

public class Problem13 {
	public static void main(String[] args) {
		TreeNode root = null;
		for (int i = 0 ; i < args.length ; i ++ ) {
			int n = Integer.parseInt(args[i]);
			if (root == null) {
				root = new TreeNode(n);
			} else {
				root.insert(n);
			}
		}
		Node node = changeToList(root);
		Node last = null;
		while (node != null) {
			System.out.print(node.value+" ");
			if (node.next == null) {
				last = node;
			}
			node = node.next;
		}
		System.out.println();
		while (last != null) {
			System.out.print(last.value+" ");
			last = last.parent;
		}
		System.out.println();
	}

	public static Node changeToList(TreeNode root) {
		Node left = null;
		Node right = null;
		if (root.left != null) {
			left = changeToList(root.left);
		}
		if (root.right != null) {
			right = changeToList(root.right);
		}
		Node node = new Node(root.val);
		Node cur = merge(left, node, right);
		return cur;
	}

	public static Node merge(Node left, Node node, Node right) {
		Node cur = null;
		if(left != null) {
			cur = left;
		} else {
			cur = node;
		}
		Node tmp = cur;
		if (cur == left) {
			while(tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = node;
			node.parent = tmp;
		}
		while(tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = right;
		if(right != null) {
			right.parent = tmp;
		}
		return cur;
	}
}

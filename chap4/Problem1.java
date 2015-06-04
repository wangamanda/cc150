package chap4;

public class Problem1 {
	public static void main(String[] args) {
		TreeNode head = new TreeNode (1);
		TreeNode left = new TreeNode (2);
		head.left = left;
		TreeNode right = new TreeNode(3);
		head.right = right;
		TreeNode left1 = new TreeNode(4);
		left.left = left1;
		TreeNode left2 = new TreeNode(5);	
		left1.left = left2;
		if (head.isBalanced()) {
			System.out.println("Is balanced");
		} else {
			System.out.println("Not balanced");
		}
	}
}

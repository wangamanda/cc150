package chap4;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	int height;

	public TreeNode(int n) {
		val = n;
		left = null;
		right = null;
		height = 1;
	}

	public void setHeight(int n) {
		height = n;
	}

	public int getHeight() {
		if (this == null) {
			return 0;
		}
		if (left == null && right == null) {
			return 1;
		}
		if (left == null) {
			return right.getHeight()+1;
		}
		if (right == null) {
			return left.getHeight()+1;
		}
		return Math.max(left.getHeight(), right.getHeight())+1;
	}

	public boolean isBalanced() {
		if (this == null) {
			return true;
		}
		if (left == null && right == null) {
			return true;
		}
		if (left == null) {
			return right.getHeight() <= 1;
		}
		if (right == null) {
			return left.getHeight() <= 1;
		}
		if (Math.abs(left.getHeight() - right.getHeight()) <= 1) {
			return true;
		}
		return false;
	}
}

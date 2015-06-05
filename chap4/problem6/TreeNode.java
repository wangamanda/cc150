package problem6;

public class TreeNode {
	TreeNode left;
	TreeNode right;
	TreeNode parent;
	int val;

	public TreeNode(int n) {
		val = n;
		right = null;
		left = null;
		parent = null;
	}

	public void setLeft(TreeNode node) {
		left = node;
		node.parent = this;
	}

	public void setRight(TreeNode node) {
		right = node;
		node.parent = this;
	}
}

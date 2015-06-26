package problem13;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int v) {
		val = v;
		left = null;
		right = null;
	}

	public void insert(int v) {
		if (v <= val) {
			if (left == null) {
				left = new TreeNode(v);
			} else {
				left.insert(v);
			}
		} else {
			if (right == null) {
				right = new TreeNode(v);
			} else {
				right.insert(v);
			}
		}
	}
}

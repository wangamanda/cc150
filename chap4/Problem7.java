package chap4;
import java.util.Arrays;

public class Problem7 {
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		TreeNode p, q;
		for (int i = 0 ; i < args.length ; i ++ ) {
			arr[i] = Integer.parseInt(args[i]);
		}
		Arrays.sort(arr);
		TreeNode node = createBST(arr, 0, arr.length-1);
		TreeNode res = LCA(node, node.right.right, node.right.right.right);
		System.out.println(res.val+"");
	}

	public static TreeNode createBST(int[] arr, int start, int end) {
		if(start > end) {
			return null;
		}
		int mid = start + (end-start)/2;
		TreeNode head = new TreeNode(arr[mid]);
		head.left = createBST(arr, start, mid-1);
		head.right = createBST(arr, mid+1, end);
		return head;
	}

	public static TreeNode LCA (TreeNode node, TreeNode p, TreeNode q) {
		ResultWrapper res = findLCA(node, p, q); 
		if(res.found) {
			return res.node;
		}
		return null;
	}

	public static ResultWrapper findLCA(TreeNode node, TreeNode p, TreeNode q) {
		if (node == null) {
			return new ResultWrapper(null, false);
		}
		if (node == p && node == q) {
			return new ResultWrapper(node, true);
		}

		ResultWrapper left = findLCA(node.left, p, q);
		if (left.found) {
			return left;
		}

		ResultWrapper right = findLCA(node.right, p, q);
		if (right.found) {
			return right;
		}

		if (left.node != null && right.node != null) {
			return new ResultWrapper(node, true);
		} else if (node == p || node == q) {
			return new ResultWrapper(node, left.node != null || right.node != null);
		} else {
			return new ResultWrapper(left.node != null ? left.node : right.node, false);
		}
	}
}

class ResultWrapper{
	TreeNode node;
	boolean found;
	public ResultWrapper(TreeNode n, boolean b) {
		node = n;
		found = b;
	}
}

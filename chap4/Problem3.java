package chap4;
import java.util.Stack;

public class Problem3 {
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for (int i = 0 ; i < args.length ; i ++ ) {
			arr[i] = Integer.parseInt(args[i]);
		}
		TreeNode node = createBST(arr);
		printTree(node);
	}

	public static TreeNode createBST(int[] arr) {
		TreeNode root = null;
		if(arr == null || arr.length < 1) {
			return root;
		}
		return createBST(arr, 0, arr.length-1);
	}

	public static TreeNode createBST(int[] arr, int start, int end) {
		if(start > end) {
			return null;
		}
		int mid = start+(end-start)/2;
		TreeNode root = new TreeNode(arr[mid]);
		root.left = createBST(arr, start, mid-1);
		root.right = createBST(arr, mid+1, end);
		return root;
	}

	public static void printTree(TreeNode node) {
		TreeNode cur = node;
		if(node == null) {
			return;
		}

		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(!stack.isEmpty() || cur != null) {
			if(cur != null) {
				stack.push(cur);
				cur = cur.left;
			} else {
				cur = stack.pop();
				System.out.print("current:"+cur.val+" ");
				if(cur.left != null) {
					System.out.print("left:"+cur.left.val+" ");
				}
				if(cur.right != null) {
					System.out.print("right:"+cur.right.val+"");
				}
				System.out.println();
				cur = cur.right;
			}
		}
	}
}

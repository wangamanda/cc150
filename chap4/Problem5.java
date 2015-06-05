package chap4;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class Problem5 {
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for (int i = 0 ; i < args.length ; i ++ ) {
			arr[i] = Integer.parseInt(args[i]);
		}
		TreeNode node = createBST(arr);
		if (checkBST(node)) {
			System.out.println("Is BST");
		} else {
			System.out.println("Is NOT BST");
		}
	}

	public static boolean checkBST(TreeNode node) {
		return checkBST(node, null, null);
	}

	public static boolean checkBST(TreeNode node, Integer max, Integer min) {
		if (node == null) {
			return true;
		}

		if ((max != null && node.val >= max) || (min != null && node.val < min)) {
			return false;
		}

		if (!checkBST(node.left, node.val, min) || !checkBST(node.right, max, node.val)) {
			return false;
		}
		return true;
	}

	public static boolean isBST(TreeNode node) {
		List<Integer> arr = getInOrder(node);
		int cur = arr.get(0);
		for (int i = 1 ; i < arr.size() ; i ++ ) {
			if(cur > arr.get(i)) {
				return false;
			}
			cur = arr.get(i);
		}
		return true;
	}

	public static List<Integer> getInOrder(TreeNode node) {
		TreeNode cur = node;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		List<Integer> list = new ArrayList<Integer>();
		while(!stack.isEmpty() || cur != null) {
			if(cur != null) {
				stack.push(cur);
				cur = cur.left;
			} else {
				cur = stack.pop();
				list.add(cur.val);
				cur = cur.right;
			}
		}
		return list;
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
}

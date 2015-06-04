package chap4;
import java.util.ArrayList;
import java.util.LinkedList;

public class Problem4 {
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for (int i = 0 ; i < args.length ; i ++ ) {
			arr[i] = Integer.parseInt(args[i]);
		}
		TreeNode node = createBST(arr);
		ArrayList<LinkedList<TreeNode>> D = getLayers(node);
		for (LinkedList<TreeNode> list : D) {
			for(TreeNode n : list) {
				System.out.print(n.val+" ");
			}
			System.out.println();
		}
	}

	public static ArrayList<LinkedList<TreeNode>> getLayers(TreeNode node) {
		ArrayList<LinkedList<TreeNode>> res = new ArrayList<LinkedList<TreeNode>>();
		if (node == null) {
			return res;
		}
		LinkedList<TreeNode> cur = new LinkedList<TreeNode>();
		cur.add(node);
		while(cur.size() != 0) {
			res.add(cur);
			LinkedList<TreeNode> curr = new LinkedList<TreeNode>();
			for (TreeNode n : cur) {
				if(n.left != null) {
					curr.add(n.left);
				}
				if(n.right != null) {
					curr.add(n.right);
				}
			}
			cur = curr;
		}
		return res;
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

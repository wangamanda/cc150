package chap4;
import java.util.Arrays;
import java.util.Stack;

public class Problem8 {
	public static boolean containsTree(TreeNode n1, TreeNode n2) {
		if (n2 == null) {
			return true;
		}
		return contains(n1, n2);
	}
	
	public static boolean contains(TreeNode n1, TreeNode n2) {
		if (n1 == null) {
			return false;
		}
		if (n1.val == n2.val) {
			if(match(n1, n2)) {
				return true;
			}
		}
		return contains(n1.left, n2) || contains(n1.right, n2);
	}

	public static boolean match(TreeNode n1, TreeNode n2) {
		if (n1 == null && n2 == null) {
			return true;
		}
		if (n1 == null || n2 == null) {
			return false;
		}
		if (n1.val != n2.val) {
			return false;
		}
		return match(n1.left, n2.left) && match(n1.right, n2.right);
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

	public static void main(String[] args) {
		if(args.length != 13) {
			System.out.println("Input error.");
			return;
		}
		int[] arr1 = new int[9];
		int[] arr2 = new int[4];
		for (int i = 0 ; i < 9 ; i ++ ) {
			arr1[i] = Integer.parseInt(args[i]);
		}
		for (int i =  9 ; i < 13 ; i ++ ) {
			arr2[i-9] = Integer.parseInt(args[i]);
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		TreeNode n1 = createBST(arr1, 0, 8);
		TreeNode n2 = createBST(arr2, 0, 3);
		if(containsTree(n1, n2)) {
			System.out.println("Tree1 contains Tree2");
		} else {
			System.out.println("Tree1 does NOT contain Tree2");
		}
		printTree(n1);
		printTree(n2);
	}

	public static TreeNode createBST(int[] arr, int start, int end) {
		if(start > end) {
			return null;
		}
		int mid = start+(end-start)/2;
		TreeNode head = new TreeNode(arr[mid]);
		head.left = createBST(arr, start, mid-1);
		head.right = createBST(arr, mid+1, end);
		return head;
	}
}

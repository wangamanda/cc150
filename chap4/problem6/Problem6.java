package problem6;
import java.util.Arrays;

public class Problem6 {
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for (int i = 0 ; i < arr.length ; i ++ ) {
			arr[i] = Integer.parseInt(args[i]);
		}
		TreeNode head = createBST(arr);
		TreeNode node = findSuccessor(head);
		System.out.println("Successor of root: "+node.val);
		node = findSuccessor(head.left.left);
		System.out.println("Successor of root.left.left: "+node.val);
		node = findSuccessor(head.left.right);
		System.out.println("Successor of root.left.right: "+node.val);
		node = findSuccessor(head.right.right.right);
		System.out.println("Successor of root.right.right.right: "+(node == null ? -1:node.val));
	}

	public static TreeNode findSuccessor(TreeNode node) {
		if(node == null) {
			return null;
		}
		if(node.right != null) {
			TreeNode cur = node.right;
			while(cur.left != null) {
				cur = cur.left;
			}
			return cur;
		} else {
			TreeNode cur = node;
			while(cur.parent != null) {
				TreeNode tmp = cur.parent;
				if(tmp.left == cur) {
					return tmp;
				}
				cur = cur.parent;
			}
		}
		return null;
	}

	public static TreeNode createBST(int[] arr) {
		Arrays.sort(arr);
		return createBST(arr, 0, arr.length-1);
	}

	public static TreeNode createBST(int[] arr, int start, int end) {
		if(start > end) {
			return null;
		}
		int mid = start + (end-start)/2;
		TreeNode head = new TreeNode(arr[mid]);
		TreeNode left = createBST(arr, start, mid-1);
		TreeNode right = createBST(arr, mid+1, end);
		head.left = left;
		if(left != null) {
			left.parent = head;
		}
		head.right = right;
		if(right != null) {
			right.parent = head;
		}
		return head;
	}
}

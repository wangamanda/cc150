package chap4;

public class Problem9 {
	public static void findSum (TreeNode node, int n) {
		int depth = depth(node);
		int[] arr = new int[depth];
		findSum(node, n, arr, 0);
	}

	public static void findSum(TreeNode node, int n, int[] arr, int level) {
		if(node == null || level >= arr.length) {
			return;
		}
		arr[level] = node.val;
		int sum = 0;
		for (int i = level ; i >= 0 ; i -- ) {
			sum += arr[i];
			if (sum == n) {
				printPath(arr, i, level);
			}
		}
		findSum(node.left, n, arr, level+1);
		findSum(node.right, n, arr, level+1);
	}

	public static void printPath(int[] arr, int start, int end) {
		for (int i = start ; i <= end ; i ++ ) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static int depth(TreeNode node) {
		if(node == null) {
			return 0;
		}
		return 1+Math.max(depth(node.left), depth(node.right));
	}

	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for (int i = 0 ; i < args.length; i ++ ) {
			arr[i] = Integer.parseInt(args[i]);
		}
		TreeNode node = createBST(arr, 0, args.length-1);
		findSum(node, 7);
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

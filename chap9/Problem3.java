import java.util.Arrays;

public class Problem3 {
	public static int binarySearch(int[] arr) {
		return binarySearch(arr, 0, arr.length-1);
	}

	public static int binarySearch(int[] arr, int start, int end) {
		if (start > end || start < 0 || end >= arr.length) {
			return -1;
		}

		int mid = start + (end-start)/2;
		if (arr[mid] == mid) {
			return mid;
		}

		int left = binarySearch(arr, start, Math.min(mid-1, arr[mid]));
		if (left >= 0) {
			return left;
		}

		int right = binarySearch(arr, Math.max(mid+1, arr[mid]), end);
		return right;
	}

	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for (int i = 0 ; i < args.length ; i ++ ) {
			arr[i] = Integer.parseInt(args[i]);
		}
		Arrays.sort(arr);
		int res = binarySearch(arr);
		System.out.println(Integer.toString(res));
	}
}

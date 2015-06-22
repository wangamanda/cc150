import java.util.Arrays;

public class BS{
	public static int binarySearch(int[] array, int n) {
		int left = 0;
		int right = array.length-1;
		while(left <= right) {
			int mid = left + (right - left)/2;
			if (array[mid] == n) {
				return mid;
			} else if (array[mid] > n) {
				right = mid-1;
			} else {
				left = mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = new int[args.length];
		for (int i = 0; i < array.length ; i ++ ) {
			array[i] = Integer.parseInt(args[i]);
		}
		Arrays.sort(array);
		int res = binarySearch(array, 6);
		System.out.println(res+"");
	}
}

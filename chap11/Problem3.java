import java.util.Arrays;

public class Problem3 {
	public static int findNum(int[] array, int n) {
		int left = 0;
		int right = array.length-1;
		while(left <= right) {
			int mid = left + (right-left)/2;
			if (array[mid] == n) {
				return mid;
			} else if (n > array[mid]) {
				if (array[right] <= array[mid]) {
					left = mid+1; 
				} else if (n <= array[right]){
					left = mid+1; 
				} else {
					right = mid-1;
				}
			} else {
				if (array[left] >= array[mid]) {
					right = mid-1;
				} else if (n >= array[left]){
					right = mid-1;
				} else {
					left = mid+1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = new int[args.length];
		int n = 0;
		for (int i = 0 ; i < array.length ; i ++ ) {
			array[i] = Integer.parseInt(args[i]);
		}
		n = 11;
		Arrays.sort(array);
		int[] arr = rotate(array);
		int res = findNum(arr, n);
		for (int i = 0 ; i < arr.length ; i ++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(res+"");
	}

	public static int[] rotate(int[] array) {
		int[] tmp = new int[array.length];
		for (int i = 0 ; i < array.length ; i ++ ) {
			tmp[i] = array[(i+5)%(array.length)];
		}
		return tmp;
	}
}

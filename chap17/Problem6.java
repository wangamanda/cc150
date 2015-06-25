public class Problem6 {
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for (int i = 0 ; i < arr.length ; i ++ ) {
			arr[i] = Integer.parseInt(args[i]);
		}
		findSubArray(arr);
	}

	public static void findSubArray(int[] arr) {
		if(arr.length < 1) {
			System.out.println("-1, -1");
			return;
		}
		int s = 0;
		int e = arr.length-1;
		int i = s;
		int j = e;
		while (i < e) {
			if(arr[i] <= arr[i+1]){
				i++;
			} else {
				break;
			}
		}
		if (i == e) {
			System.out.println("-1, -1");
			return;
		}
		while (j > 0) {
			if(arr[j] >= arr[j-1]){
				j--;
			} else {
				break;
			}
		}
		int m = Integer.MAX_VALUE;
		int n = Integer.MIN_VALUE;
		for (int k = i ; k <= j ; k ++ ) {
			if (arr[k] < m) {
				m = arr[k];
			}
			if(arr[k] > n) {
				n = arr[k];
			}
		}
		i = s;
		j = e;
		while (i <= e) {
			if(arr[i] < m) {
				i++;
			} else {
				break;
			}
		} 
		while (j >= 0) {
			if(arr[j] > n) {
				j--;
			} else {
				break;
			}
		}
		System.out.println(i+", "+j);
	}
}

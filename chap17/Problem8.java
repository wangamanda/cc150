public class Problem8 {
	public static int sum (int[] arr) {
		int max = Integer.MIN_VALUE;
		int curSum = 0;
		if (arr.length < 1) {
			return max;
		}

		max = arr[0];
		curSum += max;
		for (int i = 1 ; i < arr.length ; i ++ ) {
			if (curSum + arr[i] > 0) {
				curSum += arr[i];
			} else {
				curSum = arr[i];
			}

			if(curSum > max) {
				max = curSum;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for(int i = 0 ; i < args.length ; i ++ ) {
			arr[i] = Integer.parseInt(args[i]);
		}
		int res = sum(arr);
		System.out.println(res+"");
	}
}

public class Problem1 {
	public static int countSteps(int n) {
		int[] arr = new int[n+1];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;
		for (int i = 3 ; i <= n ; i ++ ) {
			arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
		}
		return arr[n];		
	}

	public static void main(String[] args) {
		int res = countSteps(Integer.parseInt(args[0]));
		System.out.println(Integer.toString(res));
	}
}

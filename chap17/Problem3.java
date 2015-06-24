public class Problem3 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int m = getZeros(n);
	}

	public static int getZeros(int n) {
		long mul = 1;
		int res = 0;
		System.out.println("number: "+n);
		for (int i = 1 ; i  <= n ; i ++ ) {
			res += fac5(i);
		}
		System.out.println("number of zeros: "+res);
		return res;
	}

	public static int fac5(int n) {
		int cnt = 0;
		while(n % 5 == 0) {
			n /= 5;
			cnt++;
		}
		return cnt;
	}
}

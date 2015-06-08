public class Problem1 {
	public static void main(String[] args) {
		int M = Integer.parseInt("10011",2);
		int N = Integer.parseInt("10000000000",2);
		int i = 2;
		int j = 6;
		int res = createRes(M,N,i,j);
		System.out.println(Integer.toBinaryString(res));
	}

	public static int createRes(int m, int n, int i, int j) {
		int allOnes = ~0;
		int left = allOnes << (j+1);
		int right = (1 << i)-1;
		int mask = left | right;
		int n_cleared = n & mask;
		int res = n_cleared | (m << i);
		return res;
	}
}

public class Problem5 {
	public static int findDiffNum1(int a, int b) {
		int count = 0;
		for (int c = a ^ b ; c != 0 ; c &= c-1) {
			count ++ ;
		}
		return count;
	}

	public static int findDiffNum2(int a, int b) {
		int count = 0;
		for (int c = a ^ b ; c != 0 ; c >>= 1) {
			count += c & 1;
		}
		return count;
	}

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		int c = findDiffNum1(a, b);
		int d = findDiffNum2(a, b);
		System.out.println(Integer.toString(c));
		System.out.println(Integer.toString(d));
	}
}

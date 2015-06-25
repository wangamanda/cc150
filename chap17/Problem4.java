public class Problem4{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int res = max(a, b);
		System.out.println(res+"");
	}

	public static int flip(int n) {
		return n ^ 1;
	}

	public static int sign(int n) {
		return flip((n >> 31) & 1);
	}

	public static int max(int a, int b) {
		int sa = sign(a);
		int sb = sign(b);
		int c = a-b;
		int sc = sign(c);

		int sign_a = sa ^ sb;
		int sign_b = flip(sign_a);
		int p = sign_a * sa + sign_b * sc;
		int q = flip(p);
		int res = p * a + q * b;
		return res;
	}
}

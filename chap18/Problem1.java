public class Problem1 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = sumUp(a, b);
		System.out.println(sum);
	}

	public static int sumUp(int a, int b) {
		if(b == 0) {
			return a;
		}
		int sum = a ^ b;
		int carry = ((a & b) << 1);
		return sumUp(sum, carry);
	}
}

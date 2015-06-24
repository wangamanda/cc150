public class Problem1 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		swap(a, b);
		swap_opt(a, b);
	}

	public static void swap(int a, int b) {
		System.out.println(a + " " + b);
		a += b;
		b = a-b;
		a -= b;
		System.out.println(a + " " + b);
	}

	public static void swap_opt(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a + " " + b);
	}
}

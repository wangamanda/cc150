public class Problem6 {
	public static int swapOddEvenBits(int a) {
		int odd = a & 0x55555555;
		int even = a & 0xaaaaaaaa;
		return (odd << 1) | (even >> 1);
	}

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(swapOddEvenBits(a)));
	}
}

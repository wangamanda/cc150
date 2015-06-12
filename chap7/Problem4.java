public class Problem4 {
	public static int substraction(int a, int b) {
		return a + negate(b);
	}

	public static int negate(int a) {
		int neg = 0;
		int inc = a > 0 ? -1 : 1;
		while (a != 0) {
			neg += inc;
			a += inc;
		}
		return neg;
	}

	public static int multiply(int a, int b) {
		int res = 0;
		for (int i = 0 ; i < abs(b) ; i ++ ) {
			res += a;
		}

		if (b < 0) {
			res = negate(res);
		}
		return res;
	}

	public static int abs(int a) {
		if (a >= 0) {
			return a;
		} else {
			return negate(a);
		}
	}

	public static int divide(int a, int b) throws java.lang.ArithmeticException{
		if (b == 0) {
			throw new java.lang.ArithmeticException("Divide zero error");
		}
		if (a == 0) {
			return 0;
		}
		int res = 0;
		int a1 = abs(a);
		int b1 = abs(b);
		while (a1 >= b1) {
			res += 1;
			a1 += negate(b1);
		}
		if (sameFlag(a, b)) {
			return res;
		} else {
			return negate(res);
		}
	}

	public static boolean sameFlag(int a, int b) {
		if (a > 0 && b > 0) {
			return true;
		}

		if (a == 0 && b == 0) {
			return true;
		}

		if (a < 0 && b < 0) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Substraction: "+substraction(a, b));
		System.out.println("Multiply: "+multiply(a, b));
		System.out.println("Division: "+divide(a, b));
	}
}

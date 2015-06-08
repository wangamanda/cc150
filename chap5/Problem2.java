public class Problem2 {
	public static String printBinary(double r) {
		if (r >= 1 || r <= 0) {
			return "ERROR";
		}
		StringBuilder sb = new StringBuilder();
		sb.append(".");
		while (r > 0) {
			if (sb.length() >= 32) {
				return "ERROR";
			}
			r *= 2;
			if (r >= 1) {
				r -= 1;
				sb.append("1");
			} else {
				sb.append("0");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		double r = Double.parseDouble(args[0]);
		String res = printBinary(r);
		System.out.println(res);
	}
}

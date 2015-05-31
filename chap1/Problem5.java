public class Problem5 {
	public static void main(String[] args) {
		String s = compressString(args[0]);
		System.out.println(s);
	}

	public static String compressString(String s) {
		if (s == null || s.length() < 1) {
			return s;
		}

		int num = 1;
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (i = 0 ; i < s.length()-1 ; i ++ ) {
			if (s.charAt(i) == s.charAt(i+1)) {
				num++;
			} else {
				sb.append(s.charAt(i));
				sb.append(String.valueOf(num));
				num = 1;
			}
		}
		sb.append(s.charAt(i));
		sb.append(String.valueOf(num));
		if (sb.length() < s.length()) {
			return sb.toString();
		} else {
			return s;
		}
	}
}

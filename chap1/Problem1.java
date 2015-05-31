public class Problem1 {
	public static void main(String[] args) {
		if (isUnique(args[0])) {
			System.out.println("String s contains only unique characters!");
		} else {
			System.out.println("String s contains duplicate characters!");
		}
	}

	public static boolean isUnique(String s) {
		if (s.length() > 128) {
			return false;
		}

		int n = 0;
		for (int i = 0 ; i < s.length() ; i ++ ) {
			int t = 1 << s.charAt(i);
			if ((n & t) != 0) {
				return false;
			}
			n |= t;
		}
		return true;
	}
}

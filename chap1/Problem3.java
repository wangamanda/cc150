import java.util.Arrays;

public class Problem3 {
	public static void main(String[] args) {
		if (isPermutation(args[0], args[1])) {
			System.out.println("String1 is permutation of String2");
		} else {
			System.out.println("String1 is NOT permutation of String2");
		}
	}

	public static boolean isPermutation(String s1, String s2) {
		if (s1 == null) {
			return s2 == null;
		}

		if (s2 == null) {
			return s1 == null;
		}
		
		if (s1.length() != s2.length()) {
			return false;
		}
		return (sort(s1).equals(sort(s2)));
	}

	public static String sort(String s) {
		char[] str = s.toCharArray();
		Arrays.sort(str);
		return String.valueOf(str);
	}
}

public class Problem8 {
	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		if(isRotation(s1, s2)) {
			System.out.println(s1 + " is rotation of " + s2 + ".");
		} else {
			System.out.println(s1 + " is NOT rotation of " + s2 + ".");
		}
	}

	public static boolean isRotation(String s1, String s2) {
		if(s1 == null || s2 == null) {
			return false;
		}

		if(s1.length() != s2.length()) {
			return false;
		}

		if(s1.equals(s2)) {
			return false;
		}

		s2 += s2;
		if(isSubstring(s1, s2)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isSubstring(String s1, String s2) {
		if(s2.contains(s1)) {
			return true;
		} else {
			return false;
		}
	}
}

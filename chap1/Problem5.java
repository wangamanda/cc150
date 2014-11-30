public class Problem5 {
	public static void main(String[] args) {
		String str = "aabbccdde";
		String s = compress(str);
		System.out.println(s);
	}

	public static String compress(String str) {
		if(str == null) {
			return null;
		}

		if(str.length() < 1) {
			return str;
		}

		int cnt = 1;
		StringBuilder sb = new StringBuilder();
		for(int i = 1 ; i < str.length(); i ++ ) {
			if(str.charAt(i) != str.charAt(i-1)) {
				sb.append(str.charAt(i-1));
				sb.append(cnt);
				cnt = 1;
			} else {
				cnt++;
			}
		}
		sb.append(str.charAt(str.length()-1));
		sb.append(cnt);
		return sb.toString();
	}
}

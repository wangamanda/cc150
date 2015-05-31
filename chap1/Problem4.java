public class Problem4 {
	public static void main(String[] args) {
		String res = replaceString(args[0], args[1]);
		System.out.println(res);
	}

	public static String replaceString(String s, String num) {
		int n = Integer.parseInt(num);
		int start = n-1;
		char[] str = s.toCharArray();
		int end = str.length-1;
		while(start >= 0) {
			if (str[start] == ' ') {
				str[start++] = '%';	
				str[start++] = '2';
				str[start] = '0';			
			} else {
				str[end--] = str[start--];
			}
		}
		s = String.valueOf(str);
		return s;
	}
}

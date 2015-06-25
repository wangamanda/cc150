public class Problem7 {
	private static String[] digits = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	private static String[] teens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	private static String[] tens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninty"};
	private static String[] thousands = {"", "thousand", "million", "billion"};
	
	public static void main(String[] args) {
		String res = numToString(Integer.parseInt(args[0]));
		System.out.println(res);
	}
	
	public static String numToString(int n) {
		String str = "";
		int cnt = 0;
		while(n > 0) {
			if (n % 1000 != 0) {
				str = numToString1000(n % 1000) + " " + thousands[cnt] + " " + str;
			}
			n /= 1000;
			cnt++;
		}
		return str;
	}

	public static String numToString1000(int n) {
		String str = "";
		if (n >= 100) {
			str = digits[n/100 - 1] + " " + "hundred " + str;
			n %= 100;
		}
		if (n >= 11 && n <= 19) {
			str = str + " " + teens[n-11];
		} else {
			if (n >= 20) {
				str = str + " " + tens[n/10 - 1];
				n %= 10;
			}
			if (n == 10) {
				str = str + "ten";
				n -= 10;
			}

			if (n >= 1) {
				str = str + " " + digits[n - 1];
			}
		}
		return str;
	}
}

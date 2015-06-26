public class Problem4 {
	public static void main(String[] args) {
		int cnt = count(Integer.parseInt(args[0]));
		System.out.println(cnt+"");
	}
	
	public static int count(int n) {
		int len = String.valueOf(n).length();
		int cnt = 0;
		for (int i = 0 ; i < len ; i ++ ) {
			cnt += count(n, i);
		}
		return cnt;
	}

	public static int count(int num, int digit) {
		int power = (int)Math.pow(10, digit);
		int nextPower = power * 10;
		int remainder = num % power;
		int down = num - num % nextPower;
		int up = down + nextPower;
		int curDigit = (num / power) % 10;

		if (curDigit < 2) {
			return down / 10;
		} else if (curDigit == 2) {
			return remainder + down/10 + 1;
		} else {
			return up/10;
		}
	}
}

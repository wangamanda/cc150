public class Problem3 {
	public static void main(String[] args) {
		getNextBigger(Integer.parseInt(args[0]));
		getPreviousSmaller(Integer.parseInt(args[0]));
	}

	public static int getPreviousSmaller(int n) {
		int i = 0;
		int c1 = 0;
		int c0 = 0;
		int p = 0;
		while (i <= 31) {
			if (getAt(n, i) == 1) {
				if(c0 > 0) {
					p = i;
					break;
				}
				c1 ++ ;
			} else {
				c0 ++ ;
			}
			i++;
		}
		if (i == 32) {
			System.out.println("No previous smaller number.");
			return -1;
		}
		n &= ~(1 << p);
		c0--;
		c1++;
		n &= ~((1 << p) - 1);
		n |= ((1 << (c1+c0)) - 1) - ((1 << c0) - 1);
		System.out.println("Previous Smaller number:");
		System.out.println(Integer.toBinaryString(n));
		return n;
	}

	public static int getNextBigger(int n) {
		String str = Integer.toBinaryString(n);
		System.out.println(str);
		int i = 0;
		int c1 = 0;
		int c0 = 0;
		int p = 0;
		while (i <= 31) {
			if (getAt(n, i) == 0) {
				if (c1 > 0) {
					p = i;
					break;
				}
				c0 ++ ;
			} else {
				c1 ++ ;
			}
			i++;
		}
		if (i == 32) {
			System.out.println("No next bigger number.");
			return -1;
		}
		n |= (1 << p);
		c1--;
		n &= ~((1 << p)-1);
		if (c1 > 0) {
			n |= ((1 << c1) - 1);
		}
		System.out.println("Next Bigger Number:");
		System.out.println(Integer.toBinaryString(n));
		return n;
	}

	public static int getAt(int n, int i) {
		return (n >> i) & 1;
	}
}

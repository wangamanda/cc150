public class Problem5 {
	public static int shortest(String[] strs, String a, String b) {
		int lastA = -1;
		int lastB = -1;
		int min = Integer.MAX_VALUE;
		for (int i = 0 ; i < strs.length ; i ++ ) {
			if (strs[i].equals(a)) {
				lastA = i;
				int dist = Math.abs(lastA - lastB);
				if(lastB >= 0 && dist < min) {
					min = dist;
				}
			} else if (strs[i].equals(b)) {
				lastB = i;
				int dist = Math.abs(lastA - lastB);
				if(lastA >= 0 && dist < min) {
					min = dist;
				}
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int res = shortest(args, "a", "c");
		System.out.println(res+"");
	}
}

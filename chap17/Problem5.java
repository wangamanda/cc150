public class Problem5 {
	public static void main(String[] args) {
		String guess = args[0];
		String solution = args[1];
		findHit(guess, solution);
	}

	public static void findHit(String a, String b) {
		if (a.length() != 4 || b.length() != 4) {
			System.out.println("Input error");
			return;
		}
		
		int hit = 0;
		int psHit = 0;
		int[] color = new int[4];
		for (int i = 0 ; i <= 3 ; i ++ ) {
			if(a.charAt(i) == b.charAt(i)) {
				hit++;
			}
			switch(a.charAt(i)){
				case 'R':
					color[0]++;
					break;
				case 'Y':
					color[1]++;
					break;
				case 'G':
					color[2]++;
					break;
				case 'B':
					color[3]++;
					break;
				default:
					break;
			}
			switch(b.charAt(i)){
				case 'R':
					color[0]--;
					break;
				case 'Y':
					color[1]--;
					break;
				case 'G':
					color[2]--;
					break;
				case 'B':
					color[3]--;
					break;
				default:
					break;
			}
		}

		for(int i = 0 ; i <= 3 ; i ++ ) {
			if(color[i] > 0) {
				psHit += color[i];
			}
		}
		psHit -= hit;
		System.out.println("hits: "+hit);
		System.out.println("pseudo-hits: "+psHit);
	}
}

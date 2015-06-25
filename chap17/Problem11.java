import java.util.Random;

public class Problem11 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int[] arr = new int[7];
		for (int i = 0 ; i < n ; i ++ ) {
			arr[rand7()]++;
		}
		for (int i = 0 ; i < 7 ; i ++ ) {
			int p = (int)((arr[i] * 100.0f)/n);
			System.out.println(i+": "+arr[i]+" ---- "+p+"%");
		}
	}

	public static int rand7() {
		while (true) {
			int v = rand5() * 5 + rand5();
			if (v < 21) {
				return v % 7;
			}
		}
	}

	public static int rand5() {
		Random rand = new Random();
		return rand.nextInt(5);
	}
}

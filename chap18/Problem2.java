import java.util.Random;

public class Problem2 {
	public static void main(String[] args) {
		int[] arr = new int[52];
		for (int i = 0 ; i < arr.length ; i ++ ) {
			arr[i] = i+1;
		}
		shuffle(arr);
	}

	public static void shuffle(int[] arr){
		Random rand = new Random();
		for (int i = 1 ; i < arr.length ; i ++ ) {
			System.out.print(arr[i] + " ");
			int r = rand.nextInt(i);
			int tmp = arr[i];
			arr[i] = arr[r];
			arr[r] = tmp;
		}
		System.out.println();
		for (int i = 0 ; i < arr.length ; i ++ ) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}

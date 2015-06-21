import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;

public class Problem3 {
	static long n = (long)Integer.MAX_VALUE+1;
	static int[] bitsfield = new int[(int)(n/8)];
	public static int findNotExist() throws FileNotFoundException{
		Scanner scanner = new Scanner(new FileReader("file.txt"));
		while (scanner.hasNextInt()) {
			int m = scanner.nextInt();
			bitsfield[m/8] |= 1 << (m % 8);
		}

		for (int i = 0 ; i < bitsfield.length ; i ++ ) {
			for (int j = 0 ; j < 8 ; j ++ ) {
				if ((bitsfield[i] & (1 << j)) == 0) {
					return i * 8 + j;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {}
}

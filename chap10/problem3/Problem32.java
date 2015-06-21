import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;

public class Problem32 {
	public static int blockNum = 4096;
	public static int arraySize = Integer.MAX_VALUE/blockNum;
	public static int[] blocks = new int[blockNum];
	public static int[] array = new int[arraySize/8];


	public static void main(String[] args) throws FileNotFoundException {
		findMissing();
	}
	public static int findMissing() throws FileNotFoundException{
		int starting = 0;
		Scanner scanner = new Scanner(new FileReader("file.txt"));
		while(scanner.hasNextInt()){
			int n = scanner.nextInt();
			blocks[n/arraySize]++;
		}

		for (int i = 0 ; i < blockNum ; i ++ ) {
			if (blocks[i] < arraySize) {
				starting = arraySize * i;
				break;
			}
		}

		scanner = new Scanner(new FileReader("file.txt"));
		while(scanner.hasNextInt()){
			int n = scanner.nextInt();
			if (n >= starting && n < starting + arraySize) {
				array[(n-starting)/8] |= (1 << ((n-starting) % 8));
			}
		}

		for (int i = 0 ; i < array.length ; i ++ ) {
			for (int j = 0 ; j < 8 ; j ++ ) {
				if ((array[i] & (1 << j)) == 0) {
					return starting + i*8 + j;
				}
			}
		}

		return -1;
	}
}

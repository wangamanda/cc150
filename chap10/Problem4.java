public class Problem4 {
	public static void check(int[] array) {
		BitVector vector = new BitVector(array.length);
		for (int i = 0 ; i < array.length ; i ++ ) {
			int n = array[i];
			if (vector.get(n) != 0) {
				System.out.println(n);
			} else {
				vector.set(n);
			}
		}
	}

	public static void main(String[] args) {
		int[] array = new int[args.length];
		for (int i = 0 ; i < args.length ; i ++ ) {
			array[i] = Integer.parseInt(args[i]);
		}
		check(array);
	}
}

class BitVector {
	int[] bitArray;
	public BitVector(int size) {
		bitArray = new int[(size >> 5)+1];
	}

	public int get(int n) {
		return bitArray[n >> 5] & (1 << (n % 32));
	}

	public void set(int n) {
		bitArray[n >> 5] |= (1 << (n % 32));
	}
}

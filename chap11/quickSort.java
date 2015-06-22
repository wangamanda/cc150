public class quickSort{
	public static void quicksort(int[] array, int left, int right) {
		if (left >= right || left < 0 || right >= array.length) {
			return ;
		}
		int index = quick(array, left, right);
		if (left < index-1) {
			quicksort(array, left, index-1);
		}
		if (index < right) {
			quicksort(array, index, right);
		}
	}

	public static int quick(int[] array, int left, int right) {
		int mid = left + (right - left)/2;
		int pivot = array[mid];
		while (left <= right) {
			while (array[left] < pivot) {
				left ++ ;
			}

			while (array[right] > pivot) {
				right -- ;
			}

			if (left <= right) {
				int tmp = array[left];
				array[left] = array[right];
				array[right] = tmp;
				left ++ ;
				right -- ;
			}
		}
		return left;
	}

	public static void main(String[] args) {
		int[] array = new int[args.length];
		for (int i = 0 ; i < args.length ; i ++ ) {
			array[i] = Integer.parseInt(args[i]);
		}
		quicksort(array, 0, array.length-1);
		for (int i = 0 ; i < array.length ; i ++ ) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}

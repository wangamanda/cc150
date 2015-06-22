public class mergeSort{
	public static void merge(int[] array, int[] helper, int low, int high) {
		if (low < 0 || high >= array.length || low > high) {
			return;
		}

		if (low == high) {
			helper[low] = array[low];
			return;
		}

		if (high - low == 1) {
			if (array[high] < array[low]) {
				helper[high] = array[low];
				helper[low] = array[high];
			}else{
				helper[low] = array[low];
				helper[high] = array[high];
			}
			return;
		}

		int mid = low + (high-low)/2;
		merge(array, helper, low, mid);
		merge(array, helper, mid+1, high);
		for (int m = low ; m <= high ; m ++ ){
			array[m] = helper[m];
		}
		int i = low;
		int j = mid+1;
		int runner = low;
		while (i <= mid && j <= high) {
			if (array[i] <= array[j]) {
				helper[runner++] = array[i++];
			} else {
				helper[runner++] = array[j++];
			}
		}
		while (i <= mid) {
			helper[runner++] = array[i++];
		}
		while(j <= high) {
			helper[runner++] = array[j++];
		}
	}

	public static void main(String[] args) {
		int[] array = new int[args.length];
		for (int i = 0 ; i < args.length ; i ++ ) {
			array[i] = Integer.parseInt(args[i]);
		}
		int[] helper = new int[args.length];
		merge(array, helper, 0, array.length-1);
		for (int i = 0 ; i < helper.length ; i ++ ) {
			System.out.print(helper[i]+" ");
		}
		System.out.println();
	}
}

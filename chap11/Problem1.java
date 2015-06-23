import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Problem1 {
	public static void merge(int[] arr1, int[] arr2, int m, int n) throws FileNotFoundException {
		int i = m-1;
		int j = n-1;
		int cur = m+n-1;
		while (j >= 0) {
			if(i >= 0) {
				if(arr1[i] >= arr2[j]) {
					arr1[cur--] = arr1[i--];
				} else {
					arr1[cur--] = arr2[j--];
				}
			} else {
				arr1[cur--] = arr2[j--];
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader bf = null;
		String line1, line2 = null;
		int[] arr1 = null;
		int[] arr2 = null;
		try{
			bf = new BufferedReader(new FileReader(args[0]));
			line1 = bf.readLine();
			if (line1 != null) {
				System.out.println("first array: "+line1);
				String[] nums = line1.split(" ");
				arr1 = new int[nums.length];
				for (int i = 0 ; i < arr1.length ; i ++ ) {
					arr1[i] = Integer.parseInt(nums[i]);
				}
				Arrays.sort(arr1);
			} else {
				System.out.println("first array null");
			}
			line2 = bf.readLine();
			if (line2 != null) {
				System.out.println("second array: "+line2);
				String[] nums = line2.split(" ");
				arr2 = new int[nums.length];
				for (int i = 0 ; i < arr2.length ; i ++ ) {
					arr2[i] = Integer.parseInt(nums[i]);
				}
				Arrays.sort(arr2);
			} else {
				System.out.println("second array null");
			}
			int[] arr3 = null;
			if(arr1 != null && arr2 != null){
				arr3 = new int[arr1.length + arr2.length];
				for (int i = 0 ; i < arr1.length ; i ++ ){
					arr3[i] = arr1[i];
				}
				merge(arr3, arr2, arr1.length, arr2.length);
				System.out.println("merged array:");
				for (int i = 0 ; i < arr3.length ; i ++ ) {
					System.out.print(arr3[i]+" ");
				}
				System.out.println();
			} else {
				System.out.println("at least one of the arrays is null, can't merge");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

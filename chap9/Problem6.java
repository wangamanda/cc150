import java.util.ArrayList;

public class Problem6 {
	public static ArrayList<String> paranthesis(int n) {
		ArrayList<String> arr = new ArrayList<String>();
		char[] str = new char[2*n];
		paranthesis(arr, n, n, str);
		return arr;
	}

	public static void paranthesis(ArrayList<String> array, int left, int right, char[] str) {
		if (left > right || left < 0) {
			return;
		}
		if (left == 0 && right == 0) {
			array.add(String.valueOf(str));
			return;
		}
		int n = str.length - left - right;
		if(left > 0) {
			str[n] = '(';
			paranthesis(array, left-1, right, str);
		}
		if(right > 0) {
			str[n] = ')';
			paranthesis(array, left, right-1, str);
		}
	}

	public static void main(String[] args) {
		ArrayList<String> arr = paranthesis(Integer.parseInt(args[0]));
		for (int i = 0 ; i < arr.size() ; i ++ ) {
			System.out.println(arr.get(i));
		}
		System.out.println(arr.size()+"");
	}
}

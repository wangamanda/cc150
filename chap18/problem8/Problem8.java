package problem8;

import java.util.HashMap;
import java.util.ArrayList;

public class Problem8 {
	public static void main(String[] args) {
		String str = args[0];
		SuffixTreeNode root = new SuffixTreeNode();
		for (int i = 0 ; i < str.length() ; i ++ ) {
			root.insertString(str.substring(i), i);
		}

		String s = args[1];
		ArrayList<Integer> arr = root.getIndex(s);
		if(arr == null) {
			System.out.println("not found");
			return;
		}
		for (int i = 0 ; i < arr.size() ; i ++ ) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
	}
}

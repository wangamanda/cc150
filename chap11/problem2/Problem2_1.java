import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Problem2_1 {
	public static String sortString(String s) {
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

	public static void sort(String[] strs) {
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		for (String str : strs) {
			String tmp = sortString(str);
			if(!map.containsKey(tmp)) {
				ArrayList<String> arr = new ArrayList<String>();
				map.put(tmp, arr);
			}
			ArrayList<String> arr = map.get(tmp);
			arr.add(str);
		}

		int j = 0;
		for (String str : map.keySet()) {
			ArrayList<String> arr = map.get(str);
			for(int i = 0 ; i < arr.size() ; i ++ ) {
				strs[j++] = arr.get(i);
			}
		}
	}

	public static void main(String[] args) {
		sort(args);
		for (int i = 0 ; i < args.length ; i ++ ) {
			System.out.print(args[i]);
		}
		System.out.println();
	}
}

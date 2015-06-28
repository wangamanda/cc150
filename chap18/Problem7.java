import java.util.HashSet;
import java.util.Arrays;
import java.util.Comparator;

public class Problem7 {
	public static void main(String[] args) {
		String res = findString(args);
		System.out.println(res);
	}

	public static String findString(String[] arr) {
		HashSet<String> set = new HashSet<String>();
		for (String str : arr) {
			set.add(str);
		}
		Arrays.sort(arr, new StringComparator());
		for (int i = 0 ; i < arr.length ; i ++ ) {
			if(compose(arr[i], true, set)) {
				return arr[i];
			}
		}
		return "";
	}

	public static boolean compose(String str, boolean isOriginal, HashSet<String> set) {
		if(set.contains(str) && !isOriginal) {
			return true;
		}
		for (int i = 1 ; i < str.length() ; i ++ ) {
			String cur = str.substring(0, i);
			if (set.contains(cur) && compose(str.substring(i), false, set)){
				return true;
			}
		}
		return false;
	}
}

class StringComparator implements Comparator<String>{
	public int compare(String s1, String s2){
		if(s1.length() < s2.length()){
			return 1;
		} else if (s1.length() == s2.length()) {
			return 0;
		} else {
			return -1;
		}
	}
}

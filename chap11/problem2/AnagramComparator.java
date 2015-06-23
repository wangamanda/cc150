package problem2;

import java.util.Comparator;
import java.util.Arrays;

public class AnagramComparator implements Comparator<String>{
	public int compare(String s1, String s2){
		return sortString(s1).compareTo(sortString(s2));
	}

	private String sortString(String s) {
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
}

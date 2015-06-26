import java.util.HashSet;
import java.util.HashMap;

public class Problem14 {
	private static HashSet<String> dict = new HashSet<String>();
	public static void main(String[] args) {
		String str = "Jess looked just like Tim, her brother.";
		str = clear(str);
		System.out.println(str);
		for (int i = 0 ; i < args.length ; i ++ ) {
			dict.add(args[i]);
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int res = count(str, 0, 0, map);
		System.out.println(res);
	}

	public static int count(String str, int start, int end, HashMap<Integer, Integer> map) {
		if (end >= str.length()) {
			return end-start;
		}
		if(map.containsKey(start)){
			return map.get(start);
		}
		String sub = str.substring(start, end+1);
		int right = count(str, end+1, end+1, map);
		if(!dict.contains(sub)){
			right += sub.length();
		}
		int next = count(str, start, end+1, map);
		int min = Math.min(right, next);
		map.put(start, min);
		return min;
	}

	public static String clear(String str) {
		String[] chars = {"?", ",", ".", "!"};
		str = str.toLowerCase();
		for (String s : chars) {
			str = str.replace(s, " ");
		}
		str = str.replace(" ", "");
		return str;
	}
}

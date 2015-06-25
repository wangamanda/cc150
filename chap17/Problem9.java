import java.util.HashMap;

public class Problem9 {

	public static void main(String[] args) {
		String str = "word";
		int res = getCount(args, str);
		System.out.println(res+"");
	}

	public static HashMap<String, Integer> getMap(String[] words) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String word : words) {
			word = word.toLowerCase();
			word.trim();
			if (word.isEmpty()) {
				continue;
			}
			if(!map.containsKey(word)) {
				map.put(word, 1);
			} else {
				map.put(word, map.get(word)+1);
			}
		}
		return map;
	}

	public static int getCount(String[] words, String str) {
		HashMap<String, Integer> map = getMap(words);
		str = str.toLowerCase();
		str.trim();
		if(map.containsKey(str)){
			return map.get(str);
		} else {
			return -1;
		}
	}
}

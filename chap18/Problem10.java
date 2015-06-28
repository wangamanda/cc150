import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.ArrayList;

public class Problem10 {
	public static void main(String[] args) {
		HashSet<String> dict = new HashSet<String>();
		for (String str : args) {
			str = str.toLowerCase();
			dict.add(str);
		}
		String start = "DAMP";
		String end = "LIKE";
		start = start.toLowerCase();
		end = end.toLowerCase();
		LinkedList<String> res = getPath(start, end, dict);
		if(res.size() == 0) {
			System.out.println("No path");
			return;
		}
		for (String str : res) {
			System.out.print(str+" ");
		}
		System.out.println();
	}

	public static LinkedList<String> getPath(String start, String end, HashSet<String> dict) {
		Queue<String> path = new LinkedList<String>();
		TreeMap<String, String> backTrackMap = new TreeMap<String, String>();
		path.add(start);
		backTrackMap.put(start, null);
		LinkedList<String> arr = new LinkedList<String>();
		HashSet<String> visited = new HashSet<String>();
		while(!path.isEmpty()) {
			String cur = path.poll();
			visited.add(cur);
			for (String str : changeOneBit(cur)) {
				if (str.equals(end)) {
					arr.offer(end);
					backTrackMap.put(end, cur);
					String ss = backTrackMap.get(str);
					while(ss != null) {
						arr.add(0, ss);
						ss = backTrackMap.get(ss);
					}
					return arr;
				} else {
					if(!visited.contains(str) && dict.contains(str)) {
						path.offer(str);
						backTrackMap.put(str, cur);
					}
				}
			}
		}
		return arr;
	}

	public static HashSet<String> changeOneBit(String str) {
		HashSet<String> set = new HashSet<String>();
		if(str == null || str.length() < 1) {
			return set;
		}
		for (int i = 0 ; i < str.length() ; i ++ ) {
			for (char c = 'a' ; c <= 'z' ; c ++ ) {
				char[] word = str.toCharArray();
				if(word[i] != c) {
					word[i] = c;
					set.add(new String(word));
				}
			}
		}
		return set;
	}
}

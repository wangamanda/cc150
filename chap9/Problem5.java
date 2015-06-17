import java.util.ArrayList;

public class Problem5{
	public static ArrayList<String> subset(String str) {
		if (str == null) {
			return null;
		}
		ArrayList<String> res = new ArrayList<String>();
		if (str.length() == 0) {
			res.add("");
			return res;
		}
		if (str.length() == 1) {
			res.add(str);
			return res;
		}
		ArrayList<String> sub = subset(str.substring(1));
		for (String s : sub) {
			ArrayList<String> array = insert(s, str.charAt(0));
			for (String ss : array) {
				res.add(ss);
			}
		}
		return res;
	}

	public static ArrayList<String> insert(String str, char c) {
		ArrayList<String> res = new ArrayList<String>();
		String s = c + str;
		res.add(s);
		for (int i = 1 ; i < str.length() ; i ++ ) {
			s = str.substring(0,i) + c + str.substring(i,str.length());
			res.add(s);
		}
		s = str + c;
		res.add(s);
		return res;
	}

	public static void main(String[] args) {
		ArrayList<String> res = subset(args[0]);
		for (String str : res) {
			System.out.println(str);
		}
		System.out.println(res.size()+"");
	}
}

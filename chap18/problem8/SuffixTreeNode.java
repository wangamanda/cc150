package problem8;

import java.util.HashMap;
import java.util.ArrayList;

public class SuffixTreeNode{
	HashMap<Character, SuffixTreeNode> children = new HashMap<Character, SuffixTreeNode>();
	ArrayList<Integer> index = new ArrayList<Integer>();

	public SuffixTreeNode(){}

	public void insertString(String str, int n) {
		index.add(n);
		if(str == null || str.length() == 0) {
			return;
		}
		SuffixTreeNode child = null;
		char c = str.charAt(0);
		if(children.containsKey(c)) {
			child = children.get(c);
		} else {
			child = new SuffixTreeNode();
			children.put(c, child);
		}
		insertString(str.substring(1), n);
	}

	public ArrayList<Integer> getIndex(String str) {
		if(str == null || str.length() == 0) {
			return index;
		} else {
			char c = str.charAt(0);
			if (children.containsKey(c)){
				return children.get(c).getIndex(str.substring(1));
			}
		}
		return null;
	}
}

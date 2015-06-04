package graph;

import java.util.LinkedList;

public class Node {
	LinkedList<Node> neighbors;
	int val;
	boolean isVisited;

	public Node (int n) {
		val = n;
		neighbors = new LinkedList<Node>();
	}
}

package graph;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Graph {
	List<Node> nodes;
	public Graph (ArrayList<Node> array) {
		nodes = new ArrayList<Node>();
		for (Node node : array) {
			nodes.add(node);
		}
	}

	public boolean isConnected(Node node1, Node node2) {
		if (node1 == node2) {
			return true;
		}
		node1.isVisited = true;
		LinkedList<Node> neighbors = node1.neighbors;
		for (Node node : neighbors) {
			if(node.isVisited) {
				continue;
			}

			if (isConnected(node, node2)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		List<Node> nodes = new ArrayList<Node>();
		Graph graph = new Graph((ArrayList<Node>)nodes);
		FileReader fileReader = null;
		BufferedReader br = null;
		String line = null;
		try{
			fileReader = new FileReader(new File("graph/test.txt"));
			br = new BufferedReader(fileReader);
			line = br.readLine();
			String[] str = line.split(" ");
			for (String s : str) {
				int n = Integer.parseInt(s);
				((ArrayList<Node>)nodes).add(new Node(n));	
			}
			int i = 0;
			while((line = br.readLine()) != null) {
				String[] strs = line.split(" ");
				List<Node> list = new LinkedList<Node>();
				for (String s : strs) {
					if(s.equals("")){
						continue;
					}
					int n = Integer.parseInt(s);
					for (Node nn : nodes) {
						if (nn.val == n) {
							list.add(nn);
						}
					}
				}
				nodes.get(i).neighbors = (LinkedList<Node>)list;
				i++;
			}
			if (graph.isConnected(nodes.get(5), nodes.get(6))) {
				System.out.println("Connected");
			} else {
				System.out.println("NOT Connected");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

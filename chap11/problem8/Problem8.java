package problem8;

public class Problem8 {
	public static void main(String[] args) {
		RankNode root = new RankNode(5);
		for (int i = 0 ; i < args.length ; i ++ ) {
			int n = Integer.parseInt(args[i]);
			root.insert(n);
		}
		int res = root.getRank(13);
		System.out.println(res+"");
	}
}

import java.util.ArrayList;

public class Problem4 {
	public static ArrayList<ArrayList<Integer>> subset(ArrayList<Integer> arr){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		res.add(new ArrayList<Integer>());
		for (int i = 0 ; i < arr.size() ; i ++ ) {
			ArrayList<ArrayList<Integer>> tmp = new ArrayList<ArrayList<Integer>>(res);
			for (ArrayList<Integer> list : tmp) {
				ArrayList<Integer> l = new ArrayList<Integer>(list);
				l.add(arr.get(i));
				res.add(l);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0 ; i < args.length ; i ++ ) {
			arr.add(Integer.parseInt(args[i]));
		}
		ArrayList<ArrayList<Integer>> res = subset(arr);
		for (int i = 0 ; i < res.size() ; i ++ ) {
			ArrayList<Integer> sub = res.get(i);
			for (int j = 0 ; j < sub.size() ; j ++ ) {
				System.out.print(" "+sub.get(j));
			}
			System.out.println();
		}
	}
}

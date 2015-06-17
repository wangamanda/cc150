import java.util.ArrayList;

public class Problem8 {
	public static void represent(ArrayList<ArrayList<Integer>> array, ArrayList<Integer> tmp, int total, int n, int[] money) {
		if (total < 0) {
			return;
		}

		if (total == 0) {
			array.add(new ArrayList<Integer>(tmp));
			return;
		}

		for (int i = n ; i < money.length ; i ++ ) {
			if (total >= money[i]) {
				tmp.add(money[i]);
				represent(array, tmp, total - money[i], i, money);
				tmp.remove(tmp.size()-1);
			}
		}
	} 

	public static void main(String[] args) {
		int[] money = {25, 10, 5, 1};
		ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		int total = Integer.parseInt(args[0]);
		represent(array, tmp, total, 0, money);
		for (int i = 0 ; i < array.size() ; i ++ ) {
			tmp = array.get(i);
			for (int j = 0 ; j < tmp.size() ; j ++ ) {
				System.out.print(tmp.get(j)+" ");
			}
			System.out.println();
		}
		System.out.println("total solution: "+array.size());
	}
}

package chap3;

public class Hanoi {
	public static void main(String[] args) {
		Tower[] towers = new Tower[3];
		for (int i = 0 ; i < 3 ; i ++ ) {
			towers[i] = new Tower(i);
		}
		for (int i = 0 ; i < args.length ; i ++ ) {
			int n = Integer.parseInt(args[i]);
			towers[0].add(n);
		}
		towers[0].moveToDestination(args.length, towers[2], towers[1]);
		while (!towers[2].isEmpty()) {
			System.out.print(towers[2].pop()+" ");
		}
		System.out.println();
	}
}

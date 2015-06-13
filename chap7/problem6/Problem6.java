package problem6;
import java.util.HashMap;
import java.util.ArrayList;

public class Problem6 {
	public static void main(String[] args) {
		HashMap<Line, Integer> map = new HashMap<Line, Integer>();
		ArrayList<Point> points = new ArrayList<Point>();
		for (int i = 0 ; i < args.length ; i ++ ) {
			Double d = Double.parseDouble(args[0]);
			points.add(new Point(d, i*d));
		}
		findLines(points, map);
		int count = 0;
		for (Line l : map.keySet()) {
			System.out.println(l.A + " " + l.B + " " + l.C);
			if (map.get(l) > count) {
				count = map.get(l);
			}
		}
		System.out.println(count+"");
	}

	public static void findLines(ArrayList<Point> points, HashMap<Line, Integer> map) {
		for (int i = 0 ; i < points.size()-1 ; i ++ ) {
			for (int j = i+1 ; j < points.size() ; j ++ ) {
				Line line = new Line(points.get(i), points.get(j));
				boolean flag = false;
				int cnt = 1;
				for (Line l : map.keySet()) {
					if (line.equals(l)) {
						cnt += map.get(l);	
						flag = true;
						map.put(l, cnt);
						break;
					}
				}
				if(flag) {
					continue;
				}
				map.put(line, cnt);
			}
		}
	}
}

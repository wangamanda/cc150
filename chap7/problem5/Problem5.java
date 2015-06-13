package problem5;

public class Problem5 {
	public static void main(String[] args) {
		Point p1 = new Point(-10, 8);
		Point p2 = new Point(-6, 8);
		Point p3 = new Point(-10, 4);
		Point p4 = new Point(-6, 4);
		Square s1 = new Square(p1, p2, p3, p4);
		p1 = new Point(1, 2);
		p2 = new Point(2, 2);
		p3 = new Point(1, 1);
		p4 = new Point(2, 1);
		Square s2 = new Square(p1, p2, p3, p4);
		Point m1 = s1.center();
		Point m2 = s2.center();
		double a = m2.y - m1.y;
		double b = m1.x - m2.x;
		double c = m2.x * m1.y - m1.x * m2.y;
		Line line = new Line(a, b, c);
	}
}

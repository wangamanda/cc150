package problem5;

public class Square {
	Point a, b, c, d;

	public Square (Point x, Point y, Point m, Point n) {
		a = x;
		b = y;
		c = m;
		d = n;
	}

	public Point center() {
		double m = (a.x + b.x)/2;
		double n = (a.y + c.y)/2;
		Point p = new Point(m, n);
		return p;
	}
}

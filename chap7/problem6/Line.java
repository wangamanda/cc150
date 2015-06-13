package problem6;

public class Line {
	double A, B, C;
	double epsilon = 0.000001;

	public Line (double a, double b, double c) {
		A = a;
		B = b;
		C = c;
	}

	public Line (Point p1, Point p2) {
		A = p2.y - p1.y;
		B = p1.x - p2.x;
		C = p2.x * p1.y - p1.x * p2.y;
	}

	public boolean equals(Line line) {
		if (Math.abs(line.A - this.A) < epsilon && Math.abs(line.B - this.B) < epsilon && Math.abs(line.C - this.C) < epsilon) {
			return true;
		}
		return false;
	}
}

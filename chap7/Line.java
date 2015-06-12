public class Line {
	double epsilon = 0.000000000001;
	double slope;
	double intersection;

	public Line (double s, double i) {
		slope = s;
		intersection = i;
	}

	public boolean intersect(Line line) {
		return (Math.abs(slope - line.slope) > epsilon) || (Math.abs(intersection - line.intersection) < epsilon) ;
	}

	public static void main(String[] args) {
		Line line1 = new Line(2, 0.5);
		Line line2 = new Line(2, 1);
		if (line1.intersect(line2)) {
			System.out.println("Intersect");
		} else {
			System.out.println("No");
		}
	}
}

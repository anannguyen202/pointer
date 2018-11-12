
public class Point2d extends Point {

	Point2d() {
		super();
	}

	Point2d(int x, int y) {
		super(x, y);
	}

	public Double distance() {
		Point oxy = new Point2d();
		return distance(oxy);
	}

	public Double distance(Point p) {
		double a = this.getX() - p.getX();
		double b = this.getY() - p.getY();
		return Math.sqrt(a*a + b*b);
	}
}


public abstract class Point implements Print {

	private int x;
	private int y;

	Point() {
		this.x = this.y = 0;
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract Double distance();

	public abstract Double distance(Point p);

	public void print() {
		System.out.println("Distance to Oxy: " + this.distance());
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}

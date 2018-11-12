
public class Point3d extends Point {

	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	Point3d() {
		super();
		this.z = 0;
	}

	Point3d(String name, int x, int y, int z) {
		super(name, x, y);
		this.z = z;
	}

	public Double distance() {
		Point3d xxxx = new Point3d();
		return distance(xxxx);
	}

	public Double distance(Point p) {
		Double res = null;
		try {
			Point3d tmp = (Point3d) p;
			double t1 = this.getX() - tmp.getX();
			double t2 = this.getY() - tmp.getY();
			double t3 = this.getZ() - tmp.getZ();
			res = Math.sqrt(t1 * t1 + t2 * t2 + t3 * t3);
		} catch (Exception ex) {
			// System.out.print("Errrr");
		}
		return res;
	}

}

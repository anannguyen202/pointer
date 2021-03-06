
public class PointMain {

	public static void main(String[] args) {

		Point p1 = new Point2d("A", 3, 7);
		Point p2 = new Point2d("B", 4, 4);
		
		p1.print();
		
		Double d1 = p1.distance(p2);
		System.out.println("Distance between " + p1.getName() + " and " + p2.getName() + " = " + d1);

		Point p3 = new Point3d("C",3, 6, 8);
		Point p4 = new Point3d("D", 3, 78, -9);
		
		p3.print();
		
		d1 = p4.distance(p3);
		if (d1 != null) {
			System.out.print("Distance between A and B = " + d1);
		}
	}

}

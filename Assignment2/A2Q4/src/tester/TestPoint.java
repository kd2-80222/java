package tester;

import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPoint {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("******************************************");
		System.out.print("Enter x-coordinate for Point 1: ");
		double x1 = scanner.nextDouble();
		System.out.print("Enter y-coordinate for Point 1: ");
		double y1 = scanner.nextDouble();
		System.out.print("Enter x-coordinate for Point 2: ");
		double x2 = scanner.nextDouble();
		System.out.print("Enter y-coordinate for Point 2: ");
		double y2 = scanner.nextDouble();

		Point2D p1 = new Point2D(x1, y1);
		Point2D p2 = new Point2D(x2, y2);
		
		System.out.println("******************************************");
		System.out.println("Point 1 details: " + p1.getDetails());
		System.out.println("Point 2 details: " + p2.getDetails());
		System.out.println("******************************************");
		if (p1.isEqual(p2)) {
			System.out.println("Points are at same position.");
		} else {
			double distance = p1.calculateDistance(p2);
			
			System.out.println("Points are not at same position.");
			System.out.println("Distance between Point 1 and Point 2: " + distance);
		}

	}
}
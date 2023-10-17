package com.app.geometry;

public class Point2D {
	private double x;
	private double y;

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String getDetails() {
		return "(" + x + ", " + y + ")";
	}
	
	public boolean isEqual(Point2D P) {
        return this.x == P.x && this.y == P.y;
    }

    public double calculateDistance(Point2D otherPoint) {
        double deltaX = this.x - otherPoint.x;
        double deltaY = this.y - otherPoint.y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }
}
package com.udemy.exercise32.point;

public class Point {

	// two fields (instance variables)
	private int x;
	private int y;

	// empty constructor
	public Point() {
	}

	// constructor
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// getters and setters
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

	// distance method without parameters. 
	//it needs to return the distance between this Point and Point 0,0 as double.
	public double distance() {
		return Math.sqrt((getX() - 0.0) * (getX() - 0.0) + (getY() - 0.0) * (getY() - 0.0));
	}

	// distance method with 2 parameters x and y. 
	//it needs to return the distance between this Point and Point x,y as double.
	public double distance(int x, int y) {

		return Math.sqrt((getX() - x) * (getX() - x) + (getY() - y) * (getY() - y));
	}

	// distance method with parameter another of type Point.  
	//it needs to return the distance between this Point and another Point as double.
	public double distance(Point xy) {
		return Math.sqrt((xy.x - this.x) * (xy.x - this.x) + (xy.y - this.y) * (xy.y - this.y));
	}
}

/*
 * How to find the distance between two points?To find a distance between points
 * A(xA,yA) and B(xB,yB), we use the formula:
 * 
 * d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
 * 
 * Where √ represents square root.
 */
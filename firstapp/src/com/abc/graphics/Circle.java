package com.abc.graphics;

public class Circle {
	private double radius;

	public Circle() {}

	public Circle(double radius) {
		
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double area() {
		return 3.14 *radius *radius;
	}
	
	
	
}

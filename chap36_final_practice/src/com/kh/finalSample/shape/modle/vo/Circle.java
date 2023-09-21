package com.kh.finalSample.shape.modle.vo;

public class Circle {
	
	public static final double PI = 3.14;
	public double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	
	public static double getPi() {
		return PI;
	}
	public void setRadius(double raidus) {
		this.radius = raidus;
	}
	
	
	public void draw() {
		System.out.println(radius);
	}

}

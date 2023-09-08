package com.kh.mvc.circle.mo;

public class CircleModel {
	private double number;
	
	public void setNumber(double number) {
		this.number = number;
	}
	public double circleradius() {
		return number;
	}
	public double incrementRadius() {
		return number+number;
	}
	public double getAreaOfCircle() {
		return number*number*3.14;
	}
}

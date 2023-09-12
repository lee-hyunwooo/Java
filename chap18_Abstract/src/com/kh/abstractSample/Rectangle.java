package com.kh.abstractSample;

public class Rectangle {
	private double width;
	private double height;
	public Rectangle(String color, double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	
	abstract double calculrateArea() {
		return width * height;
	}
	
	
}

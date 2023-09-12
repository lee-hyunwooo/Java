package com.kh.abstractSample;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle("Red",5.0);
		System.out.println("Circle Area : " + circle.calculateArea());
		System.out.println("Circle Color : " + circle.getColor());
		Rectangle r = new Rectangle("blue",4.0,6.0);
		System.out.println("Circle Area : " + r.rectangleArea());
		System.out.println("Circle Color : " + r.getColor());
		
	}

}
	
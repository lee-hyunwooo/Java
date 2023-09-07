package com.kh.overloadingEx;

public class OverSample {
	
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public double sum(double a, double b, double c) {
		return a+b+c;
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public double sum(double a, double b) {
		return a+b;
	}
	
	public int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	public static void main(String[] args) {
		OverSample obj = new OverSample();
		System.out.println(obj.sum(10.5, 20.5));
		System.out.println(obj.sum(1,2,3));
		System.out.println(obj.sum(0.5,1.5,2.5));
		System.out.println(obj.sum(3,7));
		System.out.println(obj.sum(9,8,7,6));
	}

}

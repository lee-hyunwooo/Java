package com.kh.mvc.circle.vo;

import java.util.Scanner;

public class CircleView {
	public double getCircleInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		return sc.nextDouble();
	}
	//public void double displayResult(double result) { //��¾���
	public void displayResult(double result) {
		System.out.println(result);
	}
	public void displayResult2(double result) {
		System.out.println("2 : " + result);
	}
	
	public void displayResult3(double result) {
		System.out.println("3 : " + result);
	}
}

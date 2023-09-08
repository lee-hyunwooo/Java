package com.kh.mvc.circle.vo;

import java.util.Scanner;

public class CircleView {
	public double getCircleInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요");
		return sc.nextDouble();
	}
	//public void double displayResult(double result) { //출력없음
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

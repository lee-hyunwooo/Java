package com.kh.practice.func;

import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double width, height;
		System.out.println("가로길이");
		width = sc.nextDouble();
		System.out.println("세로길이");
		height = sc.nextDouble();
		
		double area = width * height;
		double round = (width + height)*2;
		System.out.println("면적 : " + area);
		System.out.println("둘래 : " + round);
		
		
		
		
		
		
		
		
	}

}

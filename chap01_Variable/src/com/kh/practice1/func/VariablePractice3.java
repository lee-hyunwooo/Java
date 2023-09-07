package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double width, height;
		System.out.println("가로의 길이는 ? ");
	 	System.out.println("세로의 길이는 ? ");
	 
	 width =sc.nextDouble();
	height = sc.nextDouble();
	
	System.out.println("가로 : " + width + "세로" + height);
		
	System.out.println("면적 : " + (width*height));
	System.out.println("둘레 :" + ((width+height)*2));
	
		
		
		
		
		
		
		
	}
}

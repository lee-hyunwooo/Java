package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {
		// 3. 키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력
		/*
		 면적 : 가로 * 세로
	     둘레 : (가로 + 세로) * 2

		 ex.
		 가로 : 13.5
		 세로 : 41.7
	
		 면적 : 562.95
		 둘레 : 110.4
		*/
		Scanner sc = new Scanner(System.in);
		//가로길이, 세로길이
		double width, height;
		
		System.out.println("가로길이 : ");
		width = sc.nextDouble();
		
		System.out.println("세로길이 : ");
		height = sc.nextDouble();
		 
	     
		double area = width * height;         //면적 : 가로 * 세로
		double round = (width + height) * 2; //둘레 : (가로 + 세로) * 2
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + round);
	}

}





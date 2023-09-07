package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력해 주세요. : ");
		int iNum1 = sc.nextInt();
		System.out.println("두번째 정수를 입력해 주세요. : ");
		int iNum2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + iNum1+iNum2);
		System.out.println("빼기 결과 : " + (iNum1-iNum2));
		System.out.println("곱하기 결과 : " + iNum1*iNum2);
		System.out.println("나누기 결과 : " + iNum1/iNum2);
		
		
	}
	
	
}

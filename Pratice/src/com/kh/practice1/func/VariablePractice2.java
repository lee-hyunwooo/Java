package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		// 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫
		/*
			첫 번째 정수 : 23
			두 번째 정수 : 7
			
			더하기 결과 : 30
			빼기 결과 : 16
			곱하기 결과 : 161
			나누기 몫 결과 : 3
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요.");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 결과 : " + (num1 / num2));
		System.out.println("나누기 나머지 결과 : " + (num1 % num2));

	}

}





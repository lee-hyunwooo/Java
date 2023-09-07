package com.kh.practice3;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력해 주세요. ");
		int num1 = sc.nextInt();
		System.out.println("수학점수를 입력해 주세요. ");
		int num2 = sc.nextInt();
		System.out.println("영어점수를 입력해 주세요. ");
		int num3 = sc.nextInt();
		/*  ex. 1
		System.out.println("국어점수 : " + num1);
		System.out.println("수학점수 : " + num2);
		System.out.println("영어점수 : " + num3);
		System.out.println("불합격입니다.");
		*/
	//ex. 2
		System.out.println("국어점수 : " + num1);
		System.out.println("수학점수 : " + num2);
		System.out.println("영어점수 : " + num3);
		System.out.println("국어 : " + num1);
		System.out.println("수학 : " + num2);
		System.out.println("영어 : " + num3);
		System.out.println("합계 : " + (num1+num2+num3));
		System.out.println("평균 : " + ((num1+num2+num3)/3));
		System.out.println("축하합니다, 합격입니다!");
		
		
	}
}	
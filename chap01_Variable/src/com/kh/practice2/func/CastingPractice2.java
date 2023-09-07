package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력해 주세요. : ");
		int a = sc.nextInt();
		System.out.println("영어 점수를 입력해 주세요. : ");
		int b = sc.nextInt();
		System.out.println("수학 점수를 입력해 주세요. : ");
		int c = sc.nextInt();
		
		System.out.println("당신의 국어 점수는 " + a + "점 입니다.");
		System.out.println("당신의 영어 점수는 " + b + "점 입니다.");
		System.out.println("당신의 수학 점수는 " + c + "점 입니다.");
		
		System.out.println("총점은 " + (a+b+c) + "점 입니다.");
		System.out.println("평균은 " + ((a+b+c)/3) + "점 입니다.");
		
		
		
	}

}

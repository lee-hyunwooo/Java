package com.kh.practice3;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 한 개 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if (num % 2 == 0) {//짝수
			System.out.println("짝수다");
	} else if (num % 2 > 0) {//홀수
			System.out.println("홀수다");
	} else if (num < 0) {//음수
		System.out.println("양수만 입력하세요");
	}
			
		
		
		
		
		
	}
}	
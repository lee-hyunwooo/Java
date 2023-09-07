package com.kh.practice3;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~12 사이의 정수 입력 : ");
		
		int month = sc.nextInt();
		
		switch (month) {
		case 1, 2, 12:
			System.out.println("겨울 입니다.");
			break;
		case 3, 4, 5:
			System.out.println("봄 입니다.");
			break;
		case 6, 7, 8:
			System.out.println("여름 입니다.");
			break;
		case 9, 10, 11:
			System.out.println("가을 입니다.");
			break;
		default :
			System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
		
		
	}
}	
package com.kh.practice3.func;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴 번호를 선택해주세요.");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		int choice = sc.nextInt();//번호입력
		
		/** 1. if문 **/
		
		if (choice == 1) {
			System.out.println("입력 메뉴입니다.");
		} else if (choice == 2) {
			System.out.println("수정 메뉴입니다.");
		} else if (choice == 3) {
			System.out.println("조회 메뉴입니다.");
		} else if (choice == 4) {
			System.out.println("삭제 메뉴입니다.");
		} else if (choice == 7) {
			System.out.println("프로그램이 종료됩니다.");
		}
		
		/** 2. switch문 **/
	
		switch(choice) {
		case 1: 
			System.out.println("입력");
			break;
		case 2:
			System.out.println("수정");
			break;
		case 3:
			System.out.println("조회");
			break;
		case 4:
			System.out.println("삭제");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default :
			System.out.println("올바르지 않은 선택입니다.");
		}
		
		
		
		
		
	
	}

}

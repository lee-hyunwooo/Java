package com.kh.practice.exam;

import java.util.Scanner;

public class practice9 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		boolean isTrue = true;//조건 값 만들기 boolean 변수
		while(isTrue) { //1. 조건 추가하기
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			for (int i = 1; i >= 1; i--) {
				System.out.println(i);
			}
			isTrue = false;//2. false 만들기
			break;//if나 switch에서 사용할 수 있다.
			
		}
		
	  }
		
	}

}

package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice4 {



	public static void main(String[] args) {
		/*
		 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면 
		 “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		  */
Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");//한 개의 값을 입력 받는다.
		int num = sc.nextInt(); //사용자로부터 입력받을 수 있는 공간
		boolean isTrue = true;
		while(isTrue) { //1. 조건만들기
			if(num < 1) {//만일 1 미만의 숫자가 입력됐다면 
				//“1 이상의 숫자를 입력해주세요“를 출력
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else { //1 이상인 숫자만 들어온다.
				//1부터 그 숫자까지의 숫자들을 모두 출력하세요.
				for (int i = 1; i >= 1; i--) {
					System.out.println(i);
				}
				//3. 조건 false 만들기
				isTrue = false;
				break; //if나 switch에서 사용할 수 있다.
			}
		}
		
	}
}





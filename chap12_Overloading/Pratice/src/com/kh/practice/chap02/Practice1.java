package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice1 {
	/*
	1번 문제 
	사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	단, 입력한 수는 1보다 크거나 같아야 합니다.
	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");//한 개의 값을 입력 받는다.
		int num = sc.nextInt(); //사용자로부터 입력받을 수 있는 공간
		
		if(num < 1) {//만일 1 미만의 숫자가 입력됐다면 
			//“1 이상의 숫자를 입력해주세요“를 출력
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else { //1 이상인 숫자만 들어온다.
			//1부터 그 숫자까지의 숫자들을 모두 출력하세요.
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
			}
			
		}
		
	}
}











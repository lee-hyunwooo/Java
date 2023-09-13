package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		// 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요
		/*
		 	문자열을 입력하세요 : apple
		
			첫 번째 문자 : a
			두 번째 문자 : p
			세 번째 문자 : p
			apple
	index	01234 = 5자리
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. : ");
		String s = sc.next();
		
		char a = s.charAt(0); //문자를 1자씩 읽음
		System.out.println("index 0번째 자리 : " + a);
		// 한자리씩 보기 때문에 apple 1자가 넘어가 출력을 할 수 없음
		// 자리 위치 정해서 출력하기
		
		char p = s.charAt(1);
		System.out.println("index 1번째 자리 : " + p);
		
		String p2 = s.substring(2,3);
		System.out.println("index 2번째 자리 : " + p2);
		// 한자리가 아니라 자리를 지정해서 출력할 수 있음 
		// 시작만 정해도 되고, 끝을 지정해도 됨
		// 자리 위치 정해서 출력하기
		//시작만 작성할 경우 시작한 인덱스 위치부터 끝까지 출력된다.
		
	}

}




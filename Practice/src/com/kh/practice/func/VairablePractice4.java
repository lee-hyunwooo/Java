package com.kh.practice.func;

import java.util.Scanner;

public class VairablePractice4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. : ");
		String s = sc.next();
		//apple  컴퓨터는 자리를 0부터 시작한다 01234(자릿수)
		
		char a1 = s.charAt(0); //문자를 1자씩 읽음
		System.out.println("index 0번째 자리 : " + a1);
		//한자리씩 보기 때문에 apple 1자가 넘어가 출력을 할 수 없음
		// 자리 위치 정해서 출력하기
		
		char p = s.charAt(1);
		System.out.println("index 1번째 자리 : " + p);
		
		String p2 = s.substring(2,3);//시작과 끝을 지정해서 출력할 수 있다. 
									//ex)s.substring(2,4) apple -> pl
		System.out.println("index 2번째 자리 : " + p2);
		//시작만 정해도 되고 끝을 지정해도 됨
		//시작만 작성할 경우 시작한 인덱스 위치부터 출력
		
	}

}

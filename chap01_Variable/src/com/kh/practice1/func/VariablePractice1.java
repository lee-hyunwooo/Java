package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String name, gender;
		name = sc.next();
		System.out.println("성별을 입력하세요(남/여) : ");
		gender = sc.next();
		System.out.println("나이를 이렵하세요. : ");
		int age = sc.nextInt();
		System.out.println("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		System.out.println("키 " + height + "cm인 " + age + "살 " + gender + " " + name + "님 반갑습니다 ^^");
		
		
		
	}

}

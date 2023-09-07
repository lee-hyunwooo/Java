package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends CalculatorForMod{

	public static void main(String[] args) {
		//게산기
		/*
		CalculatorForMod cal = new CalculatorForMod();
		System.out.println("sum = " + cal.add());
		System.out.println("mul = " + cal.multiply());
		System.out.println("mod = " + cal.mod());
		*/
			//스캐너 이용해서 코드 변경하기
		Scanner sc = new Scanner(System.in);
				
		System.out.println("첫번째 숫자를 입력해주세요");
		int num1 = sc.nextInt();
		System.out.println("두번쨰 숫자를 입력해주세요");
		int num2 = sc.nextInt();
		
		Calculator cal =new Calculator();
		int result1 = cal.add();
		int result2 = cal.substruct();
		int result3 = cal.multiply();
		int result4 = cal.divide();
		System.out.println("Add : " + result1);
		System.out.println("Sub : " + result2);
		System.out.println("mul : " + result3);
		System.out.println("div : " + result4);
		
	}

}

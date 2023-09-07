package com.kh.inheritance.calculator;
//나눈다음 나머지를 구할 수 있는 기능이 추가된 계산기
public class CalculatorForMod extends Calculator {
	
	public int mod(int num1, int num2) { 
		return num1 % num2;
	}
	
}

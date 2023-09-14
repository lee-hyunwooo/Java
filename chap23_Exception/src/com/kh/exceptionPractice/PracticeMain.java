package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain p = new PracticeMain();
			//p.ArithException();
			p.NumFormatException();
	}

	public void ArithException() {
		//int dividend / divisor 나누었을 때 예외처리
		int dividend = 100;
		int divisor = 0;
		try {
		int result = dividend/divisor;
		System.out.println("result : " + result);
	} catch (ArithmeticException e) {
		System.out.println("산술 연산 에러"+e.getMessage());
	}
	}
	
	public void NPException() {
		
		try{
			String text = "Hello World";
			String subText = null;
			int length = text.indexOf(subText);
		} catch(NullPointerException e) {
			System.out.println("글자가 존재하지 않습니다.");
			System.out.println("NullPointerException : " + e.getMessage());
		}
	}
	
	public void NumFormatException() {
		try {
		String text = "123.45";
		int number = Integer.parseInt(text);
		System.out.println(number);
		} catch(NumberFormatException e) {
			System.out.println("int가 아닌 String 으로 인한 오류" +e.getMessage());
		}
		}
	
}

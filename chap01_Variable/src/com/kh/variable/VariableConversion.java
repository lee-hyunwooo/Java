package com.kh.variable;

public class VariableConversion {
	public static void main(String[] args) {
		//1. 자동형변환(암시적형변환, 묵시적형변환)
		int intNum = 100;
		System.out.println(intNum);//숫자 100을 의미
		long longNum = intNum;//int를 long로 자동 형변환
		System.out.println(longNum);
		
		
		float floatNum = 3.14f;
		double doubleNum = floatNum;// float를 double로 자동 형변환
		System.out.println(doubleNum);
		
		//int -> long 변경하는 형변환 2가지 만들고 출력하기
		int intNum1 = 100;
		System.out.print("intNum1 : ");
		System.out.println(intNum1);
		long longNum1 = intNum;
		System.out.println(longNum1);
		
		int intNum2 = 200;
		System.out.print("intNum2 : ");
		System.out.println(intNum2);
		long longNum2 = intNum2;
		System.out.println(longNum2);
		
		//short -> int 변경하는 형변환 1가지 만들고 출력하기
		short shortNum1 = 100;
		System.out.print("shortNum1 : ");
		System.out.println(shortNum1);
		int intNum3 = shortNum1;
		System.out.println(intNum3);
		
		
		//float -> double 변경하는 형변환 1가지 만들고 출력하기
		float floatNum1 = 3.13f;
		System.out.print("floatNum1 : ");
		System.out.println(floatNum1);
		double doubleNum2 = floatNum1;
		System.out.println(doubleNum2);
		
		//2. 명시적 형변환(강제 형변환)
		
		//long -> int
		long largeLong = 12345L;
		System.out.print("largeLong : ");
		System.out.println(largeLong);
		int largeInt = (int) largeLong;
		System.out.println(largeInt); //long을 int로 강제 형변환 할 경우 값이 범위안에 있지 않으면 일부 데이터는 손실된다.
		
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart); //실수를 int로 강제 형변환 할 때 (정수 부분만 유지된다.)
		
		//문자와 숫자간의 형변환 2개 출력
		//문자는 char charBlaue = 'Z'; -> int로 변경
		char charBlaue1 = 'Z';
		System.out.print("charBlaue1 : ");
		System.out.println(charBlaue1);
		int int1 = charBlaue1;
		System.out.println(int1);
		
		char charBlaue2 = 'A';
		System.out.print("charBlaue2 : ");
		System.out.println(charBlaue2);
		int int2 = charBlaue2;
		System.out.println(int2);
		
		
		//double ->int로 형변환 출력 1개
		double double1 = 987.654321;
		System.out.print("double1 : ");
		System.out.println(double1);
		int int3 =(int) double1;
		System.out.println(int3);
		
		//int를 short로 형변환 1개 출력
		int int4 = 123456789;
		System.out.print("int4 : ");
		System.out.println(int4);
		short short3 =(short) int4;
		System.out.println(short3);
		
		
		
	}
}

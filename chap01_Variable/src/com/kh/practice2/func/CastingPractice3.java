package com.kh.practice2.func;

public class CastingPractice3 {

	public static void main(String[] args) {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1/iNum2);//2
		System.out.println(dNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2*dNum);
		
		System.out.println((double)iNum1/iNum2);
		System.out.println(dNum);
		
		System.out.println((int)fNum);
		System.out.println(iNum1/(int)fNum);
		
		System.out.println(iNum1/fNum);
		System.out.println((double)iNum1/fNum);
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println((int)ch+iNum1);
		System.out.println(ch+iNum1);//얘는 모르겠습니다...ㅠㅠ
	}
	

}

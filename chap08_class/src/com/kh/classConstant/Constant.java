package com.kh.classConstant;

public class Constant {
	
	
	// 상수 사용
		private final int c = 1;
		public static final int a = 1; //더 이상 a의 값을 바꾸지 못하게 잠굼
		static final int b = 1;
	
	public static void main(String[] args) {
		
		System.out.println("a의 값 : "+ a);
		System.out.println("b의 값 : "+ b);
		
		
		System.out.println("a의 값 : " + a);
		
	}

}

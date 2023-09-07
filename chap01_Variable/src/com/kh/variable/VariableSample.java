package com.kh.variable;

public class VariableSample {

	public static void main(String[] args) {
	
		String name;
		name = "쿠팡";
		
		int hour = 15;
		double score = 90.5;
		char grade = 'A';
		System.out.println("안녕하세요. 쿠팡입니다. 오늘 15시에 배송됩니다.");
		System.out.println("안녕하세요. " + name +"입니다. " + "오늘 " +hour + "시에 배송됩니다.");
		System.out.println("저의 성적은" + score + "입니다");
		System.out.println(score + " 은 학점 " + grade + " 입니다");
		
		//변수에 이름과 나이와 자신의 성적(double)로 넣기.
		
		String myName = "이현우";
		int age = 27;
		double myScore = 91.4;
		char rank = 'A';
		System.out.println("안녕하세요. 저의 이름은 " + myName + "이고 나이는" + age + "세 입니다. 성적은" + myScore + "이며, 학점으로는 " + rank + "입니다.");
	
		
		
		
	}
}

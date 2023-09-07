package com.kh.example.practice4.model.vo;

public class Student {
	/*
	
	+ Student()
	+ information() : void
	*/
	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	
	//초기화 블럭을 이용해 각 필드를 초기화 초기화 블럭{}
	public Student() {
		{
		grade = 1;//grade 1로 초기화
		classroom = 2;//classroom 2로 초기화
		name = "박성철"; //name 이름 초기화
		height = 180.5;//키 초기화
		gender = '남';//성별 '남'으로 초기화
		}
	}
	public void information() {
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classroom);
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("성별 : " + gender);
	}
	
}

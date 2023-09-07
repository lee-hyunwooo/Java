package com.kh.classSample;

public class Student {
	//1. 멤버변수 ( 학생의 속성)
	String name;
	int age;
	String grade;
	
	/*             생성자          */
	 public Student (String name, int age, String grade) {
		 			//(순서가 이름,나이,학년순으로 선언해뒀기 떄문에 순서가 바뀌면 에러) 
	 
	 	this.name = name;
	 	this.age = age;
	 	this.grade = grade;
	 }
	 //학생 정보 출력 메서드
	 public void displayInfo() {
		 System.out.println("학생 이름 : " + name);
		 System.out.println("나    이 : " + age);
		 System.out.println("학    년 : " + grade);
	 }
	
}

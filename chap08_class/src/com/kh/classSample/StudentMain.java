package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		// 학생의 객체 생성
		Student student1 = new Student("이현우", 27, "1학년");
		// 학생 정보 출력
		student1.displayInfo();
		//Student(class)에 있는 displayInfo()카테고리에서 가져와서 사용
	//학생을 3명 만들어서 3명 출력하기
		//student2, student3, student4
		//각각의 이름과 나이와 학년을 displayinfo();를 사용해서 출력하세요.
		
		Student student2 = new Student("이", 27, "2학년");
		Student student3 = new Student("현", 28, "3학년");
		Student student4 = new Student("우", 29, "4학년");
		
		student2.displayInfo();//위에서 만든 student2가 displayInfo의 내용에 대입하여 출력
		student3.displayInfo();
		student4.displayInfo();
	}

}

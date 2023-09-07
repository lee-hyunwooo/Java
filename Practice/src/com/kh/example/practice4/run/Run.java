package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setGrade(1);
		student.setClassroom(2);
		student.setName("이현우");
		student.setHeight(174);
		student.setGender('남');
		
		student.information();
	
	
	}

}

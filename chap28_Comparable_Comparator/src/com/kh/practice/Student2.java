package com.kh.practice;

import java.util.ArrayList;
import java.util.List;

public class Student2 {

	public static void main(String[] args) {
		// List ArrayList 积己 Comparator 沥府
		List<Student> student = new ArrayList<>();
		student.add(new Student("切积1",17));
		student.add(new Student("切积2",18));
		student.add(new Student("切积3",19));
		
		for (Student people : student) {
			System.out.println(people);
		}
		
	}

}

package com.kh.practice;

import java.util.ArrayList;
import java.util.List;

public class Student2 {

	public static void main(String[] args) {
		// List ArrayList ���� Comparator ����
		List<Student> student = new ArrayList<>();
		student.add(new Student("�л�1",17));
		student.add(new Student("�л�2",18));
		student.add(new Student("�л�3",19));
		
		for (Student people : student) {
			System.out.println(people);
		}
		
	}

}

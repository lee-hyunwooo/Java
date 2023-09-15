package com.kh.student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		//HashMap 생성
		Map<String, Integer> studentGrades = new HashMap<>();

		//학생과 점수를 추가하겠습니다.
		studentGrades.put("KG", 95);
		studentGrades.put("Park", 80);
		studentGrades.put("David", 77);
		studentGrades.put("Bob", 92);
		
		//특정 학생의 성적 검색
		//containsKey : 맵에서 key(키), value(값)이 있는지 확인
		String studentName = "Bob";
		//int studentScore = 1;
		//만약에 학생들 중에서 Bob이 있다면 성적을 보여줘
		if (studentGrades.containsKey(studentName)) {
			int grade = studentGrades.get(studentName);
			System.out.println(studentName + "의 성적 : " + grade);
		} else {
			System.out.println(studentName+ "의 성적을 찾을 수 없습니다.");
		}
		
	}
}

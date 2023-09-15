package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		//Map<String, Integer>
		//		이름    나이
		// contains
		Map<String, Integer> person = new HashMap<>();
		
		person.put("이현우", 27);
		person.put("나행인", 24);
		person.put("이사람", 35);
		
		String personName = "이현우";
		Integer personAge = 27;
		if(person.containsKey(personName)) {
			int age = person.get(personName);
			System.out.println(personName + "의 나이 : " + age +"세 입니다.");
		} else {
			System.out.println(personName + "을 찾을 수 없습니다.");
			
		}
		
		
	}

}

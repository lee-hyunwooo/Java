package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		//Map<String, Integer>
		//		�̸�    ����
		// contains
		Map<String, Integer> person = new HashMap<>();
		
		person.put("������", 27);
		person.put("������", 24);
		person.put("�̻��", 35);
		
		String personName = "������";
		Integer personAge = 27;
		if(person.containsKey(personName)) {
			int age = person.get(personName);
			System.out.println(personName + "�� ���� : " + age +"�� �Դϴ�.");
		} else {
			System.out.println(personName + "�� ã�� �� �����ϴ�.");
			
		}
		
		
	}

}

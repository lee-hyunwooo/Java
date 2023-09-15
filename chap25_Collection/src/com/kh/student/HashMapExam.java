package com.kh.student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		//HashMap ����
		Map<String, Integer> studentGrades = new HashMap<>();

		//�л��� ������ �߰��ϰڽ��ϴ�.
		studentGrades.put("KG", 95);
		studentGrades.put("Park", 80);
		studentGrades.put("David", 77);
		studentGrades.put("Bob", 92);
		
		//Ư�� �л��� ���� �˻�
		//containsKey : �ʿ��� key(Ű), value(��)�� �ִ��� Ȯ��
		String studentName = "Bob";
		//int studentScore = 1;
		//���࿡ �л��� �߿��� Bob�� �ִٸ� ������ ������
		if (studentGrades.containsKey(studentName)) {
			int grade = studentGrades.get(studentName);
			System.out.println(studentName + "�� ���� : " + grade);
		} else {
			System.out.println(studentName+ "�� ������ ã�� �� �����ϴ�.");
		}
		
	}
}

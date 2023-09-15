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
		//containsValue containsKey �� �⺻������ boolean
		System.out.println(studentGrades.containsValue(80));
		System.out.println(studentGrades.containsKey("Bob"));
		//Ư�� �л��� ���� �˻�
		//containsKey : �ʿ��� key(Ű), value(��)�� �ִ��� Ȯ��
		String studentName = "Bob";
		//int studentScore = 1;
		//���࿡ �л��� �߿��� Bob�� �ִٸ� ������ ������
		if (studentGrades.containsKey(studentName)) {//
			int grade = studentGrades.get(studentName);
			System.out.println(studentName + "�� ���� : " + grade);
		} else {
			System.out.println(studentName+ "�� ������ ã�� �� �����ϴ�.");
		}
		
		/*
		 Map.Entry �������̽��� �Բ� ���Ǵ� �������̽�
		 getKey() : ��ü�� Ű�� ��ȯ
		 getValue() : ��ü�� ���� ��ȯ
		 */
		
		//��� �л��� ������ ���
		for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
		//�л����� ����
		String StudentUpdate = "Bob";
		int newGrade = 98;
		studentGrades.put(StudentUpdate, newGrade);
		System.out.println(StudentUpdate + "�� ������ " + newGrade + "�� �����߽��ϴ�");
		
		//�л�����
		String removeStudent = "David";
		studentGrades.remove(removeStudent);
		
		System.out.println(removeStudent + "�� ������ �����߽��ϴ�");
		
		//���� �л� ���� ���
		System.out.println("���� �л� ���� : ");
		for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
				
	}
}

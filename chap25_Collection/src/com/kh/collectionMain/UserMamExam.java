package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserMamExam {

	public static void main(String[] args) {
		//HashMap ���� UserAge
		Map<String, Integer> User = new HashMap<>();
		//������ �̸��� ����
		User.put("GG", 27);
		User.put("KK", 30);
		User.put("TT", 24);
		User.put("QQ", 21);
		User.put("UU", 36);
		//Ư�� ���� �˻�
		String UserName = "GG";
		
		if (User.containsKey(UserName)) {
			int age = User.get(UserName);
			System.out.println(UserName + "�� ���� : " + age);
		} else {
			System.out.println("���� ������ ã�� �� �����ϴ�.");
		}
		//��� ������ ���� ���
			for (Map.Entry<String, Integer> entry : User.entrySet()) {
				String name = entry.getKey();
				int age = entry.getValue();
				System.out.println(name + " : " + age);
			}
		//���� ���� ����
		String UserUpdate = "QQ";
		int UserAge = 29;
		User.put(UserUpdate, UserAge);
		System.out.println(UserUpdate + "�� ���̸� " + UserAge + "�� �����߽��ϴ�.");
		//���� Ż��
		String removeUser = "UU";
		User.remove(removeUser);
		
		System.out.println(removeUser + "�� ������ �����߽��ϴ�.");
		//���� ���� ���
		System.out.println("���� ���� ���� : ");
		for (Map.Entry<String, Integer> entry : User.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}
	}

}

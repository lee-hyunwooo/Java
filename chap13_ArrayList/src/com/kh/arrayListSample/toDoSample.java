package com.kh.arrayListSample;

import java.util.ArrayList;

public class toDoSample {

	public static void main(String[] args) {
		ArrayList<String> toDoList = new ArrayList<>();
		//�����߰��ϱ�
		toDoList.add("����");
		System.out.println(toDoList);
		toDoList.add("��Ա�");
		System.out.println(toDoList);
		toDoList.add("������");
		System.out.println(toDoList);
		
		//�����ϰ�
		System.out.println(toDoList);
		toDoList.set(1, "û��");
		toDoList.set(2, "������");
		System.out.println(toDoList);
		
		//�����
		toDoList.remove(1);
		System.out.println(toDoList);
		
		//��ȸ�ؼ� ������
		for(String aaa : toDoList) {
			System.out.println("���� : " + aaa);
		}
		//�ߺ��� ���� ����
		
		
		
		//���� ����
		toDoList.clear();
		System.out.println(toDoList);
	
	}

}

package com.kh.arrayListSample;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�� ArrayList ����
		ArrayList<String> fruits = new ArrayList<>();
		System.out.println("fruits : " + fruits); //fruits : []
		//����߰�
		fruits.add("���");
		System.out.println("��� �߰�" + fruits);
		fruits.add("�ٳ���");
		System.out.println("�ٳ��� �߰�" + fruits);
		fruits.add("����");
		System.out.println("���� �߰�" + fruits);
		
		// ��� ���� Ȯ��
		int size = fruits.size();
		System.out.println("���� ����� ũ�� : " + size);
		
		//�ε����� ����Ͽ� ��ҿ� ��������
		String firstFruits = fruits.get(0);
		System.out.println("ù��° ���� : " + firstFruits);
		String twoFruits = fruits.get(2);
		System.out.println("�׹�° ���� : " + twoFruits);
		
		//��� ����
		fruits.set(2, "ü��");
		System.out.println("���� üũ : " + fruits);
		
		//��� ����
		fruits.remove(1);
		System.out.println("�ٳ��� ���� Ȯ�� : " + fruits);
		
		// ArrayList ��ȸ�ؼ� ��� ���
		System.out.println("��� ���� ���");
		//for)����� ������Ÿ�� �츮�� ���� ������ : ����� ����ִ� ������)
		for (      String            fruit : fruits)
			System.out.println(fruit);
		//ArrayList ����
		fruits.clear();
		System.out.println("��� ������ ���� : " + fruits);
		
	}

}

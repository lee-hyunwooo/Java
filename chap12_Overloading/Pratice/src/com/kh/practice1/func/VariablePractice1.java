package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {
		// �̸�, ����, ����, Ű�� ����ڿ��� �Է� �޾� ������ ���� ����
		/*
		 �̸��� �Է��ϼ��� : �ƹ���
		������ �Է��ϼ���(��/��) : ��
		���̸� �Է��ϼ��� : 20
		Ű�� �Է��ϼ���(cm) : 180.5
		
		
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���. : ");
		String name = sc.next();
		System.out.println("������ �Է��ϼ���.(��/��) : ");
		String gender = sc.next();
		System.out.println("���̸� �Է��ϼ���. : ");
		int age = sc.nextInt();
		System.out.println("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();
		//					Ű 180.5cm�� 20�� ���� �ƹ����� �ݰ����ϴ�^^
		System.out.println("Ű : " + height + "�� " + age + "�� " + gender + "�� " + name + "�� �ݰ����ϴ�. ^^");

	}

}





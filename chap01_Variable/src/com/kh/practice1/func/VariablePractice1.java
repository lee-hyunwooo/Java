package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name, gender;
		name = sc.next();
		System.out.println("������ �Է��ϼ���(��/��) : ");
		gender = sc.next();
		System.out.println("���̸� �̷��ϼ���. : ");
		int age = sc.nextInt();
		System.out.println("Ű�� �Է��ϼ��� : ");
		double height = sc.nextDouble();
		
		System.out.println("Ű " + height + "cm�� " + age + "�� " + gender + " " + name + "�� �ݰ����ϴ� ^^");
		
		
		
	}

}

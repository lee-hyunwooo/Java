package com.kh.practice.func;

import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���. : ");
		String name = sc.next();
		System.out.println("��.��");
		String gender = sc.next();
		System.out.println("���̸� �Է��ϼ���. : ");
		int age = sc.nextInt();
		System.out.println("Ű�� �Է��ϼ���(cm) : ");
		int height = sc.nextInt();
		System.out.println("Ű : " + height + "��" + age + "��" + gender + " " + name + "�Դϴ�.");
		
		
	}

}

package com.kh.scannersample;

import java.util.Scanner;

public class Scannersample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̸� �Է��� �ּ��� : ");
		int age = sc.nextInt(); //������ �޴� next
		System.out.println("�� ���̴�" + age + "�Դϴ�");
		
		String name, hobby, food, home;
		int phoneNumber;
		
		System.out.print("����� �̸��� �Է��ϼ���. : ");
		name = sc.next(); //������ ���� ���� �ٿ����°͸� ����
		System.out.print("����� ��ȣ�� �Է��ϼ���. : ");
		phoneNumber = sc.nextInt(); //-���� �ʱ�
		
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		System.out.println("����� ��ȭ��ȣ�� " + phoneNumber + "�Դϴ�.");
		
		//�� ��̿� ���� �����ϴ� ���İ� �� �ּ� ����ϱ�
		
		
		System.out.print("����� ��̸� �Է��ϼ���. : ");
		hobby = sc.next();
		System.out.print("����� �����ϴ� ������ �Է��ϼ���. : ");
		food = sc.next();
		System.out.print("����� �ּҸ� �Է��ϼ���. : ");
		home = sc.next();
		
		System.out.println("����� ��̴� " + hobby + "�Դϴ�.");
		System.out.println("����� �����ϴ� ������ " + food + "�Դϴ�");
		System.out.println("����� �ּҴ� " + home + "�Դϴ�.");
		
	}
}

package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��� �ּ���. : ");
		int a = sc.nextInt();
		System.out.println("���� ������ �Է��� �ּ���. : ");
		int b = sc.nextInt();
		System.out.println("���� ������ �Է��� �ּ���. : ");
		int c = sc.nextInt();
		
		System.out.println("����� ���� ������ " + a + "�� �Դϴ�.");
		System.out.println("����� ���� ������ " + b + "�� �Դϴ�.");
		System.out.println("����� ���� ������ " + c + "�� �Դϴ�.");
		
		System.out.println("������ " + (a+b+c) + "�� �Դϴ�.");
		System.out.println("����� " + ((a+b+c)/3) + "�� �Դϴ�.");
		
		
		
	}

}

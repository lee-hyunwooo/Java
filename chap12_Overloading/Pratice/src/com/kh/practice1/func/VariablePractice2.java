package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		// Ű����� ���� �� ���� �Է� �޾� �� ���� ��, ��, ��, �������� ��
		/*
			ù ��° ���� : 23
			�� ��° ���� : 7
			
			���ϱ� ��� : 30
			���� ��� : 16
			���ϱ� ��� : 161
			������ �� ��� : 3
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ������ �Է��ϼ���.");
		int num1 = sc.nextInt();
		System.out.println("�� ��° ������ �Է��ϼ���.");
		int num2 = sc.nextInt();
		
		System.out.println("���ϱ� ��� : " + (num1 + num2));
		System.out.println("���� ��� : " + (num1 - num2));
		System.out.println("���ϱ� ��� : " + (num1 * num2));
		System.out.println("������ �� ��� : " + (num1 / num2));
		System.out.println("������ ������ ��� : " + (num1 % num2));

	}

}





package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ������ �Է��� �ּ���. : ");
		int iNum1 = sc.nextInt();
		System.out.println("�ι�° ������ �Է��� �ּ���. : ");
		int iNum2 = sc.nextInt();
		
		System.out.println("���ϱ� ��� : " + iNum1+iNum2);
		System.out.println("���� ��� : " + (iNum1-iNum2));
		System.out.println("���ϱ� ��� : " + iNum1*iNum2);
		System.out.println("������ ��� : " + iNum1/iNum2);
		
		
	}
	
	
}

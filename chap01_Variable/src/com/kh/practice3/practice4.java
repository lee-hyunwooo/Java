package com.kh.practice3;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~12 ������ ���� �Է� : ");
		
		int month = sc.nextInt();
		
		switch (month) {
		case 1, 2, 12:
			System.out.println("�ܿ� �Դϴ�.");
			break;
		case 3, 4, 5:
			System.out.println("�� �Դϴ�.");
			break;
		case 6, 7, 8:
			System.out.println("���� �Դϴ�.");
			break;
		case 9, 10, 11:
			System.out.println("���� �Դϴ�.");
			break;
		default :
			System.out.println(month + "���� �߸� �Էµ� ���Դϴ�.");
		}
		
		
	}
}	
package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	  /* System.out.println("������ �������ּ���.");
		//int fruit = 3;
		int fruit = sc.nextInt();
		
		switch (fruit) {
		case 1:
			System.out.println("���");
			break;
		case 2:
			System.out.println("����");
			break;
		default :
		} */
		//scanner �� �̿��ؼ� ���ڸ� �����ϴ� switch�� �ϳ� ������ּ���.
		System.out.println("���ڸ� �������ּ���.");
		System.out.println("1. ����������Ĩ");
		System.out.println("2. ��Ϲ���Ĩ");
		System.out.println("3. �����۽�");
		int snack = sc.nextInt();
		switch (snack) {
		case 1:
			System.out.println("����������Ĩ �����ϼ̽��ϴ�");
			break;
		case 2:
			System.out.println("��Ϲ���Ĩ �����ϼ̽��ϴ�.");
			break;
		case 3:
			System.out.println("�����۽� �����ϼ̽��ϴ�.");
			break;
		default :
			System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���");
		
		}
				
				
		/*
		System.out.println("�ֹ��Ͻ� ��ȣ�� �������ּ��� : ");
		System.out.println("1. �Ƹ޸�ī��");
		System.out.println("2. ������Ƽ");
		System.out.println("3. ���ν����");
		
		int choice =sc.nextInt();
		
		switch (choice) {
		
		case 1:
			System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
			break;
		case 2:
			System.out.println("������Ƽ �ֹ��ϼ̽��ϴ�.");
			break;
		case 3:
			System.out.println("���ν���� �ֹ��ϼ̽��ϴ�.");
			break;
		default :
			System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���.");
		}
		*/
		
		
	}

}

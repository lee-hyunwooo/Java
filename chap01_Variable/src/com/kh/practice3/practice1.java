package com.kh.practice3;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
	System.out.println("1. �Է�");
	System.out.println("2. ����");
	System.out.println("3. ��ȸ");
	System.out.println("4. ����");
	System.out.println("7. ����");
	int num1 = sc.nextInt();
	
	switch (num1) {
	case 1:
		System.out.println("�Է� �޴��Դϴ�.");
		break;
	case 2:
		System.out.println("���� �޴��Դϴ�.");
		break;
	case 3:
		System.out.println("��ȸ �޴��Դϴ�.");
		break;
	case 4:
		System.out.println("���� �޴��Դϴ�.");
		break;
	case 7:
		System.out.println("���α׷��� ����˴ϴ�.");
		break;
	default :
		System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���");
	}
	
	
	
	
	
	
	
	
	
	
	}
	
}

package com.kh.practice3;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �� �� �Է��ϼ��� : ");
		
		int num = sc.nextInt();
		
		if (num % 2 == 0) {//¦��
			System.out.println("¦����");
	} else if (num % 2 > 0) {//Ȧ��
			System.out.println("Ȧ����");
	} else if (num < 0) {//����
		System.out.println("����� �Է��ϼ���");
	}
			
		
		
		
		
		
	}
}	
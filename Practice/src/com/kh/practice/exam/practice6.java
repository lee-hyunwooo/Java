package com.kh.practice.exam;

import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num < 1) {//���� 1�̸��� ���ڰ� �Էµǰų�, �Է��� ���� 1���� ũ�ų� ���ƾ��Ѵ�.
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
			}
		}
		
		
		
		
		
	}

}

package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice3 {
/*
 ����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.

 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڷ� �Է��ϼ���.");
		int num = sc.nextInt();
		for (int i = num ;i >= num ; i--) {
			System.out.println(i);
		}
		if(num < 1 ) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
		} else {
		// 		 int i = 1; i <= num; i++
			for (int i = num ;i >= 1 ; i--) {
				System.out.println(i);
			}
			
		}
	}
}











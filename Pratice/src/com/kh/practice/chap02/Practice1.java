package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice1 {
	/*
	1�� ���� 
	����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
	��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
	���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");//�� ���� ���� �Է� �޴´�.
		int num = sc.nextInt(); //����ڷκ��� �Է¹��� �� �ִ� ����
		
		if(num < 1) {//���� 1 �̸��� ���ڰ� �Էµƴٸ� 
			//��1 �̻��� ���ڸ� �Է����ּ��䡰�� ���
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else { //1 �̻��� ���ڸ� ���´�.
			//1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
			}
			
		}
		
	}
}











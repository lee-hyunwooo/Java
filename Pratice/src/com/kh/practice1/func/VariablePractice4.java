package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		// ���� ���ڿ� ���� Ű����� �Է� �޾� ���ڿ��� �տ��� �� ���� ����ϼ���
		/*
		 	���ڿ��� �Է��ϼ��� : apple
		
			ù ��° ���� : a
			�� ��° ���� : p
			�� ��° ���� : p
			apple
	index	01234 = 5�ڸ�
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���. : ");
		String s = sc.next();
		
		char a = s.charAt(0); //���ڸ� 1�ھ� ����
		System.out.println("index 0��° �ڸ� : " + a);
		// ���ڸ��� ���� ������ apple 1�ڰ� �Ѿ ����� �� �� ����
		// �ڸ� ��ġ ���ؼ� ����ϱ�
		
		char p = s.charAt(1);
		System.out.println("index 1��° �ڸ� : " + p);
		
		String p2 = s.substring(2,3);
		System.out.println("index 2��° �ڸ� : " + p2);
		// ���ڸ��� �ƴ϶� �ڸ��� �����ؼ� ����� �� ���� 
		// ���۸� ���ص� �ǰ�, ���� �����ص� ��
		// �ڸ� ��ġ ���ؼ� ����ϱ�
		//���۸� �ۼ��� ��� ������ �ε��� ��ġ���� ������ ��µȴ�.
		
	}

}




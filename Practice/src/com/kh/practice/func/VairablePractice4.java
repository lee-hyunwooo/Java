package com.kh.practice.func;

import java.util.Scanner;

public class VairablePractice4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���. : ");
		String s = sc.next();
		//apple  ��ǻ�ʹ� �ڸ��� 0���� �����Ѵ� 01234(�ڸ���)
		
		char a1 = s.charAt(0); //���ڸ� 1�ھ� ����
		System.out.println("index 0��° �ڸ� : " + a1);
		//���ڸ��� ���� ������ apple 1�ڰ� �Ѿ ����� �� �� ����
		// �ڸ� ��ġ ���ؼ� ����ϱ�
		
		char p = s.charAt(1);
		System.out.println("index 1��° �ڸ� : " + p);
		
		String p2 = s.substring(2,3);//���۰� ���� �����ؼ� ����� �� �ִ�. 
									//ex)s.substring(2,4) apple -> pl
		System.out.println("index 2��° �ڸ� : " + p2);
		//���۸� ���ص� �ǰ� ���� �����ص� ��
		//���۸� �ۼ��� ��� ������ �ε��� ��ġ���� ���
		
	}

}

package com.kh.practice10.func;

public class Practice10 {

	public static void main(String[] args) {
		//�ֹι�ȣ ���ڸ� �������� *ǥ�� ó���ϱ�
		//1.�ֹι�ȣ �����
		String jumin = "123456-1234567";//14�ڸ�
		
		//2.�����ڸ� ���� ��ǥ �����
		String makestar = "*";
		
		//�ֹι�ȣ �����ڸ� ���ĺ��� *�� ������ ���
		//to char Array�� ����ؼ� String -> char Array�� ����
		char[] juminStar = jumin.toCharArray();
		//{'1','2','3','4','5','6','-','1','2','3','4,'5','6','7'}
		for(int a = 8; a <= 13; a++) {//�ε���(�ڸ���) ���� 0���� �����Ѵ�.
			juminStar[a] = '*';
			
		}	
		System.out.println(juminStar);
	}

}

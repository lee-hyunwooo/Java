package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {
		// 3. Ű����� ����, ���� ���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ���
		/*
		 ���� : ���� * ����
	     �ѷ� : (���� + ����) * 2

		 ex.
		 ���� : 13.5
		 ���� : 41.7
	
		 ���� : 562.95
		 �ѷ� : 110.4
		*/
		Scanner sc = new Scanner(System.in);
		//���α���, ���α���
		double width, height;
		
		System.out.println("���α��� : ");
		width = sc.nextDouble();
		
		System.out.println("���α��� : ");
		height = sc.nextDouble();
		 
	     
		double area = width * height;         //���� : ���� * ����
		double round = (width + height) * 2; //�ѷ� : (���� + ����) * 2
		System.out.println("���� : " + area);
		System.out.println("�ѷ� : " + round);
	}

}





package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��� �ּ���. : ");
		int kor = sc.nextInt();
		System.out.println("���� ������ �Է��� �ּ���. : ");
		int eng =sc.nextInt();
		System.out.println("���� ������ �Է��� �ּ���. : ");
		int math =sc.nextInt();
		//������ ����� ������
		int averagesScore = (int) (kor + eng + math);
		int totalScore = (averagesScore / 3);
		System.out.println("�������� = " + kor + ", �������� = " + eng + ", �������� = " + math + ", ����" + averagesScore + ", ������� = " + totalScore);
		
		
		
		
		
	}

}

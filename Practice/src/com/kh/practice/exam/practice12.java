package com.kh.practice.exam;

import java.util.Scanner;

public class practice12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� �Է��ϼ���.");
		int num = sc.nextInt();
		
		System.out.println(num + "��");//Ű����� �� ���ڰ� ������
		for(int i = 1; i <= 9; i++) {
			int result = num * i;
			System.out.println(result);
		}
		
	}

}

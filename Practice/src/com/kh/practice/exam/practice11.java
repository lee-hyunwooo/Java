package com.kh.practice.exam;

import java.util.Scanner;

public class practice11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("ù��° ���ڸ� �Է��ϼ���");
			int start = sc.nextInt();
			System.out.println("�ι�° ���ڸ� �Է��ϼ���");
			int end =sc.nextInt();
			
			int start1 = Math.min(start, end);
			//start���� �� �� ��������� �� �������� ����.
			int end2 = Math.max(start, end);
			//end ���� �� �� ��������� �� ū ���� ����.
		
			
			for (int i = start1; i <= end2; i++) {
				System.out.println(i);
			}
			
			//Math �ڹٿ� ���� Ŭ����
			//min (���� ���� ��) �־��� �ΰ��� ���� �߿��� �� ���� ���� ��ȯ 
			//max (���� ū ��) �־��� �ΰ��� ���� �߿��� �� ū ���� ��ȯ
		/*	int a = 5;
			int b = 8;
			int minValue = Math.min(a, b); //minVaule = 5�� �����
			System.out.println("minValue : " + minValue );
			int maxValue = Math.max(a, b); //maxVaule = 8�� �����
			System.out.println("maxValue : " + maxValue);
		*/
		/*
			int reStart = end; //end�� start���� ���� �� reStart�� �־��ش�
			int reEnd = start; //start�� end���� Ŭ �� reEnd�� �־��ش�.
			System.out.println(start + "����" + end +"���� ����");
			if (start < end) {
				
			for (int i = start; i <= end; i++) {
				System.out.println(i);
			  }
			} else if (reStart < reEnd) {
				System.out.println(start + "����" + end +"���� ����");
			}
				for(int i = reStart; i <= reEnd; i++) {
					System.out.println(i);
		 }
					
		if(start < end) {
			 reStart = start;
			 reEnd = end;
		} else if (end < start) {
			reStart =end;
			reEnd = start;
		}
		for  (int i = reStart; i <= reEnd; i++) {
			System.out.println(i);
		}
		 */
	
	
	
	
	
	
	}

}
